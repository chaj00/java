package step03.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

//client의 정보를 저장할 클래스
public class ClientInfo extends Thread {
	InputStream is;
	OutputStream os;
	InputStreamReader isr;
	BufferedReader serverIn;
	PrintWriter serverOut;
	
	Socket client;
	ChatServerView serverView;
	String nickname;
	Vector<ClientInfo> clientlist;	
	
	public ClientInfo(Socket client, ChatServerView serverView,Vector<ClientInfo> clientlist) {
		this.client = client;
		this.serverView = serverView;
		this.clientlist = clientlist;
		ioWork();
	}
	private void ioWork() {
		try{
			is = client.getInputStream();
			isr = new InputStreamReader(is);
			serverIn = new BufferedReader(isr);
			os = client.getOutputStream();
			serverOut = new PrintWriter(os, true);
				
			nickname = serverIn.readLine();
			System.out.println("클라이언트에게 받은 데이터:"+nickname);
			serverView.taclientlist.append("********"+nickname+"님이 입장하셨습니다.********\n");
			
			//기존 사용자들에게 새로운 사용자를 알림 - 현재 접속자들에게 알려줌
			broadCast("new/"+nickname);
			
			//새로이 추가된 사용자에게 기존 사용자를 알림
			for(int i=0; i<clientlist.size();i++){
				ClientInfo user = clientlist.get(i);
				sendMsg("old/"+user.nickname);
			}
			clientlist.add(this);
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
	//벡터의 모든 사용자에게 메세지를 알리는 메소드
	private void broadCast(String msg){
		for(int i=0 ; i<clientlist.size();i++){
			ClientInfo user = clientlist.get(i);
			user.sendMsg(msg);
		}
		
	}
	
	private void sendMsg(String msg) {
		serverOut.println(msg);		
	}
	public void run(){
		//클라이언트에게 들어오는 메세지를 계속해서 받아주는 작업
		while(true){
			try {
				String msg = serverIn.readLine();
				serverView.taclientlist.append(nickname+"로 부터 전송된 메세지:" +msg+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
