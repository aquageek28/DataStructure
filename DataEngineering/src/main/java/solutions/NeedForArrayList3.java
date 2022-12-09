package solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

import problems.Email;

/*
 * E-mail 이벤트를 받는 사람 ID 기반으로 내림차순 정렬
 */
public class NeedForArrayList3 {
	
//  public static Email[] getData() throws IOException {
	public static ArrayList<Email> getData() throws IOException {
//		Email[] data = new Email[420045];
		ArrayList<Email> data = new ArrayList<Email>();
		BufferedReader br = new BufferedReader(new FileReader("./dataset/email.txt"));

//		int index = 0;
		
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
			
			data.add(new Email(from, to));
			
//			data[index++] = new Email(from, to);
			
		}
		br.close();
		
		return data;
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Email> data = getData();
		
		data.sort(new Comparator<Email>() {

			// 음수, 0, 양수로 반환되기만 하면 정렬된다.
			@Override
			public int compare(Email o1, Email o2) {
				if(o1.getTo() < o2.getTo()) {
					return +2;
				} else if (o1.getTo() == o2.getTo()) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		
		ListIterator<Email> listiterator = data.listIterator(data.size());
		while(listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
	}

}
