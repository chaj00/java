package chap09;

public class WrapperTest {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//5.0��������
		Object obj = null;
		int i = 10;
		Integer in = new Integer(i);
		obj = in;
		
		int data = in.intValue();
		
		//5.0���Ĺ���- �����Ϸ��� ��ȯ�� �ڵ����� ���ش�.
		obj =10000; //�����Ϸ��� �ڵ����� WrapperŬ������ �ش��ϴ� Integer��ü�� ��ȯ�ؼ� obj�� �Ҵ�
		            //Integer��ü�� ��ȯ�ؼ� obj�� �Ҵ�
					//Integer in = new Integer(10000) -����ڽ�
		            //obj = in;
		
		data = in; //�����Ϸ��� �ڵ����� �������� IntegerŬ���� ���ο� ����ִ� int���� ������ ���� = �����ڽ�
		           //data = in.intValue();

	}

}
