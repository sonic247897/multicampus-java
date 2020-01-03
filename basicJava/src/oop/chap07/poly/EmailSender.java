package oop.chap07.poly;
public class EmailSender extends Sender {
	int length;
	public EmailSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void print() {
		// EmailSender에서만 처리되는 고유의 기능 실행  *전제*
		System.out.println(name+"("+length+")로 전송했습니다.");
	}
}

