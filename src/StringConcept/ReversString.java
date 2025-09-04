package StringConcept;

public class ReversString {
	
	
	public static String reverse(String str) {
		int len;
		
		//null check
		try {
			len = str.length();//1
		} 
		catch (NullPointerException e) {
			return str;
		}

		// len is zero check
		if (len == 0) {
			return str;
		}

		// len is 1 check
		if (len == 1) {
			return str;
		}

		//String rev = "";
		StringBuilder reverse1 = new StringBuilder();
		for (int i=len - 1; i>=0; i--) {
			//rev = rev + str.charAt(i);
			reverse1 = reverse1.append(str.charAt(i));
		}

		return reverse1.toString();
	}

	public static void main(String[] args) {

		// test cases: with test data:
		String s1 = reverse("Shazia");//O(n)--worst case
		System.out.println(s1);

		s1 = reverse("testing");//O(n)
		System.out.println(s1);

		s1 = reverse("T");//O(1)--best case
		System.out.println(s1);//T

		s1 = reverse("123");//O(n)--avg case
		System.out.println(s1);

		s1 = reverse("");
		System.out.println(s1);

		s1 = reverse(null);
		System.out.println(s1);//null
		
		s1 = reverse(" ");
		System.out.println(s1);
		
		s1 = reverse("selenium#$#$#$");
		System.out.println(s1);
		
		System.out.println("=======================================");
		
		
		String Str = "hello world";
		String reversedStr="";
		for(int i = Str.length() -1; i >= 0; i--) {
		reversedStr += Str.charAt(i);// this is built in to reverse string 
	    System.out.println(reversedStr);
					
		}
		

		
	
	}
       
	}


