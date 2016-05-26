package homework;

public class Prob1 {
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setId("12345");
		emp.setName("È«±æµ¿");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "ºÀ±Þ = " + emp.getSalary( 30 ) );
		
	}

}
