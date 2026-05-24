package basics.generics;

import java.util.ArrayList;
import java.util.List;

public class BasicExample {

	private void psvm() {
		List<String> list = new ArrayList<>();
		list.add("1234567");
		list.add("abfnfkf");
		
	//	list.add(1234);The method add(int, String) in the type List<String> is not applicable for the arguments (int)//
		
		System.out.println(list);
	}
}
