package day10.section1;

import org.apache.log4j.Logger;

public class Tester {

	public static void main(String[] args) {
		/*String str1="hello world";
		String str2="hello world";
		String str3 = new String("hello world");
		String str4=new String("hello world");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		System.out.println(str3.toString());
		System.out.println(str1);*/
		Logger logger=Logger.getLogger(Tester.class);
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		
		
		
	
		

	}

}
