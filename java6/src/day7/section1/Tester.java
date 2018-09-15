package day7.section1;

public class Tester {
public static void main(String[] args) {
	Member tom = new Member();
	tom.setMobilePhone("1810707162");
	System.out.println(tom.getMobilePhone());
	Borrow borrow = new Borrow();
	borrow.setMobilePhone("1383838438");
	System.out.println(borrow.getMobilePhone());
	Investor investor = new Investor();
	investor.setMobilePhone("13929526376");
	System.out.println(investor.getMobilePhone());
	
	
}
}
