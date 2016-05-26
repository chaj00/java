package chap04;

public class HapTest {

	public static void main(String[] args) {
		int total=0;
		int oddhap =0;
		int evenhap =0;
		
		for(int i=1;i<=100;i++){
			total +=i;
			if(i%2 ==0){
				evenhap +=i;
			}else {
				oddhap +=i;
			}
		}
		
		System.out.println("ÀüÃ¼ÇÕ=>"+total);
		System.out.println("È¦¼öÇÕ=>"+oddhap);
		System.out.println("Â¦¼öÇÕ=>"+evenhap);
	}

}
