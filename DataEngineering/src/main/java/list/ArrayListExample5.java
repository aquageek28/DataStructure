package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
	iterator(), listIterator()
*/
public class ArrayListExample5 {

	public static void main(String[] args) {
		
		// ############ Integer ############
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(0, 3);
		intList.add(1, 5);
		intList.add(2, 7);
		intList.add(3, 9);
		intList.add(4, 10);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		for (Integer val : intList) {
			System.out.println(val);
		}
		
		System.out.println("========= iterator() =========");
		Iterator<Integer> iterator  = intList.iterator();
		
		while(iterator.hasNext()) {
			Integer val = iterator.next();
			
			// 짝수 일때, 
			if(val % 2 == 0) {
				// intList.remove(val); // Error 삭제한 후 어떻게 대처할지 iterator는 모르기 때문
				iterator.remove();
			}
			
		}
		System.out.println(intList);
		
		System.out.println("========= listIterator() =========");
		
		// intList.listIterator(0); = Iterator<Integer> iterator  = intList.iterator();
		ListIterator<Integer> listIterator = intList.listIterator(0);
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}
		
	}
}
