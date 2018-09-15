package day12.section1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 字符流   读取文本文件
 * @author Administrator
 *
 */
public class ReaderAndWriterTester {

	public static void main(String[] args) throws IOException {
		File soreFile = new File("F:\\ds\\Docker.txt");
		File targetFile = new File("F:\\ds\\Docker1.txt");
		// 缓冲
		BufferedReader reader = new BufferedReader(new FileReader(soreFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile));

		while (true) {
			// 一行一行的读取
			String line = reader.readLine();
			if (line == null) {
				break;
			} else {
				// System.out.println(line);
				writer.write(line);
				//重新开启一行
				writer.newLine();

			}

		}
		writer.close();
		reader.close();

	}

}
