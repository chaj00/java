package homework;

public class Emp {
	private String id;
	private String name;
	private int baseSalary;
	
	public Emp(){
	}
	public Emp(String id, String name, int baseSalary){
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public double getSalary(double bonus){
		return baseSalary +baseSalary*bonus; 		
	}
	public String toString(){
		String str =this.name+"("+this.id+") 사원의 기본급은"+baseSalary+"원입니다.";
		return str; 
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
}
