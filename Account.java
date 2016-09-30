public class Account{
	private int accountNumber;
	private double balance = 0.0;

	public Account(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		setBalance(balance);
	}

	public Account(int accountNumber){
		this.accountNumber = accountNumber;
	}

	public int getAccount(){
		return accountNumber;
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void credit(double amount){
		this.balance+= amount;
	}

	public void debit(double amount){
		if (this.balance >= amount){
			this.balance -= amount;
		}
		else{
			System.out.println("Amount withdrawn exceeds the Current Balance!");
		}
	}

	public String toString(){
		return String.format("A/C no: %d, Balance: %.2f", this.accountNumber, this.balance);
	}

}