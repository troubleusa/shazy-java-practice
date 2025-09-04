package StringConcept;

public class ReversestringTwo {

	public static void main(String[] args) {
		String str = "hello Shazia";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reverseString = sb.toString();
		System.out.println("origanal string :" + str);
		System.out.println("Reverse string :" + reverseString);
	}

}
