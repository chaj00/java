package IO;

import java.io.File;

public class FileTest02 {

	public static void main(String[] args) {
		File file = new File("c:/iot/test");
		//file ��ü�ȿ� �ִ� ��� ������ ������ ������ ���
		//���ϸ�----------------------[����(length)]
		//������----------------------[����]
		File[] list = file.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()){
				System.out.println(list[i].getName()+"---------------------------[����]");
			}else{
				System.out.println(list[i].getName()+"-------------[����("+list.length+")]");
			}
		}
	}
}
