package step05.errorhandle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JOptionPane;

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
	StringTokenizer token;
	
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
				clientInMsg(msg,nickname);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				try {
					os.close();
					is.close();
					isr.close();
					serverIn.close();
					serverOut.close();
					client.close();
					//JOptionPane.showMessageDialog(null, "클라이언트와 접속이 끊어짐", 
					//						"알림",JOptionPane.ERROR_MESSAGE);
					
					//벡터에서 뺴끼
					clientlist.remove(this);			
	
					//서버에 메세지 출력하기 *****_______클라이언트가 퇴장*****
					serverView.taclientlist.append(nickname+"님이 퇴장하였습니다."+"\n");
					//모든 클라이언트에게 알려주기
					//    ||
					//    ||____클라이언트 JTextArea에 메세지 출력
					//          JList에서 제거
					broadCast("leave/"+nickname);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			}
		}
	}
	private void clientInMsg(String msg, String nickname) {
		System.out.println("서버가 받은 클라이언트의 메세지:"+msg);
		
		token = new StringTokenizer(msg,"/");
		String method = token.nextToken();
		String message = token.nextToken();
		
		if(method.equals("chatting")){
			broadCast(msg+"/"+nickname);
		}
		
		
	}

}
