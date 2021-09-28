package ex8.window;

import java.awt.Canvas;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameCanvas extends Canvas {
	
	Image img;
	int dy = 0;
	
//	int[] xs = new int[4];
//	int[] ys = new int[4];
//	int[] ws = new int[4];
//	int[] hs = new int[4];
	
	Puzzle[] puzzles = new Puzzle[4]; // Puzzle은 x, y, width, height
		
	public GameCanvas() {
		// TODO Auto-generated constructor stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/images/kooki2-small.png");	
		
		
		Puzzle puzzle = new Puzzle();
		
		// 화면에 출력할 위치/크기 데이터
		puzzle.x = 0;
		puzzle.y = 0;
		puzzle.width = 150;
		puzzle.height = 150;
		
		// 이미지의 위치/크기 데이터
		puzzle.sx = 0;
		puzzle.sy = 0;
		puzzle.sWidth = 150;
		puzzle.sHeight = 150;
		
		puzzles[0] = puzzle;
	}
	
	@Override
	public boolean mouseDown(Event evt, int x, int y) {
			
		if(150<=x && x <=300 && 0<=y && y<=150)
			dy += 150;
		
		repaint();
		
		return true;
	}	
	
	@Override
	public void paint(Graphics g) {
		// 캔바스에 그림 그리기
		//Graphics g = canvas.getGraphics();
		g.drawLine(10, 10, 100, 100);
				
		//g.drawImage(img,0,0,this);
		//g.drawImage(img, 0, 0, 700, 500, this);
//		g.drawImage(img, 
//				200,200,200+200,200+200,
//				0,0,200,200,this);
		
		// source 1 -> display 2 
//		g.drawImage(img, 
//				150,dy,150+150,dy+150,
//				0,0,0+150,0+150,this);
//		
//		// source 2 -> display 3
//		g.drawImage(img, 
//				0,150,0+150,150+150,
//				150,0,150+150,0+150,this);
		2x2   4x4 3x3
		
		for(4번)
			
		
		
		
	}
}




