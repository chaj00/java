package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//서버로 접속해서 서버와 간단한 input/output하기
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
