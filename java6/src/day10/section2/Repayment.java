package day10.section2;
/**
 * 回款记录
 * @author Administrator
 *
 */
public class Repayment {
	
	private int id;
	/**
	 * 本金
	 */
	private int investId;
	/**
	 * 第几期
	 */
	private int terms; 
	/**
	 * 本金
	 */
	private int unfinishedPrincipal;
	/**
	 * 利息
	 */
	private int unfinishedInterest; 
	/**
	 * 状态，0  为未还  1  还款完成
	 */
	private int status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInvestId() {
		return investId;
	}
	public void setInvestId(int investId) {
		this.investId = investId;
	}
	public int getTerms() {
		return terms;
	}
	public void setTerms(int terms) {
		this.terms = terms;
	}
	public int getUnfinishedPrincipal() {
		return unfinishedPrincipal;
	}
	public void setUnfinishedPrincipal(int unfinishedPrincipal) {
		this.unfinishedPrincipal = unfinishedPrincipal;
	}
	public int getUnfinishedInterest() {
		return unfinishedInterest;
	}
	public void setUnfinishedInterest(int unfinishedInterest) {
		this.unfinishedInterest = unfinishedInterest;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Repayment [id=" + id + ", investId=" + investId + ", terms=" + terms + ", unfinishedPrincipal="
				+ unfinishedPrincipal + ", unfinishedInterest=" + unfinishedInterest + ", status=" + status + "]";
	}
	
	
	
	
}
