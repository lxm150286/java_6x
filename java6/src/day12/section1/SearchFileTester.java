package day12.section1;

import java.io.File;

public class SearchFileTester {

	public static void main(String[] args) {
		searchFile("E:\\tomcat8", "html");

	}
	public static void searchFile(String dirPath,String keyWord){
		System.out.println("开始搜索目录"+dirPath);
		   File dir = new File(dirPath);
		   //得到子文件、子目录的数组
		   File[] listFiles = dir.listFiles();
		   for (File subFile : listFiles) {
			   if (subFile.isFile()) {
					String fileName = dir.getName();
					if (fileName.contains(keyWord)) {
						System.out.println("-------------------------------------------------------");
						System.out.println("文件找到了"+dir.getAbsolutePath());
					}
				}else{
					//是目录，递归搜索
					searchFile(subFile.getAbsolutePath(), keyWord);
				}
		}
		   
	}

}
