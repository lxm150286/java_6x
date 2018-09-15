package day5;

public class Member {
	/*
	 * /*+enter:多行注释
	 */

	/**
	 * /**+enter:文档注释
	 * 
	 * @param args
	 */
	/**
	 * 手机号码
	 */
	public String mobilePhone;
	/**
	 * 密码
	 */
	public String passWord;
	/**
	 * 姓名
	 */
	public String realName;
	/**
	 * 可用余额
	 */
	public double leaveAmount;

	public static void main(String[] args) {
		System.out.println();
		Member tom = new Member();
		tom.regiter("1383838438", "323289dfxxz");
		Integer ateger = new Integer(20);
		System.out.println(ateger);
		String a="1234";
		String b="2008";
		System.out.println(a+b);
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
		System.out.println(aInt+bInt);
		System.out.println(Integer.MAX_VALUE);
		
		
				

	}

	public boolean regiter(String mobilePhone, String password) {
		if (mobilePhone.length()==1&&password.length()>= 8&& password.length()<= 16) {
			return true;
		}
		return false;

	}
	
}
