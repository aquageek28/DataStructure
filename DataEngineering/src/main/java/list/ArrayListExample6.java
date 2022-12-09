package list;

import java.util.ArrayList;

/*
	clear(), toArray()
*/
public class ArrayListExample6 {

	public static void main(String[] args) {
		
		// ############ Integer ############
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(0, 3);
		intList.add(1, 5);
		intList.add(2, 7);
		intList.add(3, 9);
		intList.add(4, 10);
		
		System.out.println(intList);
		
		System.out.println("========= clear() =========");
		// intList.clear();

		System.out.println(intList);
		
		System.out.println("========= toArray() =========");
		
		// Integer가 String으로 Casting 될 수 없기 때문에 Object를 사용해야한다.
		Object[] array = new Object[5];
		
		array = intList.toArray(array);
		
		for(Object val: array) {
			System.out.println(val);
		}
		
	}
}
