package gui.model;

public class Calc {
	public int calc(String opr, int num1,int num2){
		int result;
		switch(opr){
		case "+"://더하기연산
			result = num1+num2;
			break;
		case "*"://곱하기연산
			result = num1 * num2;
			break;
		case "-"://빼기연산
			result = num1-num2;
			break;
		case "/"://나누기연산
			result = num1/num2;
			break;
		default:
			result = 0;
		}
		return result;
	}
	
	public void showGuGu(int num){
		for(int i=1; i<=9;i++){
			System.out.println(num+"x"+i+"="+num*i );
		}
	}
	
	public void arrTest(int[] array){
		int oddhap = 0;
		int evenhap = 0;
		
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				evenhap = evenhap + array[i];
			}else{
				oddhap = oddhap + array[i];
			}
		}
		System.out.println("홀수의 합 : "+oddhap);
		System.out.println("짝수의 합 : "+evenhap);
	}
	
}
