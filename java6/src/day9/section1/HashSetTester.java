package day9.section1;

import java.util.HashSet;

public class HashSetTester {
/**
 * HashSet：1、泛型接受的对象是引用数据类型  
 *          2、无序，不可重复
 * 
 * @param args
 */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("tom1");
		hashSet.add("tom2");
		hashSet.add("tom3");
		hashSet.add("jack1");
		hashSet.add("jerry");
		System.out.println(hashSet.toString());

	}

}
