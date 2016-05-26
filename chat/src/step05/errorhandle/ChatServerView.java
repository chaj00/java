package step05.errorhandle;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class ChatServerView extends JFrame {

	 JPanel contentPane;
	 JTextArea taclientlist;
	 JButton btnchangeport;
	 JButton btnstartServer;
	 JButton btnstop;
	 
	 ServerSocket server;
	 Socket client;
	 
	 BufferedReader in = null;
	 PrintWriter out = null;
	 //접속한 클라이언트에 대한 정보를 저장할 자료구조
	 Vector<ClientInfo> clientlist = new Vector<ClientInfo>();
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatServerView frame = new ChatServerView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatServerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taclientlist = new JTextArea();
		JScrollPane scroll = new JScrollPane(taclientlist);
		scroll.setBounds(12, 50, 472, 415);
		contentPane.add(scroll);
		
		JLabel label = new JLabel("\uC811\uC18D\uC790:");
		label.setFont(new Font("HY견고딕", Font.BOLD, 14));
		label.setBounds(12, 10, 120, 35);
		contentPane.add(label);
		
		btnchangeport = new JButton("\uD3EC\uD2B8\uBCC0\uACBD");
		btnchangeport.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnchangeport.setBounds(516, 50, 129, 35);
		contentPane.add(btnchangeport);
		
		btnstartServer = new JButton("\uC11C\uBC84\uC2DC\uC791");
		btnstartServer.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnstartServer.setBounds(516, 95, 129, 35);
		contentPane.add(btnstartServer);
		
		btnstop = new JButton("\uC11C\uBC84\uC911\uC9C0");
		btnstop.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnstop.setBounds(516, 140, 129, 35);
		contentPane.add(btnstop);
		ChatServerListener listener = new ChatServerListener(this);
		btnstartServer.addActionListener(listener);
		btnstop.addActionListener(listener);
	}
	
	//서버가 클라이언트를 기다릴 수 있도록 소켓을 열어놓고 기다리는 작업
	public void serverStart(int port){
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(server!=null){
			connection();
		}
		
	}
	//사용자의 접속을 받기위한 메소드
	//내부코드가 화면과 별도로 실행되어야 하는 흐름이므로 쓰레드로 만들어 실행한다.
	public void connection(){		
		Thread connectThread = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
					try {
						taclientlist.append("사용자 접속 대기중...\n");
						client = server.accept();
						taclientlist.append("사용자 접속\n");
						
						ClientInfo user = new ClientInfo(client, ChatServerView.this, clientlist);
						user.start();
					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
			}
		});
		connectThread.start();	
	}	
}






