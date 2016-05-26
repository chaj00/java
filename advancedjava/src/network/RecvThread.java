package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RecvThread extends Thread{
	BufferedReader keyin = null;
	BufferedReader in = null;
	PrintWriter out = null;
	Socket socket = null;
	
	public RecvThread(Socket socket){
		super();
		this.socket = socket;

	}
	public void run(){
		try {
			while(true){
				in = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				
				out = new PrintWriter(socket.getOutputStream(),true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				
				String recvMsg=null;

				while((recvMsg = in.readLine())!=null){
						System.out.println(recvMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

}
