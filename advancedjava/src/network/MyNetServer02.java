package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//클라이언트와 간단한 input/output작업을 할수 있는 서버
public class MyNetServer02 {

	public static void main(String[] args) {
		//클라이언트와 통신하기 위해 필요한 객체를 준비
		Socket client = null;
		//클라이언트로부터 전송되는 데이터를 읽기 위한 객체
		InputStream in = null;
		DataInputStream dis= null;
		//클라이언트로 데이터를 전송하기 위한 객체
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("서버준비완료....");
			while(true){
				//클라이언트의 접속을 대기
				client = server.accept();
				
				//클라이언트와 통신하기 위한 객체를 생성
				//클라이언트로 데이터를 전송할 수 있도록 객체를 생성
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				//클라이언트에서 전송되는 데이터를 읽을 수 있도록 객체 생성
				in = client.getInputStream();
				dis = new DataInputStream(in);
				
				//클라이언트에로 데이터 전송하기
				dos.writeUTF("접속을 환영합니다.");
				dos.writeInt(3000);
				
				String msg1 = dis.readUTF();
				System.out.println(msg1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
