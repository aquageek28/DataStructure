package solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
	줄의 수, 이벤트의 갯수, 최소, 최대 구하기
*/

public class NeedForArray {
	
	public static void linecount() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./dataset/email.txt"));

		int lineCount = 0;	 // 줄 수를 담는 line 변수
		
		while (true) {
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			lineCount++;
			
			if (line.startsWith("#")) {
				continue;
			}
		}
		
		System.out.println("줄 수: " + lineCount);
		br.close();
	}
	
	public static void eventcount() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./dataset/email.txt"));

		int eventCount = 0;	 // 이벤트 수를 담는 eventCount 변수
		
		while (true) {
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			if (line.startsWith("#")) {
				continue;
			}
			
			eventCount++;
			
		}
		
		System.out.println("이벤트 수: " + eventCount);
		br.close();
	}
	
	public static void minvalue() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./dataset/email.txt"));

		int min = Integer.MAX_VALUE;	 // 가장 최소의 사람 ID를 담는 min 변수 - 가장 큰 수로 초기화
		
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
			
			if (from < min) {
				min = from;
			}
			int to = Integer.parseInt(array[1]);
			
			if (to < min) {
				min = from;
			}
		}
		
		System.out.println("최소 사람 ID: " + min);
		br.close();
	}
	
	public static void maxvalue() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./dataset/email.txt"));

		int max = 0;	 // 가장 최대의 사람 ID를 담는 max 변수 - 가장 작은 수로 초기화
		
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
			
			if (from > max) {
				max = from;
			}
			int to = Integer.parseInt(array[1]);
			
			if (to > max) {
				max = from;
			}
		}
		
		System.out.println("최대 사람 ID: " + max);
		br.close();
	}

	public static void main(String[] args) throws IOException {
		
		// 시작 시간
		long start = System.currentTimeMillis();
		
		linecount();
		eventcount();
		minvalue();
		maxvalue();
		
		// 종료 시간
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}
