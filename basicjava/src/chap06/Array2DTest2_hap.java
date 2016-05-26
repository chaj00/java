package chap06;

public class Array2DTest2_hap {
	public static void main(String[] args) {
		/*
		   	����      ����    ����
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
		//�迭 ���
		System.out.println("       ����\t����\t����");
		for(int i=0;i<score.length;i++){
			System.out.print((i+1)+". ");
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		//�л��� ���հ��
		int[] hap = new int[]{0,0,0,0};
		int[] avg = new int[]{0,0,0,0};
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				hap[i]= hap[i]+score[i][j];
			}
			avg[i]=hap[i]/score[i].length;
		}
		//���
		System.out.println("        ����\t���");
		for(int i=0;i<hap.length;i++){
			System.out.println((i+1)+". "+hap[i]+"\t"+avg[i]);
		}
	}
}
