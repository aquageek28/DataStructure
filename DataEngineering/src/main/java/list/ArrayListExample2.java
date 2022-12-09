package list;

import java.util.ArrayList;

import problems.Email;

/*
	contains()
*/
public class ArrayListExample2 {

	public static void main(String[] args) {
		
		// ############ Integer ############
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(0, 3);
		intList.add(1, 5);
		intList.add(2, 7);
		intList.add(1, 9);
		
		System.out.println(intList);
		
		System.out.println("========= contains() =========");
		System.out.println(intList.contains(3));
		
		// ############ Email ############
		ArrayList<Email> emailList = new ArrayList<Email>();
		
		emailList.add(new Email(0, 2));
		emailList.add(new Email(2, 5));
		emailList.add(new Email(3, 1));
		
		System.out.println(emailList);
		
		System.out.println("========= contains() =========");
		// 새로 생성된 객체이기 때문에 True가 아니다.
		System.out.println(emailList.contains(new Email(0, 2)));
		
		// 1. 이메일의 객체를 잡아서 추가한 후 contains인지 묻는다.
		Email e02 = new Email(0, 2);
		emailList.add(e02);
		
		System.out.println("1. 이메일의 객체를 잡아서 추가한 후 contains인지 묻는다.");
		System.out.println(emailList.contains(e02));
		
		// 2.equals 메소드를 적절히 오버라이딩 한다.
		System.out.println("2. equals 메소드를 적절히 오버라이딩 한다.");
		System.out.println(emailList.contains(new Email(0, 2)));
		
	}

}
