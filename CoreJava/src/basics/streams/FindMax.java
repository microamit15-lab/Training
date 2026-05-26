/**
 * 
 */
package basics.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class FindMax {

	public static Integer getMaxNumber(List<Integer> numbersList) {
		
		
		return numbersList.stream().max(Integer::compareTo).orElseThrow();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMaxNumber(Arrays.asList(1,2,3,7,4)));
		

	}

}
