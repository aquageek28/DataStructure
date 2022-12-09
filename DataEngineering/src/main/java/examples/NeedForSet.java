package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import problems.Email;

/*
	e-mail을 보낸 사람의 수를 구하기
*/

public class NeedForSet {
	
	public static Email[] getData() throws IOException {
		Email[] data = new Email[420045];
		BufferedReader br = new BufferedReader(new FileReader("./dataset/email.txt"));

		int index = 0;
		
		while (true) {
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			if (line.startsWith("#")) {
				continue;
			}

			String[] array = line.split("\t");
			
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			
			data[index++] = new Email(from, to);
			
		}
		br.close();
		
		return data;
	}

	public static void main(String[] args) throws IOException {
		Email[] data = getData();
		
		// 265213 이라는 ID가 있는지 확인하기
		for(Email email : data) {
			if(email.getFrom() == 265213) {
				System.out.println("ID 발견 !");
				System.exit(1);
			}
			if(email.getTo() == 265213) {
				System.out.println("ID 발견 !");
				System.exit(1);
			}
		}
		System.out.println("ID를 발견하지 못하였습니다 !");
	}
}
