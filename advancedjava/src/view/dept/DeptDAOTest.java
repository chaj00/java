package view.dept;
import java.util.Scanner;
public class DeptDAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�μ������ý���********");
		System.out.println("1. �μ����");
		System.out.println("2. �μ���ȸ");
		System.out.println("3. �μ�����");
		System.out.println("4. �μ�Ż��");
		System.out.println("5. ��ġ�� �μ� �˻�");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
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













