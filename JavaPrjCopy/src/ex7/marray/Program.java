package ex7.marray;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		{
			int[] lottos = new int[3*6];
			{
				File srcFile = new File("res/ex7/lotto.data");
				FileInputStream srcFis = new FileInputStream(srcFile);
				Scanner fscan = new Scanner(srcFis, "UTF-8");
				
				for (int j=0;j<3 && fscan.hasNext();j++)
					for (int i=0;i<6 && fscan.hasNext();i++) {
						String temp = fscan.next();
						int num = Integer.parseInt(temp);
						lottos[j*6+i] = num;
					}
	
				fscan.close();
				srcFis.close();
			}
		}
//----------------------------------------------------------
		{
			int[][] lottos = new int[3][6];
			{
				File srcFile = new File("res/ex7/lotto.data");
				FileInputStream srcFis = new FileInputStream(srcFile);
				Scanner fscan = new Scanner(srcFis, "UTF-8");
				
				for (int j=0;j<3 && fscan.hasNext();j++)
					for (int i=0;i<6 && fscan.hasNext();i++) {
						String temp = fscan.next();
						int num = Integer.parseInt(temp);
						lottos[j][i] = num;
					}
	
				fscan.close();
				srcFis.close();
			}
			
			
						
			for(int j=0; j<3; j++) {
				
				System.out.printf("%d번: ", j+1);
				
				for(int i=0; i<6; i++)
					System.out.printf("%d ", lottos[j][i]);
			
				System.out.println();
			}
			
			//---------------------------------------
			int[] temp;
			temp = lottos[0];
			lottos[0] = lottos[2];
			lottos[2] = temp;	
						
			// ---------------------------------------
			
			System.out.println("--바뀐 후의 배열-------------------------------------");
			
			for(int j=0; j<3; j++) {
				
				System.out.printf("%d번: ", j+1);
				
				for(int i=0; i<6; i++)
					System.out.printf("%d ", lottos[j][i]);
			
				System.out.println();
			}
		}
	}

}
