package chap06;

public class TestMovie {
 
	public static void main(String[] args) { 
		Movie myMovie = new Movie("��Ž�Ʈ ����", "Drama");
		//myMovie.setTitle("��Ž�Ʈ ����");
		//myMovie.setGenre("Drama");
		myMovie.play();
		
		System.out.println("--------------------");
		
		Movie yourMovie = new Movie("���� �����̴�", "SF");
		//yourMovie.setTitle("���� �����̴�");
		//yourMovie.setGenre("SF");
		yourMovie.play();
	}

}
