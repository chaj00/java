package step05.errorhandle;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ClientChatView extends JFrame {

	 JPanel contentPane;
	 JTextField txtinput;
	 JTextArea taChat;
	 JButton btnsend;
	 JList lstconnect;
	 
	 Socket socket;
	 
	 String ip;
	 int port;
	 String nickname;
	 
	 //네트워크상에 입출력 작업을 수행하기 위한 변수를 선언
	 InputStream is;
	 OutputStream os;
	 InputStreamReader isr;
	 BufferedReader clientIn;
	 PrintWriter clientOut;
	 
	 Vector<String> nicknamelist = new Vector<String>();
	 StringTokenizer token;
	 
	/**
	 * Launch the application.
	 */
	 /*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientChatView frame = new ClientChatView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ClientChatView(String ip, int port, String nickname) {
		this.ip = ip;
		this.port = port;
		this.nickname =nickname;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		taChat = new JTextArea();
		JScrollPane scroll = new JScrollPane(taChat);
		scroll.setBounds(12, 10, 501, 375);
		contentPane.add(scroll);
	
		
		txtinput = new JTextField();
		txtinput.setBounds(12, 395, 378, 35);
		contentPane.add(txtinput);
		txtinput.setColumns(10);
		
		btnsend = new JButton("\uC11C\uBC84\uB85C\uC804\uC1A1");
		btnsend.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnsend.setBounds(402, 395, 109, 35);
		contentPane.add(btnsend);
		
		JLabel lblinfo = new JLabel("\uC811\uC18D\uC790:");
		lblinfo.setFont(new Font("HY견고딕", Font.BOLD, 14));
		lblinfo.setBounds(519, 10, 120, 35);
		lblinfo.setText(lblinfo.getText()+nickname);
		contentPane.add(lblinfo);
		
		lstconnect = new JList();
		lstconnect.setBounds(525, 47, 205, 108);
		contentPane.add(lstconnect);
		
		setVisible(true);
		connection();
		
		ClientChatListener listener = new ClientChatListener(this);
		txtinput.addActionListener(listener);
		btnsend.addActionListener(listener);
		
	}
	public void connection(){
		try {
			socket = new Socket(ip,port);
			if(socket!=null){
				ioWork();
			}
			//서버쪽으로 메세지를 보내기 - nickname
			sendMsg(nickname);
			
			nicknamelist.add(nickname);
			lstconnect.setListData(nicknamelist);
			//서버가 보내오는 메세지를 받는 부분을 쓰레드로 처리
			Thread inThread = new Thread(new Runnable(){
				@Override
				public void run() {
					//채팅프로그램의 특성상 클라이언트가 계속 전송할 수 있으므로 받는 부분은 무한루프로
					while(true){
						try {
							String msg = clientIn.readLine();
							System.out.println("서버로부터 수신된 메세지>>"+msg);
							inputMessage(msg); //서버로 전송되어 들어오는 데이터를 조작
						} catch (IOException e) {
							e.printStackTrace();
							
							try {
								os.close();
								is.close();
								isr.close();
								clientIn.close();
								clientOut.close();
								socket.close();
								JOptionPane.showMessageDialog(null, "서버와 전속이 끊어짐", 
														"알림",JOptionPane.ERROR_MESSAGE);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							break;
						}
					}
				}

				
			});
			inThread.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private void inputMessage(String msg) {
		token = new StringTokenizer(msg, "/");
		String method = token.nextToken();
		String message = token.nextToken();
		System.out.println(method +","+message);
		if(method.equals("new")){
			nicknamelist.add(message);
			lstconnect.setListData(nicknamelist);
			taChat.append("********"+message+"님이 입장하였습니다.********\n");
		}else if(method.equals("old")){
			nicknamelist.add(message);
			lstconnect.setListData(nicknamelist);
		}else if(method.equals("chatting")){
			String nickname = token.nextToken();
			taChat.append(nickname+">>"+message+"\n");
		}else if(method.equals("leave")){
			for(int i=0; i<nicknamelist.size();i++){
				if(nicknamelist.get(i).equals(message)){
					nicknamelist.remove(i);
				}
			}
			for(int i=0; i<nicknamelist.size();i++){
				System.out.println(nicknamelist.get(i));
			}
			taChat.append("********"+message+"님이 퇴장하였습니다.********\n");
			lstconnect.setListData(nicknamelist);
		}
	}
	
	//서버와 통신할 수 있는 스트림을 생성
	private void ioWork(){
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			clientIn = new BufferedReader(isr); //클이 서버가 보내는 메세지를 읽을수 있는 스트림생성
			os =socket.getOutputStream();
			clientOut = new PrintWriter(os, true);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//서버로 메세지를 보내는 메소드를 정의
	public void sendMsg(String msg){
		System.out.println("클라이언트가 서버에게:"+msg);
		clientOut.println(msg);
	}
}
