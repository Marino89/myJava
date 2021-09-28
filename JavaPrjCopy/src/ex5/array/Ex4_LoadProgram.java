package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex4_LoadProgram {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// 1. 데이터의 개수 알아보기, 그 값은 count 변수를 준비해서 담을 것.
		int count = 0;
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			while (fscan.hasNext()) {
				fscan.next();
				count++;
			}

			fscan.close();
			srcFis.close();
		}
		
		// 2. count의 값 크기의 배열 객체 생성하기. 참조명은 nums
		int[] nums = new int[count];
		{
		// 3. nums 배열(큰방)에 res/data.txt의 데이터를 읽어서 로드한다.
		// 3-1 nums 배열을 모두 1로 채우는 코드를 작성한다. 단 반복문을 사용할 것.		
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			for(int i=0; i<count; i++) {
				String temp = fscan.next();
				nums[i] = Integer.parseInt(temp);
			}

			fscan.close();
			srcFis.close();
		}
		
		// 4. nums 배열의 값을 반복문을 이용해서 출력하시오.
		
		for(int i=0; i<count; i++)
			System.out.printf("%d ", nums[i]);
		
		System.out.println("\n---------------------------------");
				
		// 배열에서 특정 데이터를 찾는 능력
		int index = -1;
		{
			// 다음 버전 : 다음 코드를 74가 아닌 사용자가 입력한 값을 검색하는 프로그램으로 변경한다.			
			// 1. 사용자에서 검색하고 싶은 숫자를 입력 받는다. 변수명은 num
			int num = 0;
//			{
//				Scanner scan = new Scanner(System.in);
//				System.out.print("검색할 숫자를 입력하세요 : ");
//				num = scan.nextInt();
//			}
			
			// 반복적으로 돌면서 찾아보자..			
			for(int i=0; i<count; i++)
				// 너냐? 네가 74냐? 그렇다
				if(nums[i] == num) {
					//index에 현재 위치를 넘기고
					index = i;
					// break;
					break;
				}
		}
		
		System.out.printf("index : %d\n", index);
		
		System.out.println("\n---------------------------------");
		// 배열에서 위치를 바꾸거나 값을 변경하는 능력
		
		// 이전 상태의 출력
		for(int i=0; i<count; i++)
			//nums의 인덱스 위치의 값을 출력
			System.out.printf("%d ", nums[i]);
		
		System.out.println("\n---------------------------------");
		
		// nums 배열에서 첫번째 변수와 두 번째 변수의 값을 교환하시오.
		/*
		int temp;
		temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
		*/
		
		// 위의 연산은 0과 1 위치의 값을 바꾸는 것이었다.
		// 이번에는 반복적으로 i<->i+1 위치의 값을 바꾸는 예제로 변경해보자. 반복횟수는 count-1로 한다.
		// 실행된 출력 결과는 0번째 값이 제일 뒤로 밀려난 상태여야 한다.
		for(int k=0; k<count-1; k++)
			for(int i=0; i<count-1-k; i++){
				// 교환되는 두 값 중에서 앞에 있는 값이 클 때만 교환하자.
				// 즉. 만약에 앞의 값이 더 크다면(클때만) 자리바꾸기 => 코드화
				// 1. 구문작성 능력
				// 2. 에러해결 능력
				// 3. 문제해결 능력(?)
				// 							
				
				if(nums[0+i] > nums[1+i]) {
					// 자리바꾸기
					int temp;
					temp = nums[0+i];
					nums[0+i] = nums[1+i];
					nums[1+i] = temp;
				}
				
				
				Thread.sleep(1000/4);  // 4 FPS
				
				// 콘솔 화면 이전 내용 밀어내기
				for(int j=0; j<100; j++)
					System.out.println();
				// 중간 과정의 데이터 출력하기
				for(int j=0; j<count; j++)
					if(j==i+0 || j==i+1)
						System.out.printf("[%d] ", nums[j]);
					else
						System.out.printf("%d ", nums[j]);
				
			}
		
		
		
		
		// 콘솔 화면 이전 내용 밀어내기
		for(int j=0; j<100; j++)
			System.out.println();
		System.out.println("---<최종 결과>------------------------------");
		// 이후 상태의 출력
		for(int i=0; i<count; i++)
			//nums의 인덱스 위치의 값을 출력
			System.out.printf("%d ", nums[i]);
		
		System.out.println("\n---------------------------------");
		
		//---------------------------------------
		
		// 정렬(평균,중앙값[정렬될 데이터의 가운 값],최대값,최소값,..)
		
		

	}

}
