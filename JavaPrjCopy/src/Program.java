/*
작성일 : 2021-07-22
작성자 : 뉴렉
저작권 : 아무나
...
*/

class Program{
	public static void main(String[] args){
		ex1.File file;
		
		// 변수 선언
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		byte x = (byte)1L; // 명시적인 형식변환
		
		// 국어성적 3개를 초기화
		kor1 = 40;
		kor2 = 40;
		kor3 = 50;

		// 총점을 구하는 코드
		total = kor1 + kor2 + kor3;

		// 평균을 구하는 코드
		avg = /* 정수형 변수 total */ total / 3;

		// 결과출력
		System.out.printf("total is adsfsadfsaf %d\n", total);
		System.out.printf("avg is %f\n", avg);
	}
}