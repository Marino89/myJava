package ex2;

public class Program {

	public static void main(String[] args) {
		
		// 1. ���ڿ��� ��
		String str1 = "hello"; // ���ڿ��� �Ϻκ��� ����, ���ڿ��� ũ��, ���ڿ����� Ư�� ���ڿ��� ã��
		String str2 = new String("hello");
				
		
		System.out.println(str1 == str2); // ���� ��ü��~
		System.out.println(str1.equals(str2));
		
		String sub = str1.substring(0, 3);
		
		System.out.println(sub);
		System.out.println(str1);
		
		// 2. ���ڿ� ��ġ��
		String str3 = str1 + str2;
		String str4 = str1 + 1; // -> str1 + "1" -> str1 + new String("1")
		String str5 = str1.concat(str4);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 3. ���ڿ� �ڸ���
		
		
		// 4. ���ڿ��� ���Ե� ���� �Ǵ� ���ڿ� ã��
		String str6 = "hello hey hi";
		int idx = str6.indexOf("h",7);
		System.out.println(idx);
		System.out.println(idx>0?"�ִ�":"����");
	

	}

}
