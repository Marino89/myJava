package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex1_CountProgram {

// �������� ���� ����Ͻÿ�.
// ����� ������ �����ϴ�.
// res/data-count.txt�� ���� ����� ��µǾ�� �Ѵ�.
// count is 14
	
	
	public static void main(String[] args) throws IOException {
		
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		File copyFile = new File("res/data-count.txt");		
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		
		Scanner fscan = new Scanner(srcFis);
		PrintStream fout = new PrintStream(copyFos);

		
//  max �� ���ϴ� ����
//  ������� res/data-max.txt�� ������ ���� ����� ����Ͻÿ�.
//  max is 100
		
		int count = 0;
		
		while(fscan.hasNext()) {
		//for(; fscan.hasNext();){
			fscan.next();
			//   [59 65 90 85 .... ]
			//fscan.next(); // 59�� ��������.			
			//   [65 90 85 .... ]
			//fscan.next(); // 65�� ��������.
			//   [90 85 .... ]
			//fscan.next(); // 90�� ��������.		
			
			count++;			
			
		}
		
		fout.printf("count is %d\n", count);
		
		fscan.close();
		fout.close();
		srcFis.close();		
		copyFos.close();
		
		System.out.println("�۾��Ϸ�");
	}

}
