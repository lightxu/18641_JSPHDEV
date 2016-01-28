/*
 * String methods
 */


public class Program1 {
	
	public static void main(String[] args) {
	
		String s = "The quick fox jumped over the cat  ";
		System.out.println("Index of first 'o': " + s.indexOf("o", 0));
		System.out.println("Index of first 'o': " + s.indexOf("o", 15));
		System.out.println("Char at index 12: " + s.charAt(12));
		System.out.println("Substring: " + s.substring(10));
		System.out.println("Uppercase: " + s.toUpperCase());
		System.out.println("Lowercase: " + s.toLowerCase());
		System.out.println("Replace: " + s.replace("a", "o"));
		
		System.out.println("String length before trim: " + s.length());
		System.out.println("String length after trim: " + s.trim().length());
		
		String s1 = "cat";
		String s2 = "Cat";
		
		System.out.println("Comparing 'cat and 'CAT' using equals:" + (s1.equals(s2)));
		System.out.println("Comparing 'cat and 'cat' using equals:" + (s1.equals(s2.toLowerCase())));
		System.out.println("Comparing 'cat and 'CAT' using equalsIgnoreCase:" + (s1.equalsIgnoreCase(s2)));
		
		System.out.println("Comparing 'cat and 'Cat' using compareTo: " + s1.compareTo(s2));
		System.out.println("Comparing 'cat and 'cat' using compareTo: " + s1.compareTo(s2.toLowerCase()));
		
		int i = 15;
		System.out.println("Convert int to String representation: " + String.valueOf(i));
		
		Cat cat = new Cat("Max", 7);
		System.out.println("String representation of object Cat using toString: " + cat.toString());
	}

}
