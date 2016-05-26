package view.dept;

import java.util.Scanner;
import java.util.Vector;

public class MenuUI {
	DeptDAO dao = new DeptDAO();
	
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		System.out.println("*******부서등록********");
		System.out.print("부서번호:");
		String deptno = key.next();
		System.out.print("부서명:");
		String deptname = key.next();
		System.out.print("위치:");
		String loc = key.next();
		System.out.print("부서전화번호:");
		String telNum = key.next();
		
		dao.insert(deptno, deptname, loc, telNum);
	
	}
	public void updateMenu(){
		System.out.println("*******부서수정********");
		System.out.print("부서번호:");
		String deptno = key.next();
		System.out.print("위치:");
		String loc = key.next();
		
		dao.update(deptno, loc);
	}
	public void deleteMenu(){
		System.out.println("*******부서삭제********");
		System.out.print("부서번호:");
		String deptno = key.next();
		
		dao.delete(deptno);
	
	}
	public void findByLocMenu(){
		System.out.println("*******부서검색********");
		System.out.print("위치:");
		String loc = key.next();
		
		dao.select(loc);
	
	}
	
	
	public void selectMenu(){
		System.out.println("*******부서조회********");
		dao.select();
	
	}
}


















