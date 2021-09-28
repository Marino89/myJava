package part2.ex2.func.reuse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	

	
	// 기본(값을 가지는) 함수
	static void printCount(){
		
		// 문장..반복		
		
		printCount();
	}
	
	// 오버로드(적재된 것이 더 많은) 함수
	static void printCount(int count){
		
		System.out.println("┌────────────┐");
		System.out.println("│                Count              │");
		System.out.println("└────────────┘");
		System.out.printf("Count is %d\n", count);
		
	}

	public static void main(String[] args) throws IOException {
		// --- << main menu 입력 >> -------------------
				
		김지원: while (true) {
			//int menu = inputMenu();

			switch (inputMenu()) {
			case 1: {
				// --- <<count 계산하기 >> -----------------------------------------------
				int count = KorExam.count();
				
				printCount(count); // 매개값이 과적재(overload) 된 함수
				//printCount(); // 기본값을 이용해서 알아서 출력해~
				

			}
				break;

			case 2: {
				// --- <<total 계산하기 >> -----------------------------------------------
				int total = KorExam.total();
				printTotal(total);


			}
				break;

			case 3: {
				// --- <<avg 계산하기 >> -----------------------------------------------
				int count = KorExam.count();
				// --------------------------------------
				int total = KorExam.total();
				// -----------------------------------------------
				double avg = total / (double) count;

				printAvg(avg);

			}
				break;

			case 4:
				System.out.println("Bye~~");
				break 김지원; // while 문을 벗어날 수 있나? 이거 뭐지?

//					default:
//						System.out.println("메뉴를 잘못 입력하셨습니다.");
			}

		}

		System.out.println("작업완료");
	}

	static int inputMenu() {
		
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("┌────────────┐");
			System.out.println("│             Main Menu          │");
			System.out.println("└────────────┘");
			System.out.println("1. count");
			System.out.println("2. total");
			System.out.println("3. avg");
			System.out.println("4. exit");
			System.out.print(">");

			menu = scan.nextInt();

			if (menu > 4)
				System.out.println("메뉴를 잘못 입력하셨습니다.");

		} while (menu > 4);
		
		return menu;
	}

	static void printAvg(double avg) {
		System.out.println("┌────────────┐");
		System.out.println("│              Average             │");
		System.out.println("└────────────┘");
		System.out.printf("Average is %.2f\n", avg);
	}

	static void printTotal(int total) {
		System.out.println("┌───────────┐");
		System.out.println("│               Total             │");
		System.out.println("└───────────┘");
		System.out.printf("Total is %d\n", total);	
	}


}
