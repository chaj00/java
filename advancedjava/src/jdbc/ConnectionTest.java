package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args){
		String url = "jdbc:oracle:thin:@192.168.9.89:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}
		
	}
}
