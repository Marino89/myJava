package ex4;

import java.util.Scanner;

public class ForTestProgram {

	public static void main(String[] args) {

		/*
		  10 *                 y=x
		   9 │ *               *
		   8 │ * *           * *
		   7 │ * * *       * * * 
		   6 │ * * * *   * * * * 
		   5 │ * * * * * * * * *
		   4 │ * * * *   * * * *
		   3 │ * * *       * * *
		   2 │ * *           * *
		   1 │ *               * y=-x+10
		───0─*───────────────────*───	
		     0 1 2 3 4 5 6 7 8 9 10
		     │
		     
		     y=x or y=-x+10
*/
		
//		프로그래머(수학/이론) <--> 개발자(developing)
		
		for(int y=0; y<11; y++) {
			for(int x=0; x<11; x++)
				if(y==x || y==-x+10)
					System.out.print("☆");
				else
					System.out.print("　");
			
			System.out.println();
		}
		
		System.out.println();
/*
		  10 *                 y=x
		   9 │ *               *
		   8 │   *           *
		   7 │     *       *
		   6 │       *   *
		   5 │         *
		   4 │       *   *
		   3 │     *       *
		   2 │   *           *
		   1 │ *               * y=-x+10
		───0─*───────────────────*───	
		     0 1 2 3 4 5 6 7 8 9 10
		     │
		     
		     y=x or y=-x+10
*/
//	   *         * 		
//      *       * 		
//       *     *   		
//        *   *   		
//         * *    		
//          *    		
//         * *   		
//        *   *  		
//       *     * 		
//      *       *
//     *		 *
		
//		*				
//		**				
//		***
//		****			
//		*****			
//		******			
//		*******			
//		********	
//		*********		
//		**********	
//		***********	
		
//		*         		
//       *        		
//        *       		
//         *      		
//          *     		
//           *    		
//            *   		
//             *  		
//              * 		
//               *
		
		// TODO Auto-generated method stub
		System.out.println("---<<for 연습 4>>------------");
		// 반복의 반복은 가능한가?
//		**********************************************************************
//		**********\n
//		**********\n
//		**********\n
//		**********\n
//		..
		
		for(int y=0; y<10; y++) {
			for(int x=0; x<10; x++)
				System.out.print("*");
		
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("---<<for 연습 3>>------------");
		// 인덱스를 이용한 규칙을 기반으로 원한느 것만 특별히 대우해주는 코드
		// 1 2 3 4 ... 10 으로 출력되는 코드를
		// [1] 2 3 [4] 5 6 [7] 8 9 [10] => 수열 : an=a1+(n-1)xd
		
		// i+1 	: 1 2 3 4 5 6 7 8 9 10
		// n	: 1 4 7 10 
		
		// 개선된 코드 : 다양한 수열에 유연한 코드
		//int n=1;
		for(int i=0,n=1; i<10; i++)
			//int n=1;
			if(i+1 == 5+(n-1)*3) {
				System.out.printf("[%d] ", i+1);
				n++;
			}
			else
				System.out.printf("%d ", i+1);
		
		System.out.println();
		
		// 개선점이 필요한 코드 : 다양한 수열에 유연하지 않은 코드
		for(int i=0; i<10; i++)
			if(i%3==0)
				System.out.printf("[%d] ", i+1);
			else
				System.out.printf("%d ", i+1);
		
		System.out.println();
		System.out.println("---<<for 연습 2>>------------");
		// 1 2 3 4 ... 10 으로 출력되는 코드를
		// 10 9 8 7 6 5 .. 1 이 출력되도록 하시오.
		// 내림차순으로 내려가는 인덱스를 활용하는 경우
		
		for(int i=0; i<10; i++)
			System.out.printf("%d ", 10-i);
		
		System.out.println();
		
		// 0 1 2 3 ... 9 로 출력되는데 이 것을 1 2 3 4 ... 10 으로 출력되게 하시오.
		
		// 오름차순으로 올라가는 인덱스를 활용하는 경우
		
		for(int i=0; i<10; i++)
			System.out.printf("%d ", i+1);
		
		
		System.out.println();
		System.out.println("---<<for 연습 1>>------------");
		
		// 인덱스를 사용하지 않고 반복 횟수만 중요한 반복
		
		for(int i=0; i<10; i++)
			System.out.print("*");
	}

}
