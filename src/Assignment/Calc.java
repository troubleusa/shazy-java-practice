package Assignment;

public class Calc {

	public double deposit (double Amtbalance, double depositAmount) {

		double balance = Amtbalance + depositAmount;

		return balance;


		}


		public double withdraw (double Amtbalance, double withdrawAmt ) {


		double balance = Amtbalance - withdrawAmt;

		return balance;

       }


		public void printStatement(double Amount, double balance) {

		System.out.println("Balance Amount after Deposit " + Amount);

		System.out.println("Balance amt after withdrawal " + balance);

		}




		public static void main(String[] args) {


		Calc obj = new Calc();

		double Amount = obj.deposit(10000.00, 555.55);


		System.out.println("Balance Amount after Deposit " + Amount);


		double balance = obj.withdraw(1055.55, 55.55);

		System.out.println("Balance amt after withdrawal " + balance);



		//Constructor

		BankAccount e1 = new BankAccount("12345ABC", 10000, "Stella");


		System.out.println(e1.getAccountNumber() +" " +e1.getBalanace()+ " " + e1.getOwner());




		e1.setAccountNumber("11111XYZ");

		e1.setBalanace(10500.00);

		e1.setOwner("Neil");


		System.out.println(e1.getAccountNumber() +" " +e1.getBalanace()+ " " + e1.getOwner());


		obj.deposit(10500.00, 10000.00);

		obj.withdraw(20500, 500);

        obj.printStatement(20500.00,20000.00);


		}

		}
