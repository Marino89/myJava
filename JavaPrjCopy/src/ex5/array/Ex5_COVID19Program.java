package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex5_COVID19Program {

	public static void main(String[] args) throws IOException {
		
		// ������ �������
		int count = 0;
		{
			// ������ ��� ���� �ڵ�� ���⿡�ٰ�
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis,"UTF-8");
			
			while (fscan.hasNextLine()) {
				fscan.nextLine();
				count++; //�ʵ��-1
			}
					
			fscan.close();
			srcFis.close();
			count--;
		}
		
		System.out.println(count);
		
		// ������ �ε�
		String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];
		{		
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
	
			fscan.nextLine();
					
			// �������....
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				
				cities[i] = cols[0];
				dates[i] = cols[1];
				confirmeds[i] = Integer.parseInt(cols[2]);			
			}			
			
			fscan.close();
			srcFis.close();
		}
		
		// �����͸� ����غ���.
		// ���͸�, ����, ����, ��ǩ��(���,����,�߾Ӱ�,��,....)
		
//		System.out.println("�ñ��� Ȯ���ñ� Ȯ���ڼ�");
//		for(int i=0; i<count; i++)
//			System.out.printf("%s %s %d\n", cities[i],dates[i],confirmeds[i]);
		
		// �� �ڵ带 �����ؼ� ��õ���������� ������ ����� ����Ͻÿ�.
				
		
		// �������� ������� �ڷγ� ��Ȳ�� �˰� ��������? _ ����
		// "����"�� ��� ��¥�� �˰� ��������?
		//  1. ��ü�Ⱓ
		//  2. 7��
		//  3. 8��
		//  > _ 
		{
			
			Scanner scan = new Scanner(System.in);
			System.out.print("������ ��� ���� �ڷγ� ��Ȳ�� �˰� ��������? :");
			String city=scan.nextLine();
			
			// ��� �ñ���
						
			System.out.println("�ñ��� Ȯ���ñ� Ȯ���ڼ�");
			for(int i=0; i<count; i++)
				if(cities[i].equals(city))
					System.out.printf("%s %s %d\n", cities[i],dates[i],confirmeds[i]);
		}
		
		// �ε�� ������ ����ϱ�
//		�ñ��� Ȯ���ñ� Ȯ���ڼ�
//		��õ 2020-02-22 2
//		���� 2020-02-22 0
//		...
		
		
		
	}

}
