package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program {

	public static void main(String[] args) throws IOException {
		
		// ���� ����
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		// ����� 3���� �ʱ�ȭ
		kor1 = 40;
		kor2 = 40;
		kor3 = 50;

		// ������ ���ϴ� �ڵ�
		total = kor1 + kor2 + kor3;

		// ����� ���ϴ� �ڵ�
		avg = /* ������ ���� total */ total / 3.0f;

		
		File file = new File("C:\\Workspace1\\JavaPrj\\data.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		//fos.write('A');
		// PrintStream ��ü �ϳ��� �����Ͻÿ�. �̸��� fout���� �Ͻÿ�.
		PrintStream fout = new PrintStream(fos);
		
		System.out.println("������������������������������������������������������������");
		System.out.println("��           ���� ���          ��");
		System.out.println("������������������������������������������������������������");
		System.out.printf("kor1:%d\n",kor1);
		System.out.printf("kor2:%d\n", kor2);
		System.out.printf("kor3:%d\n", kor3);
		
		System.out.printf("total:%d\n", total);
		System.out.printf("avg:%f\n", avg);
		
		
		
		fout.close();
		fos.close();
		
		System.out.println("�۾��Ϸ�");
		
	}

}
