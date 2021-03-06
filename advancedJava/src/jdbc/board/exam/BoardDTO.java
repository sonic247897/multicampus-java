package jdbc.board.exam;

import java.sql.Date;

public class BoardDTO {
	// private으로 선언 (보안)
	// 컬럼명과 변수 이름을 맞춘다.
	private int boardNum;
	private String id;
	private String title;
	private String content;
	// java.sql.Date
	private Date writeDate;
	private int hit;
	
	public BoardDTO() {
		
	}
	// insert용
	public BoardDTO(String id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	// select용
	public BoardDTO(int boardNum, String id, String title, String content, Date writeDate, int hit) {
		super();
		this.boardNum = boardNum;
		this.id = id;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.hit = hit;
	}
	
	// 나머지는 굳이 매개변수 한두개 있는데 생성자를 따로 만들 필요는 없다.
	
	@Override
	public String toString() {
		return "BoardDTO [boardNum=" + boardNum + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + ", hit=" + hit + "]";
	}
	
	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}
