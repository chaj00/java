package chap05;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int[] myarr = new int[]{10,20,30,40,50};//������ ���� �迭
		int[] myarr2=new int[10];//���迭
		//������
		for(int i=0;i<myarr2.length;i++){
			System.out.print(myarr2[i]+"\t");
		}
		
		System.out.println();
		System.arraycopy(myarr, 0, myarr2, 0, myarr.length);
		
		for(int i=0;i<myarr2.length;i++){
			System.out.print(myarr2[i]+"\t");
		}

	}

}
