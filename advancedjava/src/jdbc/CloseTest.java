package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");
		Connection con =null;
		Statement stmt = null;
		ResultSet rs = null;
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql.toString());
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
		}finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
