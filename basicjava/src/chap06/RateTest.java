package chap06;

public class RateTest {
	public void Rate(int[] num, int total, int length){
		double rate = 0;
		for (int i = 0; i < num.length; i++) {
			rate= (double)(num[i])/total*100;
			for(int j=0;j<rate;j++){
				System.out.print("*");	
			}
			System.out.println("("+rate+")");
		}
	}
}