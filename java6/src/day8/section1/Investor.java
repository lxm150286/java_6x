package day8.section1;

/**
 * 投资人
 * @author Administrator
 *
 */
public class Investor extends Member {
	// 投资人的充值的方法
	public boolean recharge(double amount) {//对父类方法的重写
		boolean flag = super.recharge(amount);

		if (flag) {
			System.out.println("投资人充值成功，你可以去投资了");
			return true;

		} else {
			System.out.println("投资人充值失败！");
			return false;
		}

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

}
