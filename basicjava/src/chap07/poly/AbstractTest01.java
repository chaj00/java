package chap07.poly;
/*
 * abstractŬ������ �߻� Ŭ����=> �߻�޼ҵ带 �����ϴ� Ŭ����
 *   => �Ϲݸ޼ҵ�, �߻�޼ҵ� ��� ���ǰ� ����
 *   => �߻�޼ҵ尡 ���ǵǾ� �ִ� Ŭ������ new���� ������ �� �l�� Ŭ����
 *      �ݵ�� abstractŰ���带 class���𹮿��� �߰��ؾ��Ѵ�.
 *   =>abstractŬ������ ��ӹ޴� ����Ŭ���������� �ݵ�� abstract�޼ҵ带 ������ �ϵ��� ���������� �˷��ְ��ִ�.
 *   [�߻�޼ҵ�]
 *   �޼ҵ� body�� ���� �޼ҵ�
 */
abstract class Parent{
	public void tet(){
		System.out.println("test");
	}
	public abstract void display();
}
class child extends Parent{

	@Override
	public void display() {
	}
	
}
public class AbstractTest01{
	public static void main(String[] args){
		
	}
}