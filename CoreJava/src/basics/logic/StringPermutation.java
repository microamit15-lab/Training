package basics.logic;

public class StringPermutation {
	
	public static void permutation(String str, String avg) {
		
		
		if(str.length()==0) {
			System.out.println(avg);
			return;
		}
		
		for(int i =0 ; i< str.length() ; i++ ) {
			char ch = str.charAt(i);
			String remaining = str.substring(i+1) + str.substring(0,i);
			permutation(remaining, avg+ch);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abc", "");

	}

}
