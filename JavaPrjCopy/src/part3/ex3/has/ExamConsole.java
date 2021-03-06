package part3.ex3.has;

import java.util.Scanner;

public class ExamConsole {
	
	// Exam 객체 exam을 has a 상속해주세요.
	private Exam exam;
	
	public ExamConsole() {
		// 1. Composition Has A 관계
		// this.exam = new Exam();
	}	
	
	// 오버로드 생성자
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}

	// 1. Association Has A 관계
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void print() {

		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 출력              │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println("국어 : " + exam.getKor());
		System.out.println("영어 : " + exam.getEng());
		System.out.println("수학 : " + exam.getMath());

		int total = this.exam.total();
		double avg = this.exam.avg();
		System.out.println("총점 :" + total);
		System.out.printf("평균 : %.2f\n", avg);
	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 입력              │");
		System.out.println("└───────────────────────────────────┘");

		System.out.println("국어 >");
		int kor = scan.nextInt();
		System.out.println("영어 >");
		int eng = scan.nextInt();
		System.out.println("수학 >");
		int math = scan.nextInt();
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

	}
}
