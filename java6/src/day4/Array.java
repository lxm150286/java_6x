package day4;

public class Array {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		/* int a = 1.1;//int 修饰整形，1.1是浮点型
		 int f = 2; 
		 char b = lemon; //char是字符,而lemon是一个变量;char b = 'l'
		char c = %; //char字符,需要用''
		char p = "%"; //""表示字符串,char表示字符
		char d = '%'; 
		long e = 1.1;//long 是整形，1.1是浮点型
		long g = 3; 
		float j = 2.3; //在后面加上f表示该数字是float型的，如果不写的默认的是double型
		float m = 2.3f; 
		double n = 3.33;*/
		//3：
		/*1）：创建一维数组
		     请使用两种语法创建数组，数组的元素为{“我”,”是”,”最”,”棒”,”的”} 
		     
*/
		String array[]=new String[]{"我","是","最","棒","的"};
		String array1[]=new String[5];
		array1[0]="我";
		array1[1]="是";
		array1[2]="最";
		array1[3]="棒";
		array1[4]="的";
		//请使用请使用两种语法创建数组，数组的元素为{100,200,300,400,500} 
		int arrayInt[]=new int []{100,200,300,400,500};
		int arrayInt1[]=new int[5];
		arrayInt1[0]=100;
		arrayInt1[1]=200;
		arrayInt1[2]=300;
		arrayInt1[3]=400;
		arrayInt1[4]=500;
		
		/*2）：创建二维数组 
		    请使用两种语法来创建数组，数组的元素为{{“第一个”,”二维”},{“数”,”组”}} 
	*/
		String array02[][]=new String[2][];
		array02[0][0]="第一个";
		array02[0][1]="二维";
		array02[1][0]="数";
		array02[0][1]="组";
		String array03[][]=new String[][]{{"第一个","二维"},{"数","组"}}; 
		//    请使用两种语法来创建数组，数组的元素为{{“第”,”二”},{“个”,”二”},{“维”,”数”,”组”}} 
		String array04[][]=new String[3][];
		array04[0]=new String[]{"第","二"};
		array04[1]=new String[]{"个","二"};
		array04[2]=new String[]{"维","数","组"};
		String array05[][]=new String[][]{{"第","二"},{"个","二"},{"维","数","组"}};
		// 请使用两种语法来创建数组，数组的元素为{{10,20},{30,40}} 
		int array06[][]=new int [][]{{10,20},{30,40}};
		int array07[][]=new int[2][];
		array07[0]=new int[]{10,20};
		array07[1]=new int[]{30,40};
		//请使用两种语法来创建数组，数组的元素为{{50,60},{70,80},{90,100,110}} 
		int array08[][]=new int[][]{{50,60},{70,80},{90,100,110}};
		int array09[][]=new int[3][];
		array09[0]=new int[]{50,60};
		array09[1]=new int []{70,80};
		array09[2]=new int[]{90,100,110};
	}

}
