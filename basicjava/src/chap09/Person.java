package chap09;

public class Person implements Cloneable {
	private String name;
	private String addr;
	private int age;
	public Person(){
		System.out.println("�⺻ ������");
	}
	public Person(String name, String addr){
		System.out.println("�Ű� ���� 2�� ������");
		this.name = name;
		this.addr = addr;
		
	}
	public Person(String name, String addr, int age){
		this(name,addr);
		this.age = age;
		System.out.println("�Ű� ���� 3�� ������");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		boolean state =false;
		//Person��ü���� �� -this�� �Ű������� ���޵Ǵ� obj
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
