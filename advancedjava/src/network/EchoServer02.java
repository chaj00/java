package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;

//Ŭ���̾�Ʈ�� �����ϴ� �����͸�
public class EchoServer02 {

	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Socket client = null;
		
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�");
			while(true){
				client = server.accept();

				System.out.println(
					client.getInetAddress().getHostAddress()+"���� ����");
				
				in = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				
				out = new PrintWriter(client.getOutputStream(),true);
				
				String sendMsg=null;
				String recvMsg=null;
				
				out.println("�ȳ��ϼ��� Ŭ���̾�Ʈ��?");
				while(true){
					recvMsg = in.readLine();
					if(recvMsg==null){
						break;
					}else if(recvMsg.equals("�ȳ��ϼ���?") |recvMsg.equals("����")){
						sendMsg = client.getInetAddress().getHostAddress()+"�� �ݰ�����";
					}else if(recvMsg.equals("���ó�¥��")){
						Calendar cal=Calendar.getInstance();
						sendMsg = Integer.toString(cal.get(Calendar.YEAR))+"��"
									+ Integer.toString(cal.get(Calendar.MONTH))+"��"
									+ Integer.toString(cal.get(Calendar.DATE))+"��";  
					}else{
						sendMsg = client.getInetAddress()+"�� � ��~~";
					}
					
					out.println(sendMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
