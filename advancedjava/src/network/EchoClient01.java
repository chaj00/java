package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//������ �����ؼ� ������ ������ input/output�ϱ�
public class EchoClient01 {
	public static void main(String[] args) {
		//�������� ������ �����͸� Ű���带 �Է¹��� �� �ִ� ��Ʈ��
		BufferedReader keyin = null;
		//������ �������� �����͸� �е��� �����ϴ� ��Ʈ��
		BufferedReader in = null;
		PrintWriter out = null;
		Socket socket = null;

		try {
			socket = new Socket("192.168.9.43", 12345);
			
			in = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg ="";//�������� ���� �޼���
			String recvMsg = "";//�������� ���� �޼���
			
			while((sendMsg = keyin.readLine())!=null){
				//Ű����� �Է��ϴ� �����͸� ������ ����
				out.println(sendMsg);
				
				//������ �������� �����͸� �о ����ϱ�
				
				recvMsg = in.readLine();
				System.out.println("�������� ���۵� ������>>"+recvMsg);
			}
																
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
