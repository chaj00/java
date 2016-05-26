package chap06;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	//�ڵ���ȣ ����
	public int[][] autoselect(int num){  
		Random rand = new Random();
		int[][] lotto = new int[num][6];
		int tmp =0;
		//��ȣ����
		System.out.println(num+"�� �ζǸ� �ڵ����� ��ȣ�� �����մϴ�.");
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				boolean pending=true;
				do{		
					int count =0;
					tmp = rand.nextInt(45)+1;
					//�ߺ���ȣ üũ
					for (int k = 0; k <= j; k++) {
						if(lotto[i][k]==tmp){
							count++;
						}
					}
					if(count==0){
						pending=false;
					}
				} while(pending);
				
				lotto[i][j] = tmp;
			}
		}
		return lotto;
	}
	//���� ��ȣ����
	public int [][] manualselect(int num){ 
		int[][] lotto = new int[num][6];
		Scanner sc = new Scanner(System.in);
			for (int i = 0; i < lotto.length; i++) {
				System.out.println((i+1)+"�� ���� �ζǹ�ȣ�� �Է��ϼ���(1~45,6���Է�)");
				boolean pending =true;
				do{
					int count=0;
					lotto[i] = new int[] {0,0,0,0,0,0};
					//��ȣ�Է�
					for (int j = 0; j < lotto[i].length; j++) {
						lotto[i][j] = sc.nextInt();
					}
					//�ߺ�üũ �� �Է� ���� üũ
					for(int k=0; k<lotto[i].length; k++){
						//�ߺ�üũ
						for(int m=k+1; m<lotto[i].length;m++){
							if(lotto[i][k]==lotto[i][m]){
								count++;
							}
						}
						//�Է� ���� üũ
						if(lotto[i][k]<0 | lotto[i][k]>45){
							 count++;
						 }			
					}				
					if(count==0){
						pending =false;
					}else{
						System.out.println("�߸��Է��Ͽ����ϴ�.");
						System.out.println((i+1)+"�� ���� �ζǹ�ȣ�� �ٽ��Է��ϼ���(1~45,6���Է�)");
					}
				}while(pending);
				
			}
		return lotto;
	}
	
	//���ù�ȣ ���
	public void lottoprint(int sel, int[][] lotto){   
		char c ='A';
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(c+" ");
			if(sel==1){
				System.out.print("�� ��\t");
			}else{
				System.out.print("�� ��\t");
			}
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j]+"\t");
			}
			c++;
			System.out.println();
		}
	}
	//��÷��ȣ Ȯ��
	public void wonlotto(){
		Random rand = new Random();
		int[] wonlotto = new int[7];
		int tmp =0;
		//��÷��ȣ����
		System.out.println("********��÷��ȣ********");
		for (int i = 0; i < wonlotto.length; i++) {
				boolean pending=true;
				do{		
					int count =0;
					tmp = rand.nextInt(45)+1;
					//�ߺ���ȣ üũ
					for (int k = 0; k <= i; k++) {
						if(wonlotto[i]==tmp){
							count++;
						}
					}
					if(count==0){
						pending=false;
					}
				} while(pending);
				
				wonlotto[i] = tmp;
			}
		//��÷��ȣ ���
		for (int i = 0; i < wonlotto.length; i++) {
			if(i!=6){
				System.out.print(wonlotto[i]+"\t");
			}else{
				System.err.println("���ʽ�: "+wonlotto[i]);
			}
		}
		
	}

}
