package chap06;

public class Exam02_0322 {
	public static void main(String[] args) {
		char[][] alphabet = new char[5][5];
		char start='A';		
		//1.�迭�� ���ĺ� �Է�
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = start;
				start++;
			}
		}
		//2.���� �迭 ���
		System.out.println("\t   �����迭");
		System.out.println("==================================");
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				System.out.print(alphabet[i][j]+"\t");
			}
			System.out.println();
		}

        //3. �迭 ����
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				if(i==j){
					alphabet[i][j] = '*';
				}
			}
		}
		//4. ������ �迭 ���
		System.out.println();
		System.out.println("\t   ������ �迭");
		System.out.println("==================================");
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				System.out.print(alphabet[i][j]+"\t");
			}
			System.out.println();
		}
	
	}
}
