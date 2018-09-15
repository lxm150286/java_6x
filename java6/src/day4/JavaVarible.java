package day4;

public class JavaVarible {
	static int ooAge;//基本数据类型
	static String array[];//引用数据类型
	public static void main(String[] args) {
		/*
		 * 变量： 数据类型： 基本数据类型：八种 
		 * 引用数据类型：3种：变量、接口、类
		 */
		System.out.println(array);
		System.out.println(ooAge);
		/*System.out.println(array.length);
*/
		/*int sum = JavaVarible.add(2, 10086);
		System.out.println(sum);
		myFun();*/
		System.out.println(addArray1(new int[]{23,56,0,56,78}));
		int a[]=new int[]{3,5,7,8};
		addArray(a);
		
	}

	public static void myFun() {
		int ererAge=1;
		System.out.println(ererAge);

	}
	public static int add(int a,int b){
		return a+b;
	}
	public static int addArray(int array[] ){
		int sum=0;
		for(int i=0;i<array.length;i++){
			int a = array[i];
			sum+=a;
		}
		return sum;
	}
	
	public static int addArray1(int array[]){
		int sum=0;
		  for (int i : array) {
			sum+=i;
		}
		return sum;
	}
   public static int addArray2(int...args){
	  int sum=0;
	   for (int i : args) {
		sum+=i;
	}
	   return sum;
   }
}
