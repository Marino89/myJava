package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex4_LoadProgram {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// 1. �������� ���� �˾ƺ���, �� ���� count ������ �غ��ؼ� ���� ��.
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
		
		// 2. count�� �� ũ���� �迭 ��ü �����ϱ�. �������� nums
		int[] nums = new int[count];
		{
		// 3. nums �迭(ū��)�� res/data.txt�� �����͸� �о �ε��Ѵ�.
		// 3-1 nums �迭�� ��� 1�� ä��� �ڵ带 �ۼ��Ѵ�. �� �ݺ����� ����� ��.		
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
		
		// 4. nums �迭�� ���� �ݺ����� �̿��ؼ� ����Ͻÿ�.
		
		for(int i=0; i<count; i++)
			System.out.printf("%d ", nums[i]);
		
		System.out.println("\n---------------------------------");
				
		// �迭���� Ư�� �����͸� ã�� �ɷ�
		int index = -1;
		{
			// ���� ���� : ���� �ڵ带 74�� �ƴ� ����ڰ� �Է��� ���� �˻��ϴ� ���α׷����� �����Ѵ�.			
			// 1. ����ڿ��� �˻��ϰ� ���� ���ڸ� �Է� �޴´�. �������� num
			int num = 0;
//			{
//				Scanner scan = new Scanner(System.in);
//				System.out.print("�˻��� ���ڸ� �Է��ϼ��� : ");
//				num = scan.nextInt();
//			}
			
			// �ݺ������� ���鼭 ã�ƺ���..			
			for(int i=0; i<count; i++)
				// �ʳ�? �װ� 74��? �׷���
				if(nums[i] == num) {
					//index�� ���� ��ġ�� �ѱ��
					index = i;
					// break;
					break;
				}
		}
		
		System.out.printf("index : %d\n", index);
		
		System.out.println("\n---------------------------------");
		// �迭���� ��ġ�� �ٲٰų� ���� �����ϴ� �ɷ�
		
		// ���� ������ ���
		for(int i=0; i<count; i++)
			//nums�� �ε��� ��ġ�� ���� ���
			System.out.printf("%d ", nums[i]);
		
		System.out.println("\n---------------------------------");
		
		// nums �迭���� ù��° ������ �� ��° ������ ���� ��ȯ�Ͻÿ�.
		/*
		int temp;
		temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
		*/
		
		// ���� ������ 0�� 1 ��ġ�� ���� �ٲٴ� ���̾���.
		// �̹����� �ݺ������� i<->i+1 ��ġ�� ���� �ٲٴ� ������ �����غ���. �ݺ�Ƚ���� count-1�� �Ѵ�.
		// ����� ��� ����� 0��° ���� ���� �ڷ� �з��� ���¿��� �Ѵ�.
		for(int k=0; k<count-1; k++)
			for(int i=0; i<count-1-k; i++){
				// ��ȯ�Ǵ� �� �� �߿��� �տ� �ִ� ���� Ŭ ���� ��ȯ����.
				// ��. ���࿡ ���� ���� �� ũ�ٸ�(Ŭ����) �ڸ��ٲٱ� => �ڵ�ȭ
				// 1. �����ۼ� �ɷ�
				// 2. �����ذ� �ɷ�
				// 3. �����ذ� �ɷ�(?)
				// 							
				
				if(nums[0+i] > nums[1+i]) {
					// �ڸ��ٲٱ�
					int temp;
					temp = nums[0+i];
					nums[0+i] = nums[1+i];
					nums[1+i] = temp;
				}
				
				
				Thread.sleep(1000/4);  // 4 FPS
				
				// �ܼ� ȭ�� ���� ���� �о��
				for(int j=0; j<100; j++)
					System.out.println();
				// �߰� ������ ������ ����ϱ�
				for(int j=0; j<count; j++)
					if(j==i+0 || j==i+1)
						System.out.printf("[%d] ", nums[j]);
					else
						System.out.printf("%d ", nums[j]);
				
			}
		
		
		
		
		// �ܼ� ȭ�� ���� ���� �о��
		for(int j=0; j<100; j++)
			System.out.println();
		System.out.println("---<���� ���>------------------------------");
		// ���� ������ ���
		for(int i=0; i<count; i++)
			//nums�� �ε��� ��ġ�� ���� ���
			System.out.printf("%d ", nums[i]);
		
		System.out.println("\n---------------------------------");
		
		//---------------------------------------
		
		// ����(���,�߾Ӱ�[���ĵ� �������� ���� ��],�ִ밪,�ּҰ�,..)
		
		

	}

}
