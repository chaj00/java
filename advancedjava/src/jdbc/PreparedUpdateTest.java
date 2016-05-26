package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedUpdateTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedUpdateTest obj = new PreparedUpdateTest();
		System.out.println("********수정********");
		System.out.print("아이디:");
		String id = sc.next();
		System.out.print("변경할 주소:");
		String addr = sc.next();
		
		obj.update(id, addr);
	}
	
	public void update(String id, String addr){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update member set addr= ? where id= ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			int result = ptmt.executeUpdate();
			System.out.println(result+"개 행 업데이트 성공!!!");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}	
}
