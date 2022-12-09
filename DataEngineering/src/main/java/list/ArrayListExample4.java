package list;

import java.util.ArrayList;

import problems.Email;

/*
	set(), remove()
*/
public class ArrayListExample4 {

	public static void main(String[] args) {
		
		// ############ Integer ############
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(0, 3);
		intList.add(1, 5);
		intList.add(2, 6);
		intList.add(3, 9);
		
		System.out.println(intList);
		
		intList.add(4, 12);
		
		System.out.println(intList);
		
		System.out.println("========= set() =========");
		intList.set(2, 7);

		System.out.println(intList);
		
		System.out.println("========= remove() =========");
		intList.remove(Integer.valueOf(5));
		System.out.println(intList);
		
		intList.remove(0);
		System.out.println(intList);
		
		// ############ Email ############
		ArrayList<Email> emailList = new ArrayList<Email>();
		
		emailList.add(new Email(0, 2));
		emailList.add(new Email(2, 5));
		emailList.add(new Email(3, 7));
		emailList.add(new Email(3, 1));
		
		System.out.println(emailList);
		
		System.out.println("========= set() =========");
		emailList.set(2, new Email(4, 2));
		
		System.out.println(emailList);
		
		System.out.println("========= remove() =========");
		emailList.remove(new Email(0, 2));
		
		System.out.println(emailList);
	}
}
