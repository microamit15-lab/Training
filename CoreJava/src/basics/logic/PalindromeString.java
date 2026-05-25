package basics.logic;

import java.util.stream.IntStream;

public class PalindromeString {

	public static boolean isPalindrome(String str) {
		
		for(int i =0 ; i< str.length()/2; i++) {
			
			System.out.println(str.charAt(i));
			System.out.println(str.charAt(str.length()-i-1));
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {			
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		System.out.println(isPalindrome("madam"));
		
		//stream implimentation 
		boolean isPalin = IntStream.range(0, str.length()/2).allMatch(i ->str.charAt(i) == str.charAt(str.length()-1-i));
		System.out.println(isPalin);
	}

}
