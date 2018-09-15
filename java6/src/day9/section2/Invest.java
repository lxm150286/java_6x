package day9.section2;

import java.util.Date;

public class Invest {
/**
 * 投资信息：投资的id，投资的用户id，投资的标id,投资金额，投资时间
 */

private int id;

private int memberId;

private int loanId;

private double amount;

private Date date;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getMemberId() {
	return memberId;
}

public void setMemberId(int memberId) {
	this.memberId = memberId;
}

public int getloanId() {
	return loanId;
}

public void setloanId(int loanId) {
	this.loanId = loanId;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

@Override
public String toString() {
	return "Invest [id=" + id + ", memberId=" + memberId + ", loanId=" + loanId + ", amount=" + amount + ", date=" + date
			+ "]";
}






}
