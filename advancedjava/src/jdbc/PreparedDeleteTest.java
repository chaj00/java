package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDeleteTest {
	public void delete(String id){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "delete member where id=?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			int result = ptmt.executeUpdate();
			System.out.println(result+"개 행 삭제 성공!!!");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedDeleteTest obj = new PreparedDeleteTest();
		
		System.out.println("********삭제********");
		System.out.print("아이디:");
		String id = sc.next();
		
		obj.delete(id);
	}
}
