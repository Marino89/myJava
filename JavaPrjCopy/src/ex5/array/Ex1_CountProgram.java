package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex1_CountProgram {

// 데이터의 수를 출력하시오.
// 결과는 다음과 같습니다.
// res/data-count.txt에 다음 결과가 출력되어야 한다.
// count is 14
	
	
	public static void main(String[] args) throws IOException {
		
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		File copyFile = new File("res/data-count.txt");		
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		
		Scanner fscan = new Scanner(srcFis);
		PrintStream fout = new PrintStream(copyFos);

		
//  max 를 구하는 숙제
//  결과값은 res/data-max.txt에 다음과 같은 결과룰 출력하시오.
//  max is 100
		
		int count = 0;
		
		while(fscan.hasNext()) {
		//for(; fscan.hasNext();){
			fscan.next();
			//   [59 65 90 85 .... ]
			//fscan.next(); // 59가 남겨진다.			
			//   [65 90 85 .... ]
			//fscan.next(); // 65가 남겨진다.
			//   [90 85 .... ]
			//fscan.next(); // 90이 남겨진다.		
			
			count++;			
			
		}
		
		fout.printf("count is %d\n", count);
		
		fscan.close();
		fout.close();
		srcFis.close();		
		copyFos.close();
		
		System.out.println("작업완료");
	}

}
