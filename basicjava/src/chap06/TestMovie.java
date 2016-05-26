package chap06;

public class TestMovie {
 
	public static void main(String[] args) { 
		Movie myMovie = new Movie("어거스트 러쉬", "Drama");
		//myMovie.setTitle("어거스트 러쉬");
		//myMovie.setGenre("Drama");
		myMovie.play();
		
		System.out.println("--------------------");
		
		Movie yourMovie = new Movie("나는 전설이다", "SF");
		//yourMovie.setTitle("나는 전설이다");
		//yourMovie.setGenre("SF");
		yourMovie.play();
	}

}
