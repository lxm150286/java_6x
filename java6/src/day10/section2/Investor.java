package day10.section2;

import java.util.Date;

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
/**
 * 竞标方法bidLoan
 * 1、投资金额必须是100的正整数倍
 * 2、投资金额小于项目的融资金额
 * 3、投资金融小于剩余金额
 * @param amount
 * @param loan
 * @return
 */
	public Invest bidLoan(double amount, Loan loan) {
		if (amount%100!=0||amount<100) {
			System.out.println("投资失败！投资金额必须是100的正整数倍");
		}else if (amount>loan.getAmount()) {
			System.out.println("投资失败！投资金额要小于项目的融资金额");
		}else if (amount>this.getLeaveAmount()) {
			System.out.println("投资失败！投资金额要剩余金额");
		}else{
			this.setLeaveAmount(this.getLeaveAmount()-amount);
			System.out.println("投资成功!");
			//投资成功产生一条投资记录
			Invest invest = new Invest();
			invest.setId(1000);//标的id
			invest.setAmount(amount);//投资的金额
			invest.setMemberId(this.getId());//哪个用户投的
			invest.setloanId(loan.getId());//投资的是哪个项目
			invest.setDate(new Date());
			return invest;
			//投资记录--保存到数据库--插入数据库，保存这条记录到数据库中   jdbc
		}
		return null;
	}

}
