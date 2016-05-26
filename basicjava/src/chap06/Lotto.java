package chap06;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	//자동번호 선택
	public int[][] autoselect(int num){  
		Random rand = new Random();
		int[][] lotto = new int[num][6];
		int tmp =0;
		//번호선택
		System.out.println(num+"장 로또를 자동으로 번호를 선택합니다.");
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				boolean pending=true;
				do{		
					int count =0;
					tmp = rand.nextInt(45)+1;
					//중복번호 체크
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
	//수동 번호선택
	public int [][] manualselect(int num){ 
		int[][] lotto = new int[num][6];
		Scanner sc = new Scanner(System.in);
			for (int i = 0; i < lotto.length; i++) {
				System.out.println((i+1)+"번 게임 로또번호를 입력하세요(1~45,6개입력)");
				boolean pending =true;
				do{
					int count=0;
					lotto[i] = new int[] {0,0,0,0,0,0};
					//번호입력
					for (int j = 0; j < lotto[i].length; j++) {
						lotto[i][j] = sc.nextInt();
					}
					//중복체크 및 입력 범위 체크
					for(int k=0; k<lotto[i].length; k++){
						//중복체크
						for(int m=k+1; m<lotto[i].length;m++){
							if(lotto[i][k]==lotto[i][m]){
								count++;
							}
						}
						//입력 범위 체크
						if(lotto[i][k]<0 | lotto[i][k]>45){
							 count++;
						 }			
					}				
					if(count==0){
						pending =false;
					}else{
						System.out.println("잘못입렵하였습니다.");
						System.out.println((i+1)+"번 게임 로또번호를 다시입력하세요(1~45,6개입력)");
					}
				}while(pending);
				
			}
		return lotto;
	}
	
	//선택번호 출력
	public void lottoprint(int sel, int[][] lotto){   
		char c ='A';
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(c+" ");
			if(sel==1){
				System.out.print("자 동\t");
			}else{
				System.out.print("수 동\t");
			}
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j]+"\t");
			}
			c++;
			System.out.println();
		}
	}
	//당첨번호 확인
	public void wonlotto(){
		Random rand = new Random();
		int[] wonlotto = new int[7];
		int tmp =0;
		//당첨번호선택
		System.out.println("********당첨번호********");
		for (int i = 0; i < wonlotto.length; i++) {
				boolean pending=true;
				do{		
					int count =0;
					tmp = rand.nextInt(45)+1;
					//중복번호 체크
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
		//당첨번호 출력
		for (int i = 0; i < wonlotto.length; i++) {
			if(i!=6){
				System.out.print(wonlotto[i]+"\t");
			}else{
				System.err.println("보너스: "+wonlotto[i]);
			}
		}
		
	}

}
