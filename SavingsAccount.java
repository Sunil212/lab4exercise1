package lab4.exercise1;

public class SavingsAccount extends Account{
	final float minBalance = 500;

	public SavingsAccount() {
		super();
	}


	public float getMinBalance() {
		return minBalance;
	}


	public double doWithdrawal(int amount){
		if(balance-amount < minBalance) {
			setStatus(false);
		} else {
			setStatus(true);
			balance-=amount;
		}
		return balance; // new balance
	}

}
