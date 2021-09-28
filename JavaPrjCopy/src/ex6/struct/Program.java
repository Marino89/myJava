package ex6.struct;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		GangwonCovid19Status status = new GangwonCovid19Status();
		status.city = "춘천";
		status.date = "2022-08-12";
		status.confirmed = 2;
		
		System.out.println(status.city);
		
		
		// 데이터 개수를 얻기
		int count = 0;
		{
			
		}
		
		count = 9468;
		
		// 데이터 로드하기
		// 데이터 로드
//		String[] cities = new String[count];
//		String[] dates = new String[count];
//		int[] confirmeds = new int[count];
		GangwonCovid19Status[] statuses = new GangwonCovid19Status[count];
		{
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
	
			fscan.nextLine();
					
			// 여기까지....
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				
				statuses[0].city = cols[0];
				dates[i] = cols[1];
				confirmeds[i] = Integer.parseInt(cols[2]);			
			}			
			
			fscan.close();
			srcFis.close();
			
		}
		
		// 춘천 데이터 목록만 출력하기
		
		
	}

}
