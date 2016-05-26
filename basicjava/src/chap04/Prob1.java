package chap04;

public class Prob1 {

	public static void main(String[] args) {
		int count =0;
		int number=0;
		
		System.out.println("소수구하기");
		
		for(int n=1;n<=100;n++){
			for(int p=1;p<=n;p++){
				if(n%p==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(n+"=> 소수입니다");
				number++;
			}
			count=0;
			
		}
		
		System.out.println("소수의 개수=>"+number);

	}

}
