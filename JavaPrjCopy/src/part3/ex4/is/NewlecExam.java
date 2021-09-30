package part3.ex4.is;

public class NewlecExam extends Exam {//Is-A 상속
	// 컴퓨터 과목 새로 추가
	private int com;
	
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public NewlecExam() {
		this(0,0,0,0);
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	
	// override
	public int total() {
		return super.total()+com;
	}
}
