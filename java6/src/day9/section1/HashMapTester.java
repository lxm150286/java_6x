package day9.section1;

import java.util.HashMap;
import java.util.Set;

public class HashMapTester {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key3", "value3");
		hashMap.put("key4", "value4");
		hashMap.put("key1", "tom");
		hashMap.put("key2", "jack");
		System.out.println(hashMap.toString());
		//得到map里面所有键的集合
		Set<String> keys=hashMap.keySet();
		
		for (String key : keys) {
			System.out.println(key+"------------------"+hashMap.get(key));
		}
	}

}
