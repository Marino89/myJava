package part3.ex2.oop.capsule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	// 생성자 : Constructor
	public Exam() {
		this(1,1,1);
	}
		
	public Exam(int kor, int eng, int math) {		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void print() {
		
		Scanner scan = new Scanner(System.in);
		
		if (this == null) {
			System.out.println("성적이 입력되지 않았습니다. (Exam 객체가 존재하지 않음)");
			return;
		}

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 출력              │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + this.eng);
		System.out.println("수학 : " + this.math);

		int total = this.kor + this.eng + this.math;
		System.out.println("총점 :" + total);
		System.out.printf("평균 : %.2f\n", (total / 3.0));
	}

	public void input() {		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 출력              │");
		System.out.println("└───────────────────────────────────┘");
		
		System.out.println("국어 >");
		kor = scan.nextInt();
		System.out.println("영어 >");
		eng = scan.nextInt();
		System.out.println("수학 >");
		math = scan.nextInt();
		
	}
	
	public void load() throws IOException {
		
		File file = new File("res/data.txt");		
		FileInputStream fis = new FileInputStream(file);
		Scanner scan = new Scanner(fis);

		String[] tmps = scan.nextLine().split(",");

		scan.close();
		fis.close();

		kor = Integer.parseInt(tmps[0]);
		eng = Integer.parseInt(tmps[1]);
		math = Integer.parseInt(tmps[2]);

	}
	
	public void save() throws IOException {		

		File file = new File("res/data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);

		ps.printf("%d,%d,%d\n", kor, eng, math);

		ps.close();
		fos.close();
	}
}
