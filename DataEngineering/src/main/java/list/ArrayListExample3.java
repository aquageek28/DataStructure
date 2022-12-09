package list;

import java.util.ArrayList;

import problems.Email;

/*
	get(), IndexOf(), lastIndexOf()
*/
public class ArrayListExample3 {

	public static void main(String[] args) {
		
		// ############ Integer ############
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(0, 3);
		intList.add(1, 5);
		intList.add(2, 5);
		intList.add(1, 9);
		
		System.out.println(intList);
		
		System.out.println("========= get() =========");
		System.out.println(intList.get(0));
		
		System.out.println("========= indexOf() =========");
		System.out.println(intList.indexOf(5));
		
		System.out.println("========= lastIndexOf() =========");
		System.out.println(intList.lastIndexOf(5));
		
		// ############ Email ############
		ArrayList<Email> emailList = new ArrayList<Email>();
		
		emailList.add(new Email(0, 2));
		emailList.add(new Email(2, 5));
		emailList.add(new Email(2, 5));
		emailList.add(new Email(3, 1));
		
		System.out.println(emailList);
		System.out.println("========= get() =========");
		System.out.println(emailList.get(0));
		
		// contains와 마찬가지로 equals를 이용한다.
		System.out.println("========= indexOf() =========");
		System.out.println(emailList.indexOf(new Email(2, 5)));
		
		System.out.println("========= lastIndexOf() =========");
		System.out.println(emailList.lastIndexOf(new Email(2, 5)));
		
	}
}
