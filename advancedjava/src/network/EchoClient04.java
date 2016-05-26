package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//������ �����ؼ� ������ ������ input/output�ϱ�
public class EchoClient04 {
	public static void main(String[] args) {

		Socket socket = null;

		try {
			socket = new Socket("192.168.9.43", 12345);
			
			SendThread st = new SendThread(socket);
			RecvThread rt =new RecvThread(socket);
			
			st.start();
			rt.start();
																
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
