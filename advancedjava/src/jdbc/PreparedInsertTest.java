package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
	public void insert(String id, String pass, String name, String addr, String memo){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = 
				"insert into member values(?,?,1000,?,sysdate,?,?) ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, memo);
			int result = ptmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���!!!");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}
	}
	
	public static void main(String[] args) {
		PreparedInsertTest obj = new PreparedInsertTest();
		//Scanner�� �̿��ؼ� ���̵�, �н�����, ����, �ּ�, �޸� �ܺο��� �Է¹޾Ƽ� �޼ҵ带 �����Ҽ� �ֵ��� �����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵�:");
		String id = sc.next();
		System.out.print("�н�����:");
		String pass = sc.next();
		System.out.print("�̸�:");
		String name = sc.next();
		System.out.print("�ּ�:");
		String addr = sc.next();
		System.out.print("�޸�:");
		String memo = sc.next();

		obj.insert(id, pass, name, addr,memo);
	}

}
