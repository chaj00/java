package chap06;

public class Movie {
	private String title;
	private String genre;
	
	public Movie(){
	}
	public Movie(String title, String genre){
		this.title = title;
		this.genre = genre;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setGenre(String genre){
		this.genre = genre;
	}
	public String getGenre(){
		return this.genre;
	}
	
	public void play(){
		System.out.println(this.title+"("+this.genre+") 상영중입니다.");
	}	
}
