package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//���� - Ŭ���̾�Ʈ ���������� Ȯ��
public class MyNetServer01 {
	public static void main(String[] args){
		//Ŭ���̾�Ʈ�� ����� ���ֵ��� �غ�
		//==>Ŭ���̾�Ʈ�� ����� �ϱ� ���ؼ� ServerSocket��ü�� ����
		try {
			ServerSocket server = new ServerSocket(50000);
			System.out.println("���� �غ� �Ϸ�....Ŭ���̾�Ʈ ������ ��ٸ�....");
			//Ŭ���̾�Ʈ�� �����Ҷ� ���� ���
			while(true){
				Socket client = server.accept();
				InetAddress ia = client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:"+ia.getHostAddress());
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
