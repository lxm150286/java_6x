package day9.section2;

/**
 * 借款人
 * @author Administrator
 *
 */
public class Borrow extends Member {
	private String adderss;

	public String getAdderss() {
		return this.adderss;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	// 借款人的充值的方法
		public boolean recharge(double amount) {
			 boolean flag= super.recharge(amount);
			 if (flag) {
				 System.out.println("借款人充值成功!，你可以去还款了");
				return true;
				
			}else{
				System.out.println("借款人充值失败");
				return false;
			}
				
			
		}

	/**
	 * 借款方法
	 * @param amount
	 */
	public void borrow(double amount) {
		System.out.println("借款人借钱"+amount);
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}
}
