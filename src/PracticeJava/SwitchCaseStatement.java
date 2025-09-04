package PracticeJava;

public class SwitchCaseStatement {

	public static void main(String[] args) {
//	 print Vowels 	and consonant with switch statement 
		char alphabet = 'z';

		switch (alphabet) {

		case 'a':

		System.out.println("this is vowel");

		break;

		case 'e':

		System.out.println("this is vowel");

		break;

		case 'i':

		System.out.println("this is vowel");

		break;

		case 'o':

		System.out.println("this is vowel");

		break;

		case 'u':

		System.out.println("this is vowel");

		break;

		default:

		System.out.println("this is a consonant");

		break;

		}
	
//	 write days of the week with switch statement 	
	int day = 8;
	switch (day) {
	case 1:
		System.out.println("today is Monday ");
		break;
	case 2:
		System.out.println("today is Tuseday ");
		break;
	case 3:
		System.out.println("today is Wed");
		break;
	case 4:
		System.out.println("today is Thu ");
		break;
	case 5:
		System.out.println("today is Fri ");
		break;
	case 6:
		System.out.println("today is Sat ");
		break;
	case 7:
		System.out.println("today is Sun ");
		break;


	default:
		System.out.println("Today is Fun day ");	
			break;
			}	
// Loan wit switch case and if and else and breaks 
	        

	        String loanType = "Car Loan";// i can switch the name whatever loan i want print House, car or student 
	        double salary = 40000;
	        double interestRate;

	        switch (loanType) {
	            case "Car Loan":
	                interestRate = 6.5;
	                break;
	            case "Housing Loan":
	                if (salary < 35000) {
	                    System.out.println("NOT APPLICABLE FOR Housing Loan");
	                    return;
	                }
	                interestRate = 7.5;
	                break;
	            case "Personal Loan":
	                interestRate = 10.0;
	                break;
	            case "Education Loan":
	                interestRate = 8.0;
	                break;
	            default:
	                System.out.println("Invalid loan type");
	                return;
	        }

	        System.out.println("Interest rate for " + loanType + " is " + interestRate + "%");
	    }
	
	
	
	}




//use cases:
		//cross browser logic
		//cross os logic: win/mac/linux
		//multi environments: QA/DEV/Stage/UAT/PROD
		//RBAC: user permissions: user, admin, seller, partner, vendor, distributor
		//payment methods: upi, paypal, cc, debit, netbanking
		//emp dept: admin, hr, eng, IT
		//booking type: single, multiple
		//order status
		