package day10.section2;

import java.util.List;

/**
 * 工具类
 * @author Administrator
 *
 */
public class RepaymentUtil {
	/**
	 *   给我一条投资记录，生成对应的一条回款记录
	 *   回款记录：id ,investId,Terms, UnfinishedPrincipal  UnfinishedInterest Status
	 *   1:15天（一次性回款）
	 *   投资10000,15天，年化收益为12%
	 *   只有一条回款记录：利息10000*12%、360*15=50   本金10000
	 *   2:6个月（按月付息，到期还本）
	 *   投资10000，利息为12%
	 *   1）生成6条还款记录
	 *   2）总利息是多少  10000*12%/12*6==600
	 *   3)前面5期煤气的利息100，本金0
	 *   4）最后一期还利息100，本金10000
	
	 */
	public static List<Repayment> generateRepayments(Invest invest,Loan loan){
	int loanDateType=loan.getLoanDateType();//借款项目的日期类型；1：天标 2：月标
		if (loanDateType==1) {
			
		}else if (loanDateType==2) {
			
		}
		return null;
		
	}

}
