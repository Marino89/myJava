package ex4;

public class TestProgram {

	public static void main(String[] args) {
		package ex2.control;

		import java.util.Scanner;

		public class TestProgram답지 {

		   public static void main(String[] args) {
		      
		      
		      /*
		      >>> for 문 연습문제 <<<      
		       */
		      
		      // 1. System.out.printf("%c", '┼');을 100번 반복해서 다음과 같은 모양으로 출력하시오.
		      //    (폰트를 굴림으로 하면 조금 더 이쁜 격자형 화면을 볼 수 있다. 설정방법 : Window>Preferences>General>Appearance>Colors and Fonts>Basic>Text Font : Edit)

		      //      ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		      
		      {
		         System.out.println("--<1번 문제 풀이>----------------------");
		         for(int x=0; x<100; x++)
		            System.out.printf("%c", '┼');
		         
		         System.out.println();
		      }
		      
		         
		      
		      // 2. 1번 문제에서 풀이한 코드를 복사해서 '┼'문자가 결과가 다음처럼 10x10개의 격자모양으로 출력되도록 수정하시오.
		      
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
		      
		      System.out.println("--<2번 문제 풀이>----------------------");
		      
		      for(int y=0; y<10; y++) {
		         for(int x=0; x<10; x++) 
		            System.out.printf("%c", '┼');
		         
		         System.out.println();
		      }
		      
		      System.out.println();
		      
		      //  3. 2번 문제에서 풀이한 코드를 복사해서 결과가 다음처럼 boar의 테두리를 보강하는 코드로 수정하시오.
		      
//		      --<3번 문제 풀이>----------------------
//		      ┌┬┬┬┬┬┬┬┬┬┬┐
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      └┴┴┴┴┴┴┴┴┴┴┘
		      
		      {
		         System.out.println("--<3번 문제 풀이>----------------------");
		         
		         for(int y=0; y<12; y++) {
		            for(int x=0; x<12; x++)
		               
		               if(x==0 && y==0)
		                  System.out.printf("%c", '┌');
		               else if(x==11 && y==0)
		                  System.out.printf("%c", '┐');
		               else if(x==0 && y==11)
		                  System.out.printf("%c", '└');
		               else if(x==11 && y==11)
		                  System.out.printf("%c", '┘');
		               else if(y==0)
		                  System.out.printf("%c", '┬');
		               else if(y==11)
		                  System.out.printf("%c", '┴');
		               else if(x==0)
		                  System.out.printf("%c", '├');
		               else if(x==11)
		                  System.out.printf("%c", '┤');
		               else
		                  System.out.printf("%c", '┼');
		            
		            System.out.println();
		         }
		         
		         System.out.println();
		      }
		      
		      //  4. 3번 문제에서 풀이한 코드를 복사해서 다음처럼 바둑알 흰돌이 출력되도록  수정하시오.
		      
//		      --<4번 문제 풀이>----------------------
//		      ┌┬┬┬┬┬┬┬┬┬┬┐
//		      ├○┼┼┼┼┼┼┼┼┼┤
//		      ├┼○┼┼┼┼┼┼┼┼┤
//		      ├┼┼○┼┼┼┼┼┼┼┤
//		      ├┼┼┼○┼┼┼┼┼┼┤
//		      ├┼┼┼┼○┼┼┼┼┼┤
//		      ├┼┼┼┼┼○┼┼┼┼┤
//		      ├┼┼┼┼┼┼○┼┼┼┤
//		      ├┼┼┼┼┼┼┼○┼┼┤
//		      ├┼┼┼┼┼┼┼┼○┼┤
//		      ├┼┼┼┼┼┼┼┼┼○┤
//		      └┴┴┴┴┴┴┴┴┴┴┘
		      {
		         System.out.println("--<4번 문제 풀이>----------------------");
		         
		         for(int y=0; y<12; y++) {
		            for(int x=0; x<12; x++)            
		               
		               if(x==0 && y==0)
		                  System.out.printf("%c", '┌');
		               else if(x==11 && y==0)
		                  System.out.printf("%c", '┐');
		               else if(x==0 && y==11)
		                  System.out.printf("%c", '└');
		               else if(x==11 && y==11)
		                  System.out.printf("%c", '┘');
		               else if(y==x)
		                  System.out.printf("%c", '○');
		               else if(y==0)
		                  System.out.printf("%c", '┬');
		               else if(y==11)
		                  System.out.printf("%c", '┴');
		               else if(x==0)
		                  System.out.printf("%c", '├');
		               else if(x==11)
		                  System.out.printf("%c", '┤');
		               else
		                  System.out.printf("%c", '┼');
		            
		            System.out.println();
		         }
		         
		         System.out.println();
		      }
		      
		      
		   //  5. 4번 문제에서 풀이한 코드를 복사해서 다음처럼 바둑알 흰돌이 입력 받아서 출력되도록  수정하시오.
		      
//		      --<5번 문제 풀이>----------------------
//		      ┌┬┬┬┬┬┬┬┬┬┬┐
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      └┴┴┴┴┴┴┴┴┴┴┘
		//
//		      위의 오목판에 오목을 두기 위한 위치를 입력하세요. 입력 방법: x sp y > 3 4
//		      ┌┬┬┬┬┬┬┬┬┬┬┐
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼○┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      ├┼┼┼┼┼┼┼┼┼┼┤
//		      └┴┴┴┴┴┴┴┴┴┴┘
		      
		      
		      {
		         System.out.println("--<5번 문제 풀이>----------------------");      
		                           
		         for(int y=0; y<12; y++) {
		            for(int x=0; x<12; x++)            
		               
		               if(x==0 && y==0)
		                  System.out.printf("%c", '┌');
		               else if(x==11 && y==0)
		                  System.out.printf("%c", '┐');
		               else if(x==0 && y==11)
		                  System.out.printf("%c", '└');
		               else if(x==11 && y==11)
		                  System.out.printf("%c", '┘');
		               else if(y==0)
		                  System.out.printf("%c", '┬');
		               else if(y==11)
		                  System.out.printf("%c", '┴');
		               else if(x==0)
		                  System.out.printf("%c", '├');
		               else if(x==11)
		                  System.out.printf("%c", '┤');
		               else
		                  System.out.printf("%c", '┼');
		            
		            System.out.println();
		         }
		         
		         System.out.println();
		         
		         
		         int ox = -1;
		         int oy = -1;
		         Scanner scan = new Scanner(System.in);
		         System.out.print("위의 오목판에 오목을 두기 위한 위치를 입력하세요. 입력 방법: x sp y > ");
		         ox = scan.nextInt();
		         oy = scan.nextInt();
		         
		         
		         for(int y=0; y<12; y++) {
		            for(int x=0; x<12; x++)            
		               
		               if(x==0 && y==0)
		                  System.out.printf("%c", '┌');
		               else if(x==11 && y==0)
		                  System.out.printf("%c", '┐');
		               else if(x==0 && y==11)
		                  System.out.printf("%c", '└');
		               else if(x==11 && y==11)
		                  System.out.printf("%c", '┘');
		               else if(y == oy && x == ox)
		                  System.out.printf("%c", '○');
		               else if(y==0)
		                  System.out.printf("%c", '┬');
		               else if(y==11)
		                  System.out.printf("%c", '┴');
		               else if(x==0)
		                  System.out.printf("%c", '├');
		               else if(x==11)
		                  System.out.printf("%c", '┤');
		               else
		                  System.out.printf("%c", '┼');
		            
		            System.out.println();
		         }
		         
		         System.out.println();
		      }
		      
		   //  6. 5번 문제를 응용해서 오목을 반복적으로 입력 받는 코드를 작성하려고 했다. 하지만 그것이 불가능하거나 비효율적이었다.
//		      왜 그런지 본인이 코드를 작성해보면서 느낀 점을 기술하시오. ( 단. 배열을 사용하지 말 것)
		      
		      /* 
		      입력 받기 위한 변수가 개별적인 이름을 가짐으로써오목을 입력 받는 코드를 반복문으로 흐름을 반복하지 못하고 직접 복사/붙여넣기로 반복해야만 했다.  
		       */
		      
		      
		      /*
		      ====================================================================================================================
		      >>> 배열 연습문제 <<<      
		       */
		      
		         
		      // 1. 다음 세 개의 단계를 순차적으로 작성하시오.
		      // 1-1. 문자(char) 100개를 저장할 수 있는 문자 배열 객체를 생성하시오. 객체 이름은 board로 한다.
		      char[] board = new char[100];
		      // 1-2. 1-1번 문제에서 생성한 board 배열에 문자 '┼'를 모두 채우시오.(단. for문 하나만 사용할 것)
		      for(int i=0; i<100; i++)
		         board[i] = '┼';      
		      // 1-3  board 배열의 내용을 출력하시오.  단. 다음
		      
		      
		      
		      
		      

		      //  1-1 : 문자(char) 100개를 저장할 수 있는 문자 배열 객체를 생성하시오. 객체 이름은 board로 한다.
		      
		      //  1-2 : 문자(char) 100개를 저장할 수 있는 문자 배열 객체를 생성하시오. 객체 이름은 board로 한다.
		      
		      //  1-3 : 문자(char) 100개를 저장할 수 있는 문자 배열 객체를 생성하시오. 객체 이름은 board로 한다.


		      //      ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		      
		      System.out.println("--<1번 문제 풀이>----------------------");
		      for(int x=0; x<100; x++)
		         System.out.printf("%c", '┼');
		      
		      System.out.println();
		      
		      
		         
		      
		      // 2. '┼'문자가 결과가 다음처럼 10x10개의 격자모양으로 출력되도록 1번 문제에서 풀이한 코드를 복사해서 수정하시오.
		      
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
//		      ┼┼┼┼┼┼┼┼┼┼
		      
		      System.out.println("--<2번 문제 풀이>----------------------");
		      
		      for(int y=0; y<10; y++) {
		         for(int x=0; x<10; x++) 
		            System.out.printf("%c", '┼');
		         
		         System.out.println();
		      }
		      
		      System.out.println();
		      
		      //  3. ''문자가 결과가 다음처럼 출력되도록 2번 문제에서 풀이한 코드를 복사해서 수정하시오.
		      System.out.println("--<3번 문제 풀이>----------------------");
		      
		      for(int y=0; y<12; y++) {
		         for(int x=0; x<12; x++)
		            
		            if(x==0 && y==0)
		               System.out.printf("%c", '┌');
		            else if(x==11 && y==0)
		               System.out.printf("%c", '┐');
		            else if(x==0 && y==11)
		               System.out.printf("%c", '└');
		            else if(x==11 && y==11)
		               System.out.printf("%c", '┘');
		            else if(y==0)
		               System.out.printf("%c", '┬');
		            else if(y==11)
		               System.out.printf("%c", '┴');
		            else if(x==0)
		               System.out.printf("%c", '├');
		            else if(x==11)
		               System.out.printf("%c", '┤');
		            else
		               System.out.printf("%c", '┼');
		         
		         System.out.println();
		      }
		      
		      System.out.println();
		      
		      //  4. ''문자가 결과가 다음처럼 출력되도록 2번 문제에서 풀이한 코드를 복사해서 수정하시오.
		      System.out.println("--<4번 문제 풀이>----------------------");
		      
		      for(int y=0; y<12; y++) {
		         for(int x=0; x<12; x++)
		            
		            
		            if(x==0 && y==0)
		               System.out.printf("%c", '┌');
		            else if(x==11 && y==0)
		               System.out.printf("%c", '┐');
		            else if(x==0 && y==11)
		               System.out.printf("%c", '└');
		            else if(x==11 && y==11)
		               System.out.printf("%c", '┘');
		            else if(y==x)
		               System.out.printf("%c", '○');
		            else if(y==0)
		               System.out.printf("%c", '┬');
		            else if(y==11)
		               System.out.printf("%c", '┴');
		            else if(x==0)
		               System.out.printf("%c", '├');
		            else if(x==11)
		               System.out.printf("%c", '┤');
		            else
		               System.out.printf("%c", '┼');
		         
		         System.out.println();
		      }
		      
		      System.out.println();
		      
		      
		      
		      
		      
		      
		      
		   }

		}

	}

}
