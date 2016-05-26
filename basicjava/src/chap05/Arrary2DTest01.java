package chap05;

public class Arrary2DTest01 {

	public static void main(String[] args) {
		//이차원배열 작성
		int[][] myarr = new int[3][2];
		System.out.println(myarr.length);
		System.out.println(myarr[0].length);
		myarr[0][0] = 100;
		myarr[1][0] = 100;
		myarr[2][0] = 100;
		
		for(int i=0;i<myarr.length;i++){
			for(int j=0;j<myarr[i].length;j++){
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
