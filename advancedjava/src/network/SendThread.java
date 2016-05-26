package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SendThread extends Thread{
	BufferedReader keyin = null;
	BufferedReader in = null;
	PrintWriter out = null;
	Socket socket = null;
	
	public SendThread(Socket socket){
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
				
				String sendMsg=null;

				while((sendMsg = keyin.readLine())!=null){
						out.println(sendMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
