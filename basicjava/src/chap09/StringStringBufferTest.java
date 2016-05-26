package chap09;
//StringŬ������ StringBufferŬ������ ��
//���ڿ� �߰� �۾��� String�� StringBuffer�� ǥ���ϰ� ����� ����
//-SystemŬ������ nanoTime()�� �̿��ؼ� ����
public class StringStringBufferTest {

	public static void main(String[] args) {
		final int COUNT = 10000;
		System.out.println("����Ƚ��"+COUNT);
		stringData(COUNT);
		stringBufferData(COUNT);
	}
	public static void stringData(int count){
		//�����Ҷ� ���� �ð��� ����
		long start = System.nanoTime();
		String str = "�ڹ�";
		for (int i=1; i<=count;i++){
			str = str+"java";
		}
		//�۾��� ����ɋ� ���� �ð� ����
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str = str+java");
		System.out.println("�ɸ��ð�:"+time);
	}
	public static void stringBufferData(int count){
		//�����Ҷ� ���� �ð��� ����
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("�ڹ�");
		for (int i=1; i<=count;i++){
			sb.append("java");
		}
		//�۾��� ����ɋ� ���� �ð� ����
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str = str+java");
		System.out.println("�ɸ��ð�:"+time);
		
	}
	

}
