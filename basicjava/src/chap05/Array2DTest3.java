package chap05;

public class Array2DTest3 {

	public static void main(String[] args) {
		int[][] myarr = new int[5][];
		
		myarr[0] = new int[2];
		myarr[1] = new int[3];
		myarr[2] = new int[4];
		myarr[3] = new int[5];
		myarr[4] = new int[6];
		
		for(int i=0; i<myarr.length;i++){
			for(int j=0; j<myarr[i].length;j++){
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
