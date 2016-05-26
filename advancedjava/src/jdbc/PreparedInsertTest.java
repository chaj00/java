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
			System.out.println(result+"개 행 삽입성공!!!");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결실패");
		}
	}
	
	public static void main(String[] args) {
		PreparedInsertTest obj = new PreparedInsertTest();
		//Scanner를 이용해서 아이디, 패스워드, 성명, 주소, 메모를 외부에서 입력받아서 메소드를 실행할수 있도록 수정하기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디:");
		String id = sc.next();
		System.out.print("패스워드:");
		String pass = sc.next();
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("주소:");
		String addr = sc.next();
		System.out.print("메모:");
		String memo = sc.next();

		obj.insert(id, pass, name, addr,memo);
	}

}
