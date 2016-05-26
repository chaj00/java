package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//������ �����ؼ� ������ ������ input/output�ϱ�
public class MyNetClient04 {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Socket socket = null;

		
		try {
			socket = new Socket("192.168.9.43", 12345);
			
			in = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			
			//**********��Ž���*****************
			String recvMsg = in.readLine();
			System.out.println("�����κ��� ���۵� ������=>"+recvMsg);
			
			out.println("������  �ȳ�~~~~");

			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
