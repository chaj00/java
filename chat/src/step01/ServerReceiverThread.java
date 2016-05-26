package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//Ŭ���̾�Ʈ���� ���۵Ǵ� �����͸� �д� ���� ó���ϴ� ������
public class ServerReceiverThread extends Thread{
	Socket client;

	public ServerReceiverThread(Socket client) {
		super();
		this.client = client;
	}
	
	public void run(){
		try {
			BufferedReader in = new BufferedReader(
							new InputStreamReader(
										client.getInputStream()));
			String reMsg = "";
			while(true){
				reMsg = in.readLine();//Ŭ���̾�Ʈ�� �Է��ϴ� ������ �б�
				if(reMsg==null){
					break;
				}
				System.out.println("Ŭ���̾�Ʈ>>"+reMsg);//����ϱ�
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







