package ex4;

public class �������α׷� {

	public static void main(String[] args) {
		for(int y=0; y<11; y++) {  //y��ǥ��
			for(int x=0; x<11; x++)// x��ǥ��
//				if(y*y==4*x)		
				
				if((y>=x && y<=-x+10)||(y<=x && y>=-x+10)) // ����
					System.out.print("��"); //������
				else
					System.out.print("��");//�Ҹ�����
			System.out.println();
		}


	}

}
