package chap06;

public class Exam02_0322 {
	public static void main(String[] args) {
		char[][] alphabet = new char[5][5];
		char start='A';		
		//1.배열에 알파벳 입력
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = start;
				start++;
			}
		}
		//2.원본 배열 출력
		System.out.println("\t   원본배열");
		System.out.println("==================================");
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				System.out.print(alphabet[i][j]+"\t");
			}
			System.out.println();
		}

        //3. 배열 수정
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				if(i==j){
					alphabet[i][j] = '*';
				}
			}
		}
		//4. 수정된 배열 출력
		System.out.println();
		System.out.println("\t   수정된 배열");
		System.out.println("==================================");
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				System.out.print(alphabet[i][j]+"\t");
			}
			System.out.println();
		}
	
	}
}
