package chap06;
//���� ������ �޼ҵ带 ����
public class MyMethod {
	//1. �Ű������� ���� ���� Ÿ���� ���� �޼ҵ�
	public void display(){
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//2. �Ű������� �ְ� ���� Ÿ���� ���� �޼ҵ�
	public void display(String str){
		for (int i = 1; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//3. �Ű������� �ΰ� �ְ� ���� Ÿ���� ���� �޼ҵ�
	public void display(String str, int num){
		for (int i = 1; i <= num; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//4. �Ű����� �ְ� ����Ÿ���� �ִ� �޼ҵ�
	//==> �żҵ� ����ÿ� ����Ÿ���� �ִ� ��� �ݵ�� ������ Ÿ���� ������ �����ؼ�
	//    return��ɹ��� �̿��Ͽ� �����ϴ�.
	//    return ����;
	public int add(int num1, int num2){
		int result=num1+num2;
		return result;
	}
}
