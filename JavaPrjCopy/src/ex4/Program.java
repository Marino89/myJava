package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		File copyFile = new File("res/data-result.txt");		
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		
		Scanner fscan = new Scanner(srcFis);
		PrintStream fout = new PrintStream(copyFos);
		
		// 반복의 두가지 유형
		// 1. 어떤 조건이 만족될 때까지... 계속 무한히... 반복
		// 2. 특정 수만큼만 반복하는 반복 *******
		
//		int i=0;
//		int total = 0;
//				
//		
//		while(i<5 && fscan.hasNext())
//		{
//			String x_ = fscan.next();
//			//fout.print(x_);
//			
//			int x = Integer.parseInt(x_);
//			total += x;
//			
//			i++;
//		}
		
		
		int total = 0;
				
		for(int i=0; i<5 && fscan.hasNext(); i++){
			String x_ = fscan.next();
			//fout.print(x_);
			
			int x = Integer.parseInt(x_);
			total += x;
			
			
		}
		
		fout.printf("total is %d\n", total);
		
		fscan.close();
		fout.close();
		srcFis.close();		
		copyFos.close();
		
		System.out.println("작업완료");
		
	}

}
