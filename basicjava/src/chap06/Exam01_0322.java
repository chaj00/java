package chap06;

public class  Exam01_0322{
	public static void main(String[] args) 	{
		int[] num = new int[]{10, 30, 20, 80, 50} ;
		RateTest r = new RateTest();
		int total =0;
		for (int i = 0; i < num.length; i++) {
			total = total + num[i];
		}		
		r.Rate(num,total,num.length);	
	}
}
