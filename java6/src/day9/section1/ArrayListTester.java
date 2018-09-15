package day9.section1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTester {

	public static void main(String[] args) {
		/*
		 * 泛型只能放引用数据类型，如数组、类、接口、枚举
		 */
		int count = -1;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println(arrayList.toString());
		System.out.println(arrayList.toArray());
		System.out.println(arrayList);
		// System.out.println(arrayList.get(5));
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(" ");
			System.out.print(arrayList.get(i));
		}
		arrayList.set(1, 3);
		for (Integer integer : arrayList) {
			count++;
			if (count != 1) {
				System.out.print(" " + integer);

			}
		}
		// 使用迭代器
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());

		}

	}

}
