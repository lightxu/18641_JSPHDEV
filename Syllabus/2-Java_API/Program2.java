/*
 * StringBuffer example
 */

public class Program2 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Object language");
		System.out.println("Original String : " + str);
		System.out.println("Length of String is : " + str.length());

		// accessing characters in a string
		for (int i = 0; i < str.length(); i++) {
			int p = i + 1;
			// accessing characters in a string
			System.out.println("Character at position : " + p + " is : "
					+ str.charAt(i));
		}

		String aString = new String(str.toString());
		int pos = aString.indexOf("language");
		// inserting a string in the middle
		str.insert(pos, "Oriented ");
		System.out.println("Modified string : " + str);
		// Modifying character at position 6
		str.setCharAt(6, '`');
		System.out.println("String now : " + str);
		// Appending a string at the end
		str.append(" improves security : ");
		System.out.println("Append string : " + str);
		
	}
}
