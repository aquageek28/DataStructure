package array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MinValue {

	public static void main(String[] args) throws IOException {
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
}
