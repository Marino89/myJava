package ex4;

public class 숙제프로그램 {

	public static void main(String[] args) {
		for(int y=0; y<11; y++) {  //y좌표계
			for(int x=0; x<11; x++)// x좌표계
//				if(y*y==4*x)		
				
				if((y>=x && y<=-x+10)||(y<=x && y>=-x+10)) // 조건
					System.out.print("☆"); //만족시
				else
					System.out.print("　");//불만족시
			System.out.println();
		}


	}

}
