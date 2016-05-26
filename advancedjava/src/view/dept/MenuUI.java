package view.dept;

import java.util.Scanner;
import java.util.Vector;

public class MenuUI {
	DeptDAO dao = new DeptDAO();
	
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		System.out.println("*******�μ����********");
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		System.out.print("�μ���:");
		String deptname = key.next();
		System.out.print("��ġ:");
		String loc = key.next();
		System.out.print("�μ���ȭ��ȣ:");
		String telNum = key.next();
		
		dao.insert(deptno, deptname, loc, telNum);
	
	}
	public void updateMenu(){
		System.out.println("*******�μ�����********");
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		System.out.print("��ġ:");
		String loc = key.next();
		
		dao.update(deptno, loc);
	}
	public void deleteMenu(){
		System.out.println("*******�μ�����********");
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		
		dao.delete(deptno);
	
	}
	public void findByLocMenu(){
		System.out.println("*******�μ��˻�********");
		System.out.print("��ġ:");
		String loc = key.next();
		
		dao.select(loc);
	
	}
	
	
	public void selectMenu(){
		System.out.println("*******�μ���ȸ********");
		dao.select();
	
	}
}


















