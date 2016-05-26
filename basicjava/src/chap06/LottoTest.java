package chap06;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lotto lo = new Lotto();
		
		System.out.println("********Lotto********");
		System.out.println("게임수를 선택하세요.(최대5게임)");
		//로또구매
		int num = sc.nextInt();		
		if(num<1 | num>5){
			System.out.println("잘못입력하였습니다.종료합니다.");
			return;
		}
		//자동, 수동
		System.out.println("자동번호선택 1번, 수동번호선택 2번");
		int sel = sc.nextInt();
		
		int[][] lotto = new int[num][6];
		switch(sel){
			case 1: //자동
				lotto = lo.autoselect(num);
				break;
			case 2: //수동
				lotto = lo.manualselect(num);			
				break;
			default :
				System.out.println("잘못입력하였습니다.종료합니다.");
				return;
		}
		
		//출력
		lo.lottoprint(sel,lotto);
		
		//당첨확인
		lo.wonlotto();

	}

}
