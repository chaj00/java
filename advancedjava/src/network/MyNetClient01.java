package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient01 {
	public static void main(String[] args){
		//������ ����ϱ� ���� ���ϰ�ü�� ����
		//==> ip�� port�� �̿��ؼ� ����, ������ ������ ���ϸ� Exception�� �߻���Ų��.
		try {
			Socket socket = new Socket("192.168.9.29", 50000);
			System.out.println("������ ���ӿϷ�..."+socket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
