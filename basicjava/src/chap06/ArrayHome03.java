package chap06;

public class ArrayHome03 {

	public static void main(String[] args) {
		int[] score = new int[]{77,88,99,100,98,89,100};
		int max =0;
		int min=999;
		
		for (int i = 0; i < score.length; i++) {
			max=Math.max(score[i], max);
			min=Math.min(score[i], min);		
		}
		
		System.out.println("최대값=>"+max);
		System.out.println("최소값=>"+min);

	}
}
