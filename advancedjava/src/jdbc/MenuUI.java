package jdbc;

import java.util.Scanner;
import java.util.Vector;

public class MenuUI {
	MemberDAO dao = new MemberDAO();
	
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		System.out.println("*******ȸ������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�޸�:");
		String memo = key.next();
		
		dao.insert(id, pass, name, addr, memo);
	
	}
	public void updateMenu(){
		System.out.println("*******ȸ������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******ȸ������********");
		System.out.print("���̵�:");
		String id = key.next();
		
		dao.delete(id);
	
	}
	public void findByAddrMenu(){
		System.out.println("*******ȸ���˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		
		dao.select(addr);
	
	}
	
	
	public void selectMenu(){
		System.out.println("*******ȸ����ȸ********");
		dao.select();
	
	}
}


















