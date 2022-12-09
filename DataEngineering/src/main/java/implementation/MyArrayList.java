package implementation;

import java.util.ArrayList;
import java.util.List;

import problems.Email;

public class MyArrayList {

	public static void main(String[] args) {
		/*
		 * List<Integer> intList = new ArrayList<Integer>();
		 * System.out.println(intList.isEmpty());
		 * System.out.println(intList.size());
		 * 
		 * List<String> stringList = new ArrayList<String>();
		 * System.out.println(stringList.isEmpty());
		 * System.out.println(stringList.size());
		 * 
		 * List<Email> emailList = new ArrayList<Email>();
	 	 * System.out.println(emailList.isEmpty());
	 	 * System.out.println(emailList.size());
	 	 * 
		 */


		List<Integer> intList = new MyArrayListImpl<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		System.out.println(intList.add(0));
		intList.add(0, 1);
		intList.add(1, 2);
		intList.add(2, 3);
		
		System.out.println(intList);
		
		List<String> stringList = new MyArrayListImpl<String>();
		System.out.println(stringList.isEmpty());
		System.out.println(stringList.size());
		System.out.println(stringList.add("3"));
		
		List<Email> emailList = new MyArrayListImpl<Email>();
		System.out.println(emailList.isEmpty());
		System.out.println(emailList.size());
		System.out.println(emailList.add(new Email(0, 3)));
	}

}
