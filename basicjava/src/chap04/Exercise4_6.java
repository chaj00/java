package chap04;

public class Exercise4_6 {

	public static void main(String[] args) {
		int[] adice = new int[6];
		int[] bdice = new int[6];
		int index=0;
		//합이 6인 경우의 수 찾기
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i+j==6){
					adice[index] =i;
					bdice[index] =j;
					index++;
				}
			}
		}
		
		//경우의 수 출력
		System.out.println("A\tB");
		for(int i=0;i<index;i++){
			System.out.println(adice[i]+"\t"+bdice[i]);
		}
	}
}