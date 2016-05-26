package chap07.poly;
class A{
	
}
interface InterA{
	void test();
}
interface InterB{
	void test2();
}

class InterChild extends A implements InterA,InterB{

	@Override
	public void test() {
		
		
	}
	@Override
	public void test2() {
		
		
	}
	
}
public interface InterfaceTest {
	public static void main(String[] args){
		A obj1 = new InterChild();
		InterA obj2 = new InterChild();
		InterB obj3 = new InterChild();
	}
}
