package solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import problems.Email;

/*
	줄의 수, 이벤트의 갯수, 최소, 최대 구하기
*/

public class NeedForList {
	
	public static void eventcount(Email[] data) throws IOException {
		
		int size = 0;
		for (int i = 0; i < data.length; i++) {
			size++;
		}
		System.out.println("이벤트 수 : " + size);
	}
	
	public static void minvalue(Email[] data) throws IOException {

		int min = Integer.MAX_VALUE;	 // 가장 최소의 사람 ID를 담는 min 변수 - 가장 큰 수로 초기화
		for(Email email : data) {
			if(email.from < min) {
				min = email.from;
			}
			if(email.to < min) {
				min = email.to;
			}
		}
		System.out.println("최소 사람 ID : " + min);
	}
	
	public static void maxvalue(Email[] data) throws IOException {
		
		int max = 0;	 // 가장 최대의 사람 ID를 담는 max 변수 - 가장 작은 수로 초기화
		for(Email email : data) {
			if(email.from > max) {
				max = email.from;
			}
			if(email.to > max) {
				max = email.to;
			}
		}
		System.out.println("최대 사람 ID : " + max);
	}

	public static void main(String[] args) throws IOException {
		
		// 시작 시간
		long start = System.currentTimeMillis();
		
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

		eventcount(data);
		minvalue(data);
		maxvalue(data);
		
		// 종료 시간
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}
