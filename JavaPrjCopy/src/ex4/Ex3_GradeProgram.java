package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex3_GradeProgram {

	public static void main(String[] args) throws IOException {

		/*
			������ �ű�� ���α׷�
	
			�Է����� : res/data.txt
			������� : res/ex4/data-grade.txt
			
			if(95~100)
				fout.print("A+ ");
			else if()
			
			95~100 -> A+
			90~94 -> A
			85~89 -> B+
			80~84 -> B
			75~79 -> C+
			70~74 -> C
			65~69 -> D+
			60~64 -> D
			0 ~59 -> F
		
		 */
		
		File data = new File("res/data.txt");

	      FileInputStream ris = new FileInputStream(data);
	      Scanner sc = new Scanner(ris);
	      
	      File gradePath = new File("res/ex4");
	      if (!gradePath.exists())
	         gradePath.mkdir();

	      FileOutputStream fos = new FileOutputStream("res/ex4/data-grade.txt");
	      PrintStream ps = new PrintStream(fos);

	      int gradeInt = 0;
	      String grade = "";
	      String total = "";
	      
	      while (sc.hasNext()) {
	         String g = sc.next();
	         gradeInt = Integer.parseInt(g);
	         
	         if(gradeInt > 100 || gradeInt < 0) {
	            ps.print("������ �߸��ԷµǾ����ϴ�.");
	            break;
	         }
	         
	         if (gradeInt >= 95) 
	            grade = "A+ ";
	          else if (gradeInt >= 90) 
	            grade = "A ";
	          else if (gradeInt >= 85) 
	            grade = "B+ ";
	          else if (gradeInt >= 80) 
	            grade = "B ";
	          else if (gradeInt >= 75) 
	            grade = "C+ ";
	          else if (gradeInt >= 70) 
	            grade = "C ";
	          else if (gradeInt >= 65) 
	            grade = "D+ ";
	          else if (gradeInt >= 60) 
	            grade = "D ";
	          else
	            grade = "F ";
	         
	         
	         total += grade;
	      }
	            
	      ps.printf("%s", total);
	      System.out.println("����Ϸ�");

	      sc.close();
	      ris.close();
	      
	      ps.close();
	      fos.close();	

	}

}
