package ex2;

public class Program {

	public static void main(String[] args) {
		
		// 1. 문자열이 비교
		String str1 = "hello"; // 문자열의 일부분을 추출, 문자열의 크기, 문자열에서 특정 문자열을 찾기
		String str2 = new String("hello");
				
		
		System.out.println(str1 == str2); // 같은 객체냐~
		System.out.println(str1.equals(str2));
		
		String sub = str1.substring(0, 3);
		
		System.out.println(sub);
		System.out.println(str1);
		
		// 2. 문자열 합치기
		String str3 = str1 + str2;
		String str4 = str1 + 1; // -> str1 + "1" -> str1 + new String("1")
		String str5 = str1.concat(str4);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 3. 문자열 자르기
		
		
		// 4. 문자열에 포함된 문자 또는 문자열 찾기
		String str6 = "hello hey hi";
		int idx = str6.indexOf("h",7);
		System.out.println(idx);
		System.out.println(idx>0?"있다":"없다");
	

	}

}
