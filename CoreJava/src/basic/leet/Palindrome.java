package basic.leet;

import java.security.Identity;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

	public static boolean isPalindrome(String str) {

		for (int i = 0, j = str.length() - 1; i < str.length() / 2 && j > i; i++, j--) {

			System.out.println("Char At i : " + str.charAt(i) + " Char At j : " + str.charAt(j));
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(isPalindrome("AMAMA"));

		List<String> subString = Substrings.getSubString("AMAMAMAMA");
		System.out.println(subString);
		/*
		 * Map<String , Integer> palindromeMap List<String> list =
		 * subString.stream().map(str -> Substrings.getSubString(str));
		 */

		// .collect(Collectors.toMap(Function.identity(), String:: length));			
		/*
		 * List<String> stringList = IntStream.range(0, 0)
		 */
	}

}
