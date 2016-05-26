package chap06;

public class Prob1 {
	
	public static void main(String[] args) {	
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};	
		Calc cal = new Calc();
		
		System.out.println("( 배열ia )");
		cal.arrTest(ia);
		
		System.out.println("( 배열ib )");
		cal.arrTest(ib);
		
		/*
		int oddhap = 0;
		int evenhap = 0;
		
		for(int i=0;i<ia.length;i++){
			if(ia[i]%2==0){
				evenhap = evenhap + ia[i];
			}else{
				oddhap = oddhap + ia[i];
			}
		}
		System.out.println("( 배열ia )");
		System.out.println("홀수의 합 : "+oddhap);
		System.out.println("짝수의 합 : "+evenhap);
		
		oddhap =0;
		evenhap=0;
		for(int i=0;i<ib.length;i++){
			if(ib[i]%2==0){
				evenhap = evenhap + ib[i];
			}else{
				oddhap = oddhap + ib[i];
			}
		}
		System.out.println("( 배열ib )");
		System.out.println("홀수의 합 : "+oddhap);
		System.out.println("짝수의 합 : "+evenhap);
		*/
	} 
}