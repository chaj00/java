package chap05;

public class ArraryExam01 {

	public static void main(String[] args) {
		int[] score = new int[]{77,88,99,100,98,89,100};
		int total =0;
		int avg=0;
		//���հ� ���
		for (int i = 0; i < score.length; i++) {
			total = total + score[i];
		}
		avg=total/score.length;
		
		System.out.println("����=>"+total);
		System.out.println("���=>"+avg);
	}

}
