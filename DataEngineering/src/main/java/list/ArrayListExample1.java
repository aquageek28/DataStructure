package list;

import java.util.ArrayList;

import problems.Email;

/*
	isEmpyty(), size(), add()
*/
public class ArrayListExample1 {

	public static void main(String[] args) {
		
		// ############ Integer ############
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		System.out.println("========= add() =========");
		intList.add(3);
		intList.add(5);
		intList.add(9);
		
		intList.add(2, 7);
		
		System.out.println(intList);
		
		System.out.println("========= isEmpty() =========");
		System.out.println(intList.isEmpty());
		
		System.out.println("========= size() =========");
		System.out.println(intList.size());
		
		// ############ String ############
		ArrayList<String> stringList = new ArrayList<String>();
		
		System.out.println("========= add() =========");
		stringList.add("3");
		stringList.add("5");
		stringList.add("9");
		
		stringList.add(2, "7");
		
		System.out.println(stringList);
		
		System.out.println("========= isEmpty() =========");
		System.out.println(stringList.isEmpty());
		
		System.out.println("========= size() =========");
		System.out.println(stringList.size());
		
		// ############ Email ############
		ArrayList<Email> emailList = new ArrayList<Email>();
		
		System.out.println("========= add() =========");
		emailList.add(new Email(3, 5));
		emailList.add(new Email(3, 7));
		emailList.add(new Email(3, 9));
		
		emailList.add(2, new Email(3, 12));
		
		System.out.println(emailList);
		
		System.out.println("========= isEmpty() =========");
		System.out.println(emailList.isEmpty());
		
		System.out.println("========= size() =========");
		System.out.println(emailList.size());
		
	}

}
