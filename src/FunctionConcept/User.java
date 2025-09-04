package FunctionConcept;

public class User {
         String name;
		int Age;
		String City;
		char gender;
		
		public static void main(String[] args) {
		
			User User1 = new User();
			User1.name="Tim";
			User1.Age= 39;
			User1.City= "annandale";
			User1.gender ='M';
	        
			
			User User2 = new User();
			User2.name="Shaz";
			User2.Age= 42;
			User2.City= "Springfeild";
			User2.gender ='F';
	        
			
			User User3 = new User();
			User3.name="Hani";
			User3.Age= 18;
			User3.City= "Arlington";
			User3.gender ='f';
			
			User User4 = new User();
			User4.name=  "Norman";
			User4.Age = 65;
			User4.City = "fallsChurch";
			User4.gender= 'M';
			
			System.out.println( User1.name + " " + User1.Age + " " + User1.City + " " +  User1.gender);
			System.out.println( User2.name + " " + User2.Age + " " + User2.City + " " +  User2.gender);
			System.out.println( User3.name + " " + User3.Age + " " + User3.City + " " +  User3.gender);
			System.out.println( User4.name + " " +  User4.Age + " " + User4.City + " " +  User4.gender);
			
			System.out.println("......................................");
			User2 = User1;
	        User1.Age=5;
			
	         
	        System.out.println(User1.name + " " + User1.Age + " " + User1.City + " " +  User1.gender);
			System.out.println( User2.name + " " + User2.Age + " " + User2.City + " " +  User2.gender);
			System.out.println( User3.name + " " + User3.Age + " " + User3.City + " " +  User3.gender);
			System.out.println( User4.name + " " +  User4.Age + " " + User4.City + " " +  User4.gender);
			System.out.println("......................................");
	       
			User2= User3;
	        
	        System.out.println( User1.name + " " + User1.Age + " " + User1.City + " " +  User1.gender);
			System.out.println( User2.name + " " + User2.Age + " " + User2.City + " " +  User2.gender);
			System.out.println( User3.name + " " + User3.Age + " " + User3.City + " " +  User3.gender);
			System.out.println( User4.name + " " +  User4.Age + " " + User4.City + " " +  User4.gender);
			System.out.println("......................................");
			
			User3= User4;
			
	        System.out.println( User1.name + " " + User1.Age + " " + User1.City + " " +  User1.gender);
		    System.out.println( User2.name + " " + User2.Age + " " + User2.City + " " +  User2.gender);
			System.out.println( User3.name + " " + User3.Age + " " + User3.City + " " +  User3.gender);
			System.out.println( User4.name + " " +  User4.Age + " " + User4.City + " " +  User4.gender);
		
			System.out.println("......................................");
				
			User4=User1;
			
			System.out.println( User1.name + " " + User1.Age + " " + User1.City + " " +  User1.gender);
			System.out.println( User2.name + " " + User2.Age + " " + User2.City + " " +  User2.gender);
		    System.out.println( User3.name + " " + User3.Age + " " + User3.City + " " +  User3.gender);
			System.out.println( User4.name + " " +  User4.Age + " " + User4.City + " " +  User4.gender);
			
		}

	}

		