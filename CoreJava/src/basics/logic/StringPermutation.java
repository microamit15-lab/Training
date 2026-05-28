package basics.logic;

class StringPermutation {



	    // Function to generate permutations
	    public static void permute(String str, String ans) {

	        // Base case
	        if (str.length() == 0) {
	            System.out.println("ans : "+ ans);
	            return;
	        }

	        // Recursive case
	        for (int i = 0; i < str.length(); i++) {

	            // Pick character
	            char ch = str.charAt(i);
	            System.out.println("iteration : " + i + "  CH : " + ch);
	            // Remaining string after removing picked character
	            String remaining = str.substring(0, i) + str.substring(i + 1);
	            System.out.println("i : " +i );
	            System.out.println( "str.substring(0, i) : "+ str.substring(0, i));
	            System.out.println("str.substring(i + 1) :  " +str.substring(i + 1));
	            System.out.println("remaining : " + remaining + " ANS : " + ans+ch);

	            // Recursive call
	            permute(remaining, ans + ch);
	        }
	    }

	    public static void main(String[] args) {
	        String input = "ABC";
	        permute(input, "");
	    }
	}
