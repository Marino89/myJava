package part3.ex3.has;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		// Dependency : 종속성-부품,재료
		Exam exam = new Exam();
		
		// Constructor DI
		// Constructor Dependency Injection
		ExamConsole console = new ExamConsole(exam);
		
		// Setter Dependency Injection
		// Setting : Injection : 주입, 조립
		//console.setExam(exam);
		
		
		
		while (true) {
			int menu = inputMenu();
			
			switch (menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.print();
				break;
			case 3:
				exam.load();
				break;
			case 4:
				exam.save();
				break;
			case 5:
				exitProgram();
				break;
			}
		}

	}

	// Program의 Bottom 구성
	private static void exitProgram() {
		System.out.println("Bye~~");
		System.exit(0);
	}







	private static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);

		int menu = 0;

		System.out.println("┌────────────────────────────────┐");
		System.out.println("│      성적관리 Main Menu          │");
		System.out.println("└────────────────────────────────┘");
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 읽기");
		System.out.println("4. 저장");
		System.out.println("5. 종료");
		System.out.print(">");
		menu = scan.nextInt();

		return menu;
	}

}
