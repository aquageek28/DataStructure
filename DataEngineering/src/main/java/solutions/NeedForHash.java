package solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import problems.Email;

/*
	'265213' ID가 있는지 확인하기
*/

public class NeedForHash {

	public static Email[] getData() throws IOException {
		Email[] data = new Email[420045];
		BufferedReader br = new BufferedReader(new FileReader("./dataset/email.txt"));

		int index = 0;

		while (true) {
			String line = br.readLine();

			if (line == null) {
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

		// 보낸 사람을 Integer[] senders
		Integer[] senders = new Integer[300000];
		int count = 0;
		for (Email email : data) {
			int from = email.from;
			for (int i = 0; i < senders.length; i++) {
				if (senders[i] == null) {
					// from이 senders에 없으면, 추가 가능
					senders[i] = from;
					break;
				}
				if (senders[i] == from) {
					break;
				}
			}
			System.out.println(count++);
		}
		// senders는 보낸 사람의 ID를 중복없이 앞에서부터 채워 놓았음.
		int senderCount = 0;
		for (int i = 0; i < senders.length; i++) {
			if(senders[i] == null) {
				break;
			}
			senderCount++;
		}
		System.out.println("보낸 사람의 수 : " + senderCount);
	}
}
