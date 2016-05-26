package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//�������� ���۵Ǵ� �����͸� �д� ���� ó���ϴ� ������
public class ClientReceiverThread extends Thread{
	Socket server;

	public ClientReceiverThread(Socket server) {
		super();
		this.server = server;
	}
	
	public void run(){
		try {
			BufferedReader in = new BufferedReader(
							new InputStreamReader(
									server.getInputStream()));
			String reMsg = "";
			while(true){
				reMsg = in.readLine();//������ �Է��ϴ� ������ �б�
				if(reMsg==null){
					break;
				}
				System.out.println("����>>"+reMsg);//����ϱ�
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







