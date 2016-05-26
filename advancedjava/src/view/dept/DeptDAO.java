package view.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DBMS�� member���̺��� �������� �۾��� �� �� �ֵ��� �ۼ��� Ŭ����
public class DeptDAO {
	public void insert(String deptno, String deptname , String loc, String telNum) {
		String sql = "insert into mydept values(?,?,?,?)";
		Connection con = null;
		PreparedStatement ptmt =null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno );
			ptmt.setString(2, deptname);
			ptmt.setString(3, loc);
			ptmt.setString(4, telNum);
			int result = ptmt.executeUpdate();
			System.out.println(result + "�� �� ���Լ���!!!");
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(null, ptmt, con);
		}
	}

	public void update(String deptno, String loc) {
		String sql = "update mydept set loc= ? where deptno= ?";
		Connection con = null;
		PreparedStatement ptmt =null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, loc);
			ptmt.setString(2, deptno);
			int result = ptmt.executeUpdate();
			System.out.println(result + "�� �� ������Ʈ ����!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(null, ptmt, con);
		}
	}
	
	public void delete(String deptno){
		String sql = "delete mydept where deptno=?";
		Connection con =null;
		PreparedStatement ptmt=null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno);
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
		sql.append("select * from mydept");
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
				
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			rs = ptmt.executeQuery();
			while(rs.next()){
				System.out.print(rs.getString("deptno"));
				System.out.print(rs.getString("deptname"));
				System.out.print(rs.getString("loc"));
				System.out.println(rs.getString("telNum"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(rs, ptmt, con);
		}
	}
	
	public void select(String loc){
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from mydept ");
		sql.append("where loc like ?");
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
				
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setString(1, "%"+loc+"%");
			rs = ptmt.executeQuery();
			while(rs.next()){
				System.out.print(rs.getString("deptno"));
				System.out.print(rs.getString("deptname"));
				System.out.print(rs.getString("loc"));
				System.out.println(rs.getString("telNum"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�������");
		}finally{
			DBUtil.close(rs, ptmt, con);
		}
	}

}
