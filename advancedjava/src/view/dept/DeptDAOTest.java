package view.dept;
import java.util.Scanner;
public class DeptDAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******부서관리시스템********");
		System.out.println("1. 부서등록");
		System.out.println("2. 부서조회");
		System.out.println("3. 부서수정");
		System.out.println("4. 부서탈퇴");
		System.out.println("5. 위치로 부서 검색");
		System.out.print("원하는 작업을 선택하세요:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		MenuUI ui = new MenuUI();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.selectMenu();
				break;
			case 3:
				ui.updateMenu();
				break;
			case 4:
				ui.deleteMenu();
				break;
			case 5:
				ui.findByLocMenu();
				break;
		}
	}
}













