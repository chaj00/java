package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSelectTest {
	public void select(){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(sql.toString());
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()){
				System.out.print(rs.getString("id"));
				System.out.print(rs.getString("pass"));
				System.out.print(rs.getInt("point"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getDate("hiredate"));
				System.out.print(rs.getString("addr"));
				System.out.println(rs.getString("memo"));	
			}
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PreparedSelectTest obj = new PreparedSelectTest();
		System.out.println("********Á¶È¸********");
		obj.select();
	}
}
