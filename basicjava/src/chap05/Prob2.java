package chap05;

import java.util.Random;

public class Prob2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] num = new int [5];
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(100)+1;
			System.out.print(num[i]+"\t");
		}
		
	}

}
