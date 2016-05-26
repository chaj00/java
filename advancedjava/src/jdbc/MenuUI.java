package jdbc;

import java.util.Scanner;
import java.util.Vector;

public class MenuUI {
	MemberDAO dao = new MemberDAO();
	
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		System.out.println("*******회원가입********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("메모:");
		String memo = key.next();
		
		dao.insert(id, pass, name, addr, memo);
	
	}
	public void updateMenu(){
		System.out.println("*******회원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******회원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		
		dao.delete(id);
	
	}
	public void findByAddrMenu(){
		System.out.println("*******회원검색********");
		System.out.print("주소:");
		String addr = key.next();
		
		dao.select(addr);
	
	}
	
	
	public void selectMenu(){
		System.out.println("*******회원조회********");
		dao.select();
	
	}
}


















