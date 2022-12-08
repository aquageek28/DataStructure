package array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxValue {

	public static void main(String[] args) throws IOException {
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
}
