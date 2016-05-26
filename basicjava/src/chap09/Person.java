package chap09;

public class Person implements Cloneable {
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
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		boolean state =false;
		//Person객체끼리 비교 -this와 매개변수로 전달되는 obj
		if(obj!=null & obj instanceof Person){
			Person pobj = (Person)(obj);
			if(this.name.equals(pobj.name) & 
					this.addr.equals(pobj.name) & this.age==pobj.age){
				state =true;
			}
		}
		return state;
	}

	
	@Override
	protected Object clone() {
		Object obj =null;
		try{
			obj=super.clone();
		}catch(CloneNotSupportedException e){
			
		}
		return obj;
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
