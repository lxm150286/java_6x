package day7.section2;

import day7.section1.Borrow;
import day7.section1.Investor;
import day7.section1.Member;

public class Tester {

	public static void main(String[] args) {
		//投资人和借款人都是会员，充值方法
 Member borrow = new Borrow();//用父类类型接受子类对象，重写父类的方法
   borrow.recharge(100);
   System.out.println(borrow.getLeaveAmount());
   Borrow  borrow2 = (Borrow)borrow;
   borrow2.borrow(2500);
  Member investor = new Investor();
   investor.recharge(99);
   System.out.println(investor.getLeaveAmount());
	}

}
