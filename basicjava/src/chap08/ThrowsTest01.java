package chap08;
//���� �߻��ϴ� ������ ������ ���ܸ� ó���ϴ� ����
public class ThrowsTest01 {
	//a()�� ���ܹ߻� ���ɼ��� �ִ� �ڵ带 ������ �ִ� �޼ҵ�� ����
	//==> ���ܰ� �߻��ϸ� ������  a()���� ó��
	public int a(int num1, int num2){
		System.out.println("********a()ȣ��********");
		int result=0;
		try{
			System.out.println("������");
			result =num1/num2;
			System.out.println("����Ϸ�");
		}catch(ArithmeticException e){
			result =100000; //������ �߻��ϸ� ������ result�� 10000�� �Ҵ�
		}
		return result;
	}
	//a()�� ȣ���ϴ� b()�� ����
	public void b(int num1,int num2){
		System.out.println("********b()ȣ��********");
		int result = a(num1,num2);
		System.out.println("a()ȣ����===>"+result);
	}
	//a()�� ȣ���ϴ� c()�� ����
		public void c(int num1,int num2){
			System.out.println("********c()ȣ��********");
			int result = a(num1,num2);
			System.out.println("a()ȣ����===>"+result);
		}
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		
		obj.b(1000,0);
		obj.c(10, 0);
		
		

	}

}
