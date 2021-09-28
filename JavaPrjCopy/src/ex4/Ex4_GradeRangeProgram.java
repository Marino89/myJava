package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex4_GradeRangeProgram {

	public static void main(String[] args) throws IOException {
		File data = new File("res/ex4/data-grade.txt");

		FileInputStream fis = new FileInputStream(data);
		Scanner scan = new Scanner(fis);

		File gradePath = new File("res/ex4");
		if (!gradePath.exists())
			gradePath.mkdir();

		FileOutputStream fos = new FileOutputStream("res/ex4/data-grade-range.txt");
		PrintStream fout = new PrintStream(fos);
		
		김현포레버:
		while (scan.hasNext()) {
			
			String x = scan.next(); // "D";
			
			switch(x) {			
			case "A+":
				fout.print("95~100");
				break;
			case "A":
				fout.print("90~94");
				break;
			case "B+":
				fout.print("85~89");
				break;
			case "B":
				fout.print("80~84");
				break;
			case "C+":
				fout.print("75~79");
				break;
			case "C":
				fout.print("70~74");
				break;
			case "D+":
				fout.print("65~69");
				break;
			case "D":
				fout.print("60~64");
				break;
			case "F":
				fout.print("0~59");
				break;
			default:
				System.out.println("치명적인 데이터 손상으로 프로그램을 종료하겠습니다.");
				break 김현포레버;
			}
			
			System.out.println("test" + x);
			
//			if(x.equals("A+"))
//				fout.print("95~100");
//			else if(x.equals("A"))
//				fout.print("90~94");
//			else if(x.equals("B+"))
//				fout.print("85~89");
//			else if(x.equals("B"))
//				fout.print("80~84");
//			else if(x.equals("C+"))
//				fout.print("75~79");
//			else if(x.equals("C"))
//				fout.print("70~74");
//			else if(x.equals("D+"))
//				fout.print("65~69");
//			else if(x.equals("D"))
//				fout.print("60~64");
//			else
//				fout.print("0~59");
			
			// 마지막이 아니라면
			if(scan.hasNext())
				fout.print(",");
			
		}


		scan.close();
		fis.close();

		fout.close();
		fos.close();

		System.out.println("실행완료");
	}

}
