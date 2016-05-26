package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = 
				"insert into member values('lee', '1234',1000,'�̼���',sysdate, '�����', '���ִ�.' ) ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"�� �� ���Լ���!!!");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}
	}
}
