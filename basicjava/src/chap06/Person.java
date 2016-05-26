package chap06;

public class Person {
	private String name;
	private String addr;
	private int age;
	public Person(){
		System.out.println("기본 생성자");
	}
	public Person(String name, String addr){
		System.out.println("매개 변수 2개 생성자");
		this.name = name;
		this.addr = addr;
		
	}
	public Person(String name, String addr, int age){
		this(name,addr);
		this.age = age;
		System.out.println("매개 변수 3개 생성자");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
