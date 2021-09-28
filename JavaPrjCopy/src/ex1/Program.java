package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program {

	public static void main(String[] args) throws IOException {
		
		// 변수 선언
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		// 국어성적 3개를 초기화
		kor1 = 40;
		kor2 = 40;
		kor3 = 50;

		// 총점을 구하는 코드
		total = kor1 + kor2 + kor3;

		// 평균을 구하는 코드
		avg = /* 정수형 변수 total */ total / 3.0f;

		
		File file = new File("C:\\Workspace1\\JavaPrj\\data.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		//fos.write('A');
		// PrintStream 객체 하나를 생성하시오. 이름은 fout으로 하시오.
		PrintStream fout = new PrintStream(fos);
		
		System.out.println("┌────────────────────────────┐");
		System.out.println("│           성적 출력          │");
		System.out.println("└────────────────────────────┘");
		System.out.printf("kor1:%d\n",kor1);
		System.out.printf("kor2:%d\n", kor2);
		System.out.printf("kor3:%d\n", kor3);
		
		System.out.printf("total:%d\n", total);
		System.out.printf("avg:%f\n", avg);
		
		
		
		fout.close();
		fos.close();
		
		System.out.println("작업완료");
		
	}

}
