package IO;

import java.io.File;

public class FileTest01 {

	public static void main(String[] args) {
		File file = new File("c:/iot/test");
		File file2 = new File("test.txt");
		System.out.println(file);
		System.out.println(file2);
		System.out.println("file2.canRead()=>"+file2.canRead());
		System.out.println("file2.canWrite()=>"+file2.canWrite());
		System.out.println("file2.getAbsolutePath()=>"+file2.getAbsolutePath());
		System.out.println("file2.getName()=>"+file2.getName());
		System.out.println("file2.getParent()=>"+file2.getParent());
		System.out.println("file2.getPath()=>"+file.getPath());
		
		System.out.println("file2.isDirectory()=>"+file2.isDirectory());
		System.out.println("file2.isFile()=>"+file2.isFile());
		System.out.println("file2.lastModified()=>"+file2.lastModified());
		System.out.println("file2.length())=>"+file2.length());
		
		file2.setReadOnly();
		
		
		
	}

}
