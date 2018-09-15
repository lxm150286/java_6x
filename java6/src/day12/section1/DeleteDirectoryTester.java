package day12.section1;

import java.io.File;

/**
 * 如果文件夹下 还有文件或者目录，则不能删除文件夹，只有空目录才能删除成功
 * @author Administrator
 *
 */
public class DeleteDirectoryTester {

	public static void main(String[] args) {
		tryDeleteFile("F:\\zidonghua");

	}

	public static void tryDeleteFile(String path) {
		File dir = new File(path);
		// 得到子文件夹或者文件数组
		File[] listFiles = dir.listFiles();
		for (File file : listFiles) {
			// 如果是文件，则直接删除
			if (file.isFile()) {
				file.delete();
			} else {
				tryDeleteFile(file.getAbsolutePath());
			}
		}
		//将自己空文件夹删除
		dir.delete();
	}

}
