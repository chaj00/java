package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DBMS�� member���̺��� �������� �۾��� �� �� �ֵ��� �ۼ��� Ŭ����
public class MemberDAO {
	public void insert(String id, String pass, String name, String addr, String memo) {
		String sql = "insert into member values(?,?,1000,?,sysdate,?,?) ";
		Connection con = null;
		PreparedStatement ptmt =null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, memo);
			int result = ptmt.executeUpdate();
			System.out.println(result + "�� �� ���Լ���!!!");
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(null, ptmt, con);
		}
	}

	public void update(String id, String addr) {
		String sql = "update member set addr= ? where id= ?";
		Connection con = null;
		PreparedStatement ptmt =null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			int result = ptmt.executeUpdate();
			System.out.println(result + "�� �� ������Ʈ ����!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(null, ptmt, con);
		}
	}
	
	public void delete(String id){
		String sql = "delete member where id=?";
		Connection con =null;
		PreparedStatement ptmt=null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			int result = ptmt.executeUpdate();
			System.out.println(result+"�� �� ���� ����!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(null, ptmt, con);
		}
	}
	public void select(){
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
				
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			rs = ptmt.executeQuery();
			while(rs.next()){
				System.out.print(rs.getString("id"));
				System.out.print(rs.getString("pass"));
				System.out.print(rs.getInt("point"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getDate("hiredate"));
				System.out.print(rs.getString("addr"));
				System.out.println(rs.getString("memo"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(rs, ptmt, con);
		}
	}
	
	public void select(String addr){
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member ");
		sql.append("where addr like ?");
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
				
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setString(1, "%"+addr+"%");
			rs = ptmt.executeQuery();
			while(rs.next()){
				System.out.print(rs.getString("id"));
				System.out.print(rs.getString("pass"));
				System.out.print(rs.getInt("point"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getDate("hiredate"));
				System.out.print(rs.getString("addr"));
				System.out.println(rs.getString("memo"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(rs, ptmt, con);
		}
	}

}
