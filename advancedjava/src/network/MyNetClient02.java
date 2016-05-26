package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//������ �����ؼ� ������ ������ input/output�ϱ�
public class MyNetClient02 {
	public static void main(String[] args) {
		// ������ ����ϱ� ���� �ʿ��� ��ü�� �غ�
		Socket socket = null;
		// �����κ��� ���۵Ǵ� �����͸� �б� ���� ��ü
		InputStream in = null;
		DataInputStream dis = null;
		// ������ �����͸� �����ϱ� ���� ��ü
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			socket = new Socket("192.168.9.43", 12345);
			
			//������ ��� �� �� �ִ� ���� ��ü�� ���� - input
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			
			//������ ����� �� �ִ� ���ϰ�ü�� ���� - output
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			//������ ���
			String msg1 = dis.readUTF();
			System.out.println("�����κ��� ���۵� ������1:"+msg1);
			
			int msg2 = dis.readInt();
			System.out.println("�����κ��� ���۵� ������2:"+msg2);
			
			//�������� '������ �ȳ�' �޼����� ����
			
			dos.writeUTF("������  �ȳ�");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
