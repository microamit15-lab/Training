package basics.streams;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
	
	
	public static List<Integer> getEvenNumbers(List<Integer> integerList ){
		
		integerList = integerList.stream().filter(n -> n%2==0).toList();
		return integerList;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5);/*new ArrayList<>();*/
		System.out.println(getEvenNumbers(list));
	}

}
