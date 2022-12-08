package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataRead {

	public static void main(String[] args) throws IOException {
		// Command + shift + F --- 자동 형식 맞춤
		BufferedReader br = new BufferedReader(new FileReader("./dataset/email.txt"));

		while (true) {
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			if (line.startsWith("#")) {
				continue;
			}
			// 데이터는 "숫자 \t 숫자"로 이루어져있다. -> [숫자, 숫자] 배열로 변경
			String[] array = line.split("\t");
			
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);

			System.out.println(new Email(from, to));
		}
		br.close();
	}
}
