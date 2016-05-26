package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//서버로 접속해서 서버와 간단한 input/output하기
public class MyNetClient02 {
	public static void main(String[] args) {
		// 서버와 통신하기 위해 필요한 객체를 준비
		Socket socket = null;
		// 서버로부터 전송되는 데이터를 읽기 위한 객체
		InputStream in = null;
		DataInputStream dis = null;
		// 서버로 데이터를 전송하기 위한 객체
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			socket = new Socket("192.168.9.43", 12345);
			
			//서버와 통신 할 수 있는 소켓 객체를 생성 - input
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			
			//서버와 통신할 수 있는 소켓객체를 생성 - output
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			//서버와 통신
			String msg1 = dis.readUTF();
			System.out.println("서버로부터 전송된 데이터1:"+msg1);
			
			int msg2 = dis.readInt();
			System.out.println("서버로부터 전송된 데이터2:"+msg2);
			
			//서버에게 '서버야 안녕' 메세지를 전송
			
			dos.writeUTF("서버야  안녕");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
