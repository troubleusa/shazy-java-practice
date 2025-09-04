package Assignment;

public class BankAccount {
//	 running this from Calc class 
	private String accountNumber;

	private double balance;

	private String owner;


	//Public constructor


	public BankAccount(String accountNumber, double balance, String owner) {

	this.accountNumber = accountNumber;

	this.balance = balance;

	this.owner = owner;

	}


	//public getter and setter method



	public String getAccountNumber() {

	return accountNumber;

	}





	public void setAccountNumber(String accountNumber) {

	this.accountNumber = accountNumber;

	}





	public double getBalanace() {

	return balance;

	}





	public void setBalanace(double balanace) {

	this.balance = balanace;

	}





	public String getOwner() {

	return owner;

	}





	public void setOwner(String owner) {

	this.owner = owner;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
