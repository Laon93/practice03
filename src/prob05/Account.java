package prob05;

public class Account {

	private String accountNo;
	private long balance;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long save(long money) {
		
		balance = balance + money;
		return balance;
	}

	public long deposit(long money) {
		
		balance = balance - money;
		return balance;
	}

}
