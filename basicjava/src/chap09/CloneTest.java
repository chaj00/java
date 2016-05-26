package chap09;

public class CloneTest {

	public static void main(String[] args) {
		int[] myarr = new int[]{10,20,30,40,50};
		int myi=10;
		for (int i = 0; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("myi°ª=>"+myi);
		test(myarr,myi);
		System.out.println("**********************");
		for (int i = 0; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("myi°ª=>"+myi);
		
		
	}
	
	public static void test(int[] myarr, int myi){
		int[] testarr = myarr;
		int testi =myi;
		testi=10000;
		testarr[1] =10000;
	}
}
