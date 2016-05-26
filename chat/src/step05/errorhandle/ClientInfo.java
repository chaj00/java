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

//client�� ������ ������ Ŭ����
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
			System.out.println("Ŭ���̾�Ʈ���� ���� ������:"+nickname);
			serverView.taclientlist.append("********"+nickname+"���� �����ϼ̽��ϴ�.********\n");
			
			//���� ����ڵ鿡�� ���ο� ����ڸ� �˸� - ���� �����ڵ鿡�� �˷���
			broadCast("new/"+nickname);
			
			//������ �߰��� ����ڿ��� ���� ����ڸ� �˸�
			for(int i=0; i<clientlist.size();i++){
				ClientInfo user = clientlist.get(i);
				sendMsg("old/"+user.nickname);
			}
			clientlist.add(this);
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
	//������ ��� ����ڿ��� �޼����� �˸��� �޼ҵ�
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
		//Ŭ���̾�Ʈ���� ������ �޼����� ����ؼ� �޾��ִ� �۾�
		while(true){
			try {
				String msg = serverIn.readLine();
				serverView.taclientlist.append(nickname+"�� ���� ���۵� �޼���:" +msg+"\n");
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
					//JOptionPane.showMessageDialog(null, "Ŭ���̾�Ʈ�� ������ ������", 
					//						"�˸�",JOptionPane.ERROR_MESSAGE);
					
					//���Ϳ��� ����
					clientlist.remove(this);			
	
					//������ �޼��� ����ϱ� *****_______Ŭ���̾�Ʈ�� ����*****
					serverView.taclientlist.append(nickname+"���� �����Ͽ����ϴ�."+"\n");
					//��� Ŭ���̾�Ʈ���� �˷��ֱ�
					//    ||
					//    ||____Ŭ���̾�Ʈ JTextArea�� �޼��� ���
					//          JList���� ����
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
		System.out.println("������ ���� Ŭ���̾�Ʈ�� �޼���:"+msg);
		
		token = new StringTokenizer(msg,"/");
		String method = token.nextToken();
		String message = token.nextToken();
		
		if(method.equals("chatting")){
			broadCast(msg+"/"+nickname);
		}
		
		
	}

}