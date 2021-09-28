package part2.ex1.func;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	
	static int total() throws IOException{
		
		int result = 0;
		
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan1 = new Scanner(srcFis);
		
		while (fscan1.hasNext()) {
			String x_ = fscan1.next();
			// fout.print(x_);
			
			int x = Integer.parseInt(x_);
			result += x;
		}

		fscan1.close();
		srcFis.close();

		return result;
	}
	
	//static int count = 0;
	
	static int count() throws IOException{
		int result = 0;		
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);

		while (fscan.hasNext()) {
			fscan.next();
			result++;
		}
		fscan.close();
		srcFis.close();
		
		return result;
	}
	
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
		Scanner scan = new Scanner(System.in);
		
		김지원: while (true) {
			int menu;

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

			switch (menu) {
			case 1: {
				// --- <<count 계산하기 >> -----------------------------------------------
				int count = count();
				
				printCount(count); // 매개값이 과적재(overload) 된 함수
				//printCount(); // 기본값을 이용해서 알아서 출력해~
				

			}
				break;

			case 2: {
				// --- <<total 계산하기 >> -----------------------------------------------
				int total = total();
				

				System.out.println("┌───────────┐");
				System.out.println("│               Total             │");
				System.out.println("└───────────┘");
				System.out.printf("Total is %d\n", total);
			}
				break;

			case 3: {
				// --- <<avg 계산하기 >> -----------------------------------------------
				int count = count();
				// --------------------------------------
				int total = total();
				// -----------------------------------------------
				double avg = total / (double) count;

				System.out.println("┌────────────┐");
				System.out.println("│              Average             │");
				System.out.println("└────────────┘");
				System.out.printf("Average is %.2f\n", avg);
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

}
