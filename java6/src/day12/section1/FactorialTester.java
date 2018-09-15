package day12.section1;

public class FactorialTester {
	/**
	 * 求一个正整数的阶乘：
	 *1、 0的阶乘等于   2、1的阶乘等于1
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(5));*/
		System.out.println(factorialFor(0));
		System.out.println(factorialFor(1));
		System.out.println(factorialFor(2));
		System.out.println(factorialFor(5));

	}
/**
 * 递归算法  求阶乘
 * @param a
 * @return
 */
	public static int factorial(int a) {
		if (a == 0) {
			return 1;
		} else {
			return a * factorial(a - 1);
		}

	}
	/**
	 * 用for循环的方式去搜索
	 * @param a
	 * @return
	 */
	public static int factorialFor(int a){
		int sum=1;
		if (a==0) {
			return 1;
		}else{
			for (int i = a; i > 0; i--) {
				sum=sum*i;
			}
				
				return sum;
		}
	
	}
	
	
}
