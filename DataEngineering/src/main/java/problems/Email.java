package problems;

public class Email {
	// 데이터 추상화
	public int from;	// 보낸 사람 
	public int to;		// 받는 사람 
	// 프로시저 추상
	
	public Email(int from, int to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	public String toString() {
		return from + " -> " + to;
	}
}
