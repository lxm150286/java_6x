package day11.section2;

	public class Tester {

	public static void main(String[] args) {
/*	int	a[]=new int[60];
	System.out.println(a[0]);
	//System.out.println(a[60]);
	System.out.println(a[59]);*/
	System.out.println(12);
	//注册  完整类的包名、路径、类名
	try {
		Class.forName("day11.section2.Tester");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
	
		System.out.println(1/0);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	System.out.println(11);

	}

}
}