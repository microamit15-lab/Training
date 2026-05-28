package basic.leet;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.IntStream;

public class Substrings {
	
	public static List<String>  getSubString(String str){
		
		int len = str.length();
		List<String> subStrings = new ArrayList<String>();
		for(int i = 0; i< len; i++) {
			for(int j = i+1;j<=len ; j++) {
				//System.out.println("i = "+i+ "  j = "+j);
				//System.out.println(str.substring(i, j));
				subStrings.add(str.substring(i, j));
			}
		}
		
		/*
		 * subStrings = IntStream.range(0, len) .mapToObj(i-> IntStream.rangeClosed(i+1,
		 * len)) .mapToObj(j -> str.substring(i, j)).toList();
		 */
		return subStrings;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getSubString("Amit");
		
		

	}

}
