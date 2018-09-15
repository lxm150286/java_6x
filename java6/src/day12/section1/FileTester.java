package day12.section1;

import java.io.File;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) throws IOException {
		/*File file = new File("F:\\zidonghua\\w.txt");
		System.out.println(file.exists());
		System.out.println("\\");*/
		String pathName="F:\\zidonghua\\w2\\w3";
		
		/*boolean flag=file.exists();
		System.out.println(flag);*/
		
		/*if (!flag) {
			boolean createNewFile = file.createNewFile();
			System.out.println(createNewFile);
		}*/
	  /* boolean mkdirs = file.mkdirs();
	   System.out.println(mkdirs);*/
		/*File[] listFiles = file.listFiles();
	
	System.out.println(listFiles.length);
	for (File file2 : listFiles) {
		System.out.println(file2.getAbsolutePath());
	}*/
	File file = new File(pathName);
	System.out.println(file.isFile());
	//删除目录时，只有当文件夹里面是空的时，才能删除文件夹(目录)
	boolean delete = file.delete();
	System.out.println(delete);
	
	}

}
