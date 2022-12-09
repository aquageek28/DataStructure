package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import problems.Email;

/*
	100000 이전과 다음 ID 찾기 
	= 100000 이상 수 중에서 최솟값을 찾는 문제 
	= 100000 이하 수 중에서 최댓값을 찾는 문제
*/

public class NeedForTree {
	
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
		
		int higher = Integer.MAX_VALUE;
		int lower = 0;
		for(Email email: data) {
			int from = email.getFrom();
			int to = email.getTo();
			
			if(from > 100000 && from < higher) {
				higher = from;
			} else if (from < 100000 && from > lower) {
				lower = from;
			}
			
			if(to > 100000 && to < higher) {
				higher = to;
			} else if(to < 100000 && to > lower) {
				lower = to;
			}
		}
		System.out.println("100000 다음의 수 : " + higher);
		System.out.println("100000 이전의 수 : " + lower);
	}
}
