package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
		File srcFile = new File("res/data.txt");
		
		// 1. srcFile�� �Է½�Ʈ�� ��ü �ϳ��� �����. �̸��� srcFis�� �Ѵ�.
		FileInputStream srcFis = new FileInputStream(srcFile);
		// 3. "res/data-copy.txt"������ �����ϱ� ���� File ��ü�� �����. �̸��� copyFile�� �Ѵ�.
		File copyFile = new File("res/data-copy.txt");
		
		// 4. copyFile�� ��½�Ʈ�� ��ü�� �����. �̸��� copyFos�� �Ѵ�.
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		
		int x;
		boolean done = false;
		
		while(!done)
		{
			x = srcFis.read();
			
			if(x<0)
				break;
			
//			if(x>'5')
//				continue;
				
			if(x=='0')
				copyFos.write('?');			
			else if(x==' ')
				copyFos.write('*');
			else
				copyFos.write(x);
			
//			if(x==' ')
//				copyFos.write('\n');
		}
		
		
		// 2. srcFis ��ü�� �ݴ´�.
		srcFis.close();
		// 5. copyFos�� �ݴ´�.
		copyFos.close();
		
		System.out.println("�۾��Ϸ�");
		
	}

}
