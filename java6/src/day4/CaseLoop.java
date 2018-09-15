package day4;

public class CaseLoop {

	public static void main(String[] args) {
		/*int a = 8;
		switch (a) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("工作日");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入值有误");
			break;
		}*/
		//输出0-100的偶数
		/*for (int i = 0; i<=100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
	    }*/
		for (int i = 0; i <=100; i++) {
			if (i%2==1) {
				continue;
				//break;
			}
			System.out.println(i);
		}

	}

}
