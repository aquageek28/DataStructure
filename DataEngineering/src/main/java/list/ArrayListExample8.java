package list;

import java.util.ArrayList;
import java.util.List;

/*
	subList()
*/
public class ArrayListExample8 {

	public static void main(String[] args) {
		
		// ############ Integer ############
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(3);
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(1);
		
		System.out.println(intList);
		
		System.out.println("========= subList() =========");
		
		List<Integer> subList = intList.subList(1, 4);
		
		System.out.println(subList);
		
		subList.add(1, 12);
		
		System.out.println(subList);
		
		// 원래의 List에도 영향을 준다.
		System.out.println(intList);

		
	}
}
