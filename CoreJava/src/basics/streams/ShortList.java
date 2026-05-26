package basics.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortList {

	
	public static List<Integer> getShortedList(List<Integer> numberList){
		
	//	numberList = numberList.stream().sorted().toList();
		numberList = numberList.stream().sorted(Comparator.reverseOrder()).toList();
	//	numberList = numberList.stream().sorted(Comparator).toList();
		return numberList;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getShortedList(Arrays.asList(6,4,1,7,9)));
		
		
		

	}

}
