package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex2_AvgProgram {

	public static void main(String[] args) throws IOException {
		
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			// ...
		}
		
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			// ...
		}
		
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			// ...
		}
		
		
		
		/*
		┌─────────────────────────────────┐
		│             Main Menu           │
		└─────────────────────────────────┘
		1. total
		2. count
		3. avg
		4. exit
		> 1
		
		┌─────────────────────────────────┐
		│              Total              │
		└─────────────────────────────────┘
		total is 511
		
		┌─────────────────────────────────┐
		│             Main Menu           │
		└─────────────────────────────────┘
		1. total
		2. count
		3. avg
		4. exit
		> 4
		
		 */
		
		
		// ---<<main menu 입력 >>---------------------------
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│             Main Menu           │");
		System.out.println("└─────────────────────────────────┘");
		System.out.println("1. count");
		System.out.println("2. total");
		System.out.println("3. avg");
		System.out.println("4. exit");
		System.out.print(">");
		menu = scan.nextInt();
				
		int count = 0;
		
		if(menu == 1) {		
			// --- <<count 계산하기 >> -----------------------------------------------
			{
				File srcFile = new File("res/data.txt");
				FileInputStream srcFis = new FileInputStream(srcFile);
				Scanner fscan = new Scanner(srcFis);
				
				while (fscan.hasNext()) {
					fscan.next();
					count++;
				}
	
				fscan.close();
				srcFis.close();
	
			}
			
			System.out.println("┌─────────────────────────────────┐");
			System.out.println("│              Count              │");
			System.out.println("└─────────────────────────────────┘");
			System.out.printf("Count is %d\n", count);
		}
		
		int total = 0;
		
		if(menu == 2) {
			// --- <<total 계산하기 >> -----------------------------------------------
			{
				File srcFile = new File("res/data.txt");
				FileInputStream srcFis = new FileInputStream(srcFile);
				Scanner fscan = new Scanner(srcFis);
	
				while (fscan.hasNext()) {
					String x_ = fscan.next();
					// fout.print(x_);
	
					int x = Integer.parseInt(x_);
					total += x;
				}
	
				fscan.close();
				srcFis.close();
	
			}
			
			System.out.println("┌─────────────────────────────────┐");
			System.out.println("│              Total              │");
			System.out.println("└─────────────────────────────────┘");
			System.out.printf("Total is %d\n", total);
		}

		// --- <<avg 계산하기 >> -----------------------------------------------
		
		if(menu == 3) {
			double avg = total / (double) count;
			
			System.out.println("┌─────────────────────────────────┐");
			System.out.println("│               Avg               │");
			System.out.println("└─────────────────────────────────┘");
			System.out.printf("Avg is %f.2\n", avg);
		}

		
//		File copyFile = new File("res/data-avg.txt");
//		FileOutputStream copyFos = new FileOutputStream(copyFile);
//		PrintStream fout = new PrintStream(copyFos);
//
//		fout.printf("avg is %.2f\n", avg);
//
//		fout.close();
//		copyFos.close();
		

		// ------------------------------------------------------------------
		System.out.println("작업완료");


	}

}
