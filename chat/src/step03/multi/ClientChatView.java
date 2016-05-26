package step03.multi;

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
	 
	 //��Ʈ��ũ�� ����� �۾��� �����ϱ� ���� ������ ����
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
		btnsend.setFont(new Font("HY�߰��", Font.BOLD, 14));
		btnsend.setBounds(402, 395, 109, 35);
		contentPane.add(btnsend);
		
		JLabel lblNewLabel = new JLabel("\uC811\uC18D\uC790:");
		lblNewLabel.setFont(new Font("HY�߰��", Font.BOLD, 14));
		lblNewLabel.setBounds(519, 10, 120, 35);
		contentPane.add(lblNewLabel);
		
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
			//���������� �޼����� ������ - nickname
			sendMsg(nickname);
			
			nicknamelist.add(nickname);
			
			//������ �������� �޼����� �޴� �κ��� ������� ó��
			Thread inThread = new Thread(new Runnable(){
				@Override
				public void run() {
					//ä�����α׷��� Ư���� Ŭ���̾�Ʈ�� ��� ������ �� �����Ƿ� �޴� �κ��� ���ѷ�����
					while(true){
						try {
							String msg = clientIn.readLine();
							System.out.println("�����κ��� ���ŵ� �޼���>>"+msg);
							inputMessage(msg); //������ ���۵Ǿ� ������ �����͸� ����
						} catch (IOException e) {
							e.printStackTrace();
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
		}else if(method.equals("old")){
			nicknamelist.add(message);
			lstconnect.setListData(nicknamelist);
		}
	}
	
	//������ ����� �� �ִ� ��Ʈ���� ����
	private void ioWork(){
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			clientIn = new BufferedReader(isr); //Ŭ�� ������ ������ �޼����� ������ �ִ� ��Ʈ������
			os =socket.getOutputStream();
			clientOut = new PrintWriter(os, true);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//������ �޼����� ������ �޼ҵ带 ����
	public void sendMsg(String msg){
		System.out.println("Ŭ���̾�Ʈ�� ��������:"+msg);
		clientOut.println(msg);
	}
}
