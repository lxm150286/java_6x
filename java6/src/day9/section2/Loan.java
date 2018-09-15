package day9.section2;

/**
 * 创建一个标的类
 * @author Administrator
 *
 */
public class Loan {
	/**
	 * 标的id
	 */
	private int id;
	/**
	* 借款金额
	*/
	private double amount;
	/**
	 * 标的标题
	 */
	private String title;
	/**
	 * 借款期限:15天，6个月，360天
	 */
	private int loanTerm;
	/**
	 * 借款期限的类型：1天标  2月标
	 * 1，一次性  2：按月付息，到期还本
	 */
	private int loanDateType;
	/**
	 * 年化收益
	 */
	private double loanRate;
	/**
	 * 标的状态
	 */
	private int status;

	public int getId() {
		return id;
	}

	// 重写了object的toString方法
	@Override
	public String toString() {
		return "Loan [id=" + id + ", amount=" + amount + ", title=" + title + ", loanTerm=" + loanTerm
				+ ", loanDateType=" + loanDateType + ", loanRate=" + loanRate + ", status=" + status + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public int getLoanDateType() {
		return loanDateType;
	}

	public void setLoanDateType(int loanDateType) {
		this.loanDateType = loanDateType;
	}

	public double getLoanRate() {
		return loanRate;
	}

	public void setLoanRate(double loanRate) {
		this.loanRate = loanRate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
