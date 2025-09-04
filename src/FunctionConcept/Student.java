package FunctionConcept;

public class Student {

	public static void main(String[] args) {
	Student s1 = new Student();
	int m1 = s1.getStudentMarks("nida");
	System.out.println(m1);// 0

	if (m1 >= 0) {
		System.out.println("print the marksheet");
	} else {
		System.out.println("no need to print the marksheet as student is not found..");	}
}
	// AC:
		// WAF: get the student marks on the basis of student name
		// logic: negative marking: -1
		// function name: getStudentMarks(String studentName)
		// return: marks(int): >=0 [0-100]
	
   public int getStudentMarks(String studentName) {
	System.out.println("getting student marks : " + studentName);
	int marks = -1;
	String lowerCaseText= studentName.toLowerCase();

	if (studentName.equals("Shazia")) {
		int score = 90;
		int negativeMarks = -5;
		marks = score + negativeMarks;// 85
	}
   else if (studentName.equals("Tim")) {
	    int score =80;
	    int negativeMarks = -6;
	    marks= score + negativeMarks;
      } 
   else if (studentName.equals("Nida")) {
	    int score = 90;
		int negativeMarks = -5;
		marks = score + negativeMarks;// 85
   }
   else {
 	
	System.out.println("Student not found ;" + studentName);
	}
    return marks;
   	    
		}
		
}
		
		

	


