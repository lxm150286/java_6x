package day12.section1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTester {

	public static void main(String[] args) throws IOException {
		File soreFile = new File("F:\\ds\\a.bhd");
		File targetFile = new File("F:\\ds\\b.bhd");
		FileInputStream in = new FileInputStream(soreFile);
		FileOutputStream out = new FileOutputStream(targetFile);
		while(true){
			byte data[]=new byte[1024];
			int length = in.read(data);
			if (length==-1) {
				break;
			}else{
				out.write(data);
			}
		}
		out.close();
		in.close();
	}

}
