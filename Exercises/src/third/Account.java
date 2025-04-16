package third;

public  class Account {
	
	protected double balance; 
	
	protected double overdaft;

	protected double deposit;

	protected double takeMoney;

	protected double payment;
	
	protected double balanceOverdraft;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getOverdaft() {
		return overdaft;
	}

	public void setOverdaft(double overdaft) {
		this.overdaft = overdaft;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getTakeMoney() {
		return takeMoney;
	}

	public void setTakeMoney(double takeMoney) {
		this.takeMoney = takeMoney;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}


	public double getBalanceOverdraft() {
		return balanceOverdraft;
	}

	public void setBalanceOverdraft(double balanceOverdraft) {
		this.balanceOverdraft = balanceOverdraft;
	}
}
