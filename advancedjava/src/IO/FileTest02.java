package IO;

import java.io.File;

public class FileTest02 {

	public static void main(String[] args) {
		File file = new File("c:/iot/test");
		//file 객체안에 있는 모든 폴더와 파일의 정보를 출력
		//파일명----------------------[파일(length)]
		//폴더명----------------------[폴더]
		File[] list = file.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()){
				System.out.println(list[i].getName()+"---------------------------[폴더]");
			}else{
				System.out.println(list[i].getName()+"-------------[파일("+list.length+")]");
			}
		}
	}
}
