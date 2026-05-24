package basics.logic;

import java.util.LinkedHashMap;
import java.util.Map;

public class FiestNonRepeatedChar {
	
	
	public static void getFirstNonRepeatedString(String str) {
		
		/*
		 * for(int i = 0 ; i<str.length() ; i++ ) { System.out.println(str.charAt(i) +
		 * str.charAt(i+1)); if(str.charAt(i) != str.charAt(i+1)) { return
		 * str.charAt(i); } } return (Character) null;
		 */
		
		 Map<Character, Integer> map = new LinkedHashMap<>();

	        // Step 1: Count frequency
	        for (char ch : str.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	            System.out.println(map);
	        }

	        // Step 2: Find first non-repeating
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.println("First non-repeating: " + entry.getKey());
	                return;
	            }
	        }

	        System.out.println("No non-repeating character found");
	    }
	

	public static void main(String[] args) {
		
		
		getFirstNonRepeatedString("aaaabbccfddeefggh");
	
		// TODO Auto-generated method stub

	}

}
