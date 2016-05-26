package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Ŭ���̾�Ʈ�� ������ input/output�۾��� �Ҽ� �ִ� ����
public class MyNetServer02 {

	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� ����ϱ� ���� �ʿ��� ��ü�� �غ�
		Socket client = null;
		//Ŭ���̾�Ʈ�κ��� ���۵Ǵ� �����͸� �б� ���� ��ü
		InputStream in = null;
		DataInputStream dis= null;
		//Ŭ���̾�Ʈ�� �����͸� �����ϱ� ���� ��ü
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�����غ�Ϸ�....");
			while(true){
				//Ŭ���̾�Ʈ�� ������ ���
				client = server.accept();
				
				//Ŭ���̾�Ʈ�� ����ϱ� ���� ��ü�� ����
				//Ŭ���̾�Ʈ�� �����͸� ������ �� �ֵ��� ��ü�� ����
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				//Ŭ���̾�Ʈ���� ���۵Ǵ� �����͸� ���� �� �ֵ��� ��ü ����
				in = client.getInputStream();
				dis = new DataInputStream(in);
				
				//Ŭ���̾�Ʈ���� ������ �����ϱ�
				dos.writeUTF("������ ȯ���մϴ�.");
				dos.writeInt(3000);
				
				String msg1 = dis.readUTF();
				System.out.println(msg1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
