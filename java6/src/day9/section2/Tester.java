package day9.section2;

public class Tester {

	public static void main(String[] args) {
		Investor tom = new  Investor();
		tom.setId(10086);
		tom.recharge(10000);//先充值10000元
		/**
		 * 标的信息，数据库查出--java对象--loan
		 */
		Loan loan = new Loan();
		loan.setId(999);
		loan.setTitle("资金周转");
		loan.setAmount(20000);//借款20000元
		loan.setLoanTerm(6);//借款期限
		loan.setLoanDateType(2);//还款方式,2按月付息，到期还本
		loan.setStatus(1);
		
		double  amount=1000;//投资金额
		System.out.println(tom.getLeaveAmount());
		Invest invest=tom.bidLoan(100,loan);//投资记录(invest投资对象，bidLoan竞标对象)
		System.out.println(tom.getLeaveAmount());
		System.out.println(invest);
		
		//投资信息：投资的id，投资的用户id，投资的标id,投资金额，投资时间   Invest--抽象、描述、面向对象----面向对象的编程思想
		
	}

}
