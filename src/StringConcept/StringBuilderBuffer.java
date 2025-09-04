package StringConcept;

public class StringBuilderBuffer {

	
	public static void main(String[] args) {
	 
    // String builder don't create wasteful objects and is mutable 
		StringBuilder sb = new StringBuilder("Selenium");
		System.out.println(sb);//selenium 
		sb=sb.append("Automation");
		System.out.println(sb);// results will be seleium auotomation
		
		System.out.println("------");
		
    //	 buffer is same as string builder but slower 	
		

		StringBuffer sf = new StringBuffer("plyawright");
		System.out.println(sf);
		sf = sf.append("automation");
		System.out.println(sf);
		
		System.out.println("------");
		
  // string immutable have to use concat keyword to change value should not be using this string 
		
		String m1= (" Selenium is hard ");
		m1=m1.concat("for Shazia ");
		System.out.println(m1);
		
		System.out.println("------");
		
		//String literal
		String st = "selenium";
				
		String s2 = "selenium";
		
		String s1 = new String ("testing");
		String s3 = ("testing");
		String s4 = ("testing");
		
		System.out.println(s3.equals(s2));// false 
		System.out.println(s3.equals(s4));// true 
		
		
		
		
	}
	

}
