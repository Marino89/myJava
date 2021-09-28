package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex5_COVID19Program {

	public static void main(String[] args) throws IOException {
		
		// 데이터 개수얻기
		int count = 0;
		{
			// 갯수를 얻기 위한 코드는 여기에다가
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis,"UTF-8");
			
			while (fscan.hasNextLine()) {
				fscan.nextLine();
				count++; //필드명-1
			}
					
			fscan.close();
			srcFis.close();
			count--;
		}
		
		System.out.println(count);
		
		// 데이터 로드
		String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];
		{		
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
	
			fscan.nextLine();
					
			// 여기까지....
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
		
		// 데이터를 출력해보자.
		// 필터링, 집계, 정렬, 대푯값(평균,종합,중앙값,빈도,....)
		
//		System.out.println("시군명 확진시기 확진자수");
//		for(int i=0; i<count; i++)
//			System.out.printf("%s %s %d\n", cities[i],dates[i],confirmeds[i]);
		
		// 이 코드를 수정해서 춘천지역만으로 한정된 목록을 출력하시오.
				
		
		// 강원도의 어느지역 코로나 상황을 알고 싶은가요? _ 강릉
		// "강릉"의 어느 날짜를 알고 싶으세요?
		//  1. 전체기간
		//  2. 7월
		//  3. 8월
		//  > _ 
		{
			
			Scanner scan = new Scanner(System.in);
			System.out.print("강원도 어느 지역 코로나 상황을 알고 싶은가요? :");
			String city=scan.nextLine();
			
			// 어느 시기의
						
			System.out.println("시군명 확진시기 확진자수");
			for(int i=0; i<count; i++)
				if(cities[i].equals(city))
					System.out.printf("%s %s %d\n", cities[i],dates[i],confirmeds[i]);
		}
		
		// 로드된 데이터 출력하기
//		시군명 확진시기 확진자수
//		춘천 2020-02-22 2
//		원주 2020-02-22 0
//		...
		
		
		
	}

}
