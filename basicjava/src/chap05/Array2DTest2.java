package chap05;

public class Array2DTest2 {

	public static void main(String[] args) {
		/*
		   	국어      영어    수학
		 1. 100	100	100
		 2. 20	20	20
		 3. 30	30	30
		 4. 40	40	40	 
		 */
		int[][] score = new int[4][3];
		score[0] = new int[]{100,100,100};
		score[1] = new int[]{20,20,20};
		score[2] = new int[]{30,30,30};
		score[3] = new int[]{40,40,40};
		
		System.out.println("       국어\t영어\t수학");
		for(int i=0;i<score.length;i++){
			System.out.print((i+1)+". ");
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
