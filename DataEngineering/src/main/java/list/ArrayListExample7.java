package list;

import java.util.ArrayList;
import java.util.Comparator;

import problems.Email;

/*
	sort()
*/
public class ArrayListExample7 {

	public static void main(String[] args) {
		
		// ############ Integer ############
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(3);
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(1);
		
		System.out.println(intList);
		
		System.out.println("========= sort() =========");
		
		// interface를 구현한 class의 instance를 이용한다.
		intList.sort(new MyIntegerComparator());
		System.out.println(intList);
		
		// Descending (Anonymous Class)
		intList.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				if(o1 < o2) {
					return +1;
				} else if (o1 == o2) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		
		System.out.println(intList);
		
		
		// ############ Email ############
		ArrayList<Email> emailList = new ArrayList<Email>();
		
		emailList.add(new Email(0, 2));
		emailList.add(new Email(2, 5));
		emailList.add(new Email(5, 2));
		emailList.add(new Email(3, 1));
		
		System.out.println(emailList);
		
		System.out.println("========= sort() =========");
		emailList.sort(new Comparator<Email>() {

			@Override
			public int compare(Email o1, Email o2) {
				
				if(o1.getFrom() < o2.getFrom()) {
					return +1;
				} else if (o1.getFrom() == o2.getFrom()) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		
		System.out.println(emailList);
		
		emailList.sort(new Comparator<Email>() {

			@Override
			public int compare(Email o1, Email o2) {
				
				if(o1.getTo() < o2.getTo()) {
					return +1;
				} else if (o1.getTo() == o2.getTo()) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		
		System.out.println(emailList);
		
	}
}
