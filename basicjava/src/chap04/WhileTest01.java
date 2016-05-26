package chap04;

public class WhileTest01 {

	public static void main(String[] args) {
		int i=1;
		while(i<=10){
			System.out.println("자바프로그래밍");
			i++;
		}
		System.out.println("********************");
		int value =1;
		while(true){
			System.out.println("&&&&&&&&");
			value++;
			if(value==10){
				break;
			}
		}
		
	}

}
