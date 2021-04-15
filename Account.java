package lab4.exercise1;

public class Account {
	private long accNum;
	protected double balance;
	private Person accHolder;
	private boolean status;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
		}
		public Account(long accNum, double balance, Person accHolder) {

		super();
		this.accNum=accNum;
		this.balance=balance;
		this.accHolder = accHolder;
		// TODO Auto-generated constructor stub
		}
	
		public double getBalance() {
			return balance;
			}

			public void setBalance(double balance) {
			this.balance = balance;
			}

			public long getAccNum() {
			return accNum;
			}

			public void setAccNum(long accNum) {
			this.accNum = accNum;
			}

			public Person getAccHolder() {
			return accHolder;
			}

			public void setAccHolder(Person accHolder) {
			this.accHolder = accHolder;
			}

			public double doWithdrawal(int amount){
			if(balance - amount < 500) {
			setStatus(false);
			} else {
			setStatus(true);
			balance-=amount;
			}
			return balance; // new balance
			}

			public boolean getStatus() {
			return status;
			}

			public void setStatus(boolean status) {
			this.status = status;
			}

			public void doDeposit(double amount) {
			balance=balance+amount;

			}
}
