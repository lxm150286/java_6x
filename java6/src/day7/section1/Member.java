package day7.section1;

/**
 * 前程贷会员类
 * @author Administrator
 *
 */
public class Member {

	private int id;
	/**
	* 手机号码
	*/
	private String mobilePhone;
	/**
	* 密码
	*/
	public String password;

	/**
	 * 用户名
	 */
	public String realName;

	/**
	 * 可用余额
	 */
	private double leaveAmount;
	/**
	 * 充值金额
	 * @param amount
	 */
	private double amount;

/*	public void setAmount(double amount) {
		this.amount = amount;
	}*/

	// 所有会员地区都是中国
	public static String location;// 加static在类中只有一份

	/**
	 * 设置手机号码
	 * @param mobilePhone
	 */
	public void setMobilePhone(String mobilePhone) {
		if (mobilePhone.length() != 11) {
			System.out.println("手机格式有误！");
		} else {
			this.mobilePhone = mobilePhone;
		}
	}

	/**
	 * 手机号取值
	 * @return
	 */
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public double getLeaveAmount() {
		return this.leaveAmount;
	}

	public void setLeaveAmount(double leaveAmount) {
		this.leaveAmount = leaveAmount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 会员注册
	 * @param mobilePhone
	 * @param password
	 * @return
	 */
	public boolean register(String mobilePhone, String password) {
		if (mobilePhone.length() == 11 && password.length() >= 8 && password.length() <= 16) {
			System.out.println("注册成功！");
			return true;
		} else {
			System.out.println("注册失败，用户名或者密码不符合要求！");
			return false;
		}
	}

	// 会员类充值的方法
	public boolean recharge (double amount) {
		System.out.println(this.getClass());//获取本类对象的字节码文件地址
		System.out.println("0:会员类的充值的方法");
		if (amount < 100) {
			System.out.println("输出单笔最低充值限额是100元");
			return false;
		} else {
			this.leaveAmount += amount;
			System.out.println("充值成功!");
			return true;
		}
	}

	public Member(int id) {
		this.id = id;
	}

	public Member(String mobilePhone, String password) {
		this.mobilePhone = mobilePhone;
		this.password = password;
	}

	public Member(String mobilePhone, String password, String realName) {
		this.mobilePhone = mobilePhone;
		this.password = password;
		this.realName = realName;
	}

	public Member(int id, String mobilePhone, String password, String realName) {
		this.id = id;
		this.mobilePhone = mobilePhone;
		this.password = password;
		this.realName = realName;
	}

	public Member() {

	}

	public void mobilePhone(String string) {
		// TODO Auto-generated method stub

	}

	
}