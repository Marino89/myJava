package com.newlecture.game;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.newlecture.game.ui.GameCanvas;

public class Program {

	public static void main(String[] args) {
		//1.JFame 형식의 객체 wind을 생성하고 화면출력을 위해 serVisible()메소드에 true 값을 넣어서 호출하시오.
		
		JFrame win = new JFrame();
		
		win.setVisible(true);
			
		//2. win 객체의 초기 상탱가 맘에 안들어서 크기를 변경하는 setSize 메소드를 통해서 크기를 너비 500, 높이 700으로 설정하자
		// 닫기버튼을 누르면 바로 프로세스를 종료할 수 있도록 setDefaultCloseOperation 메소드를 통해서 JFrame.EXIT_ON_CLOSE 를 설정하자.
		
		win.setSize(500, 700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3. Canvas 객체 canvas를 생성하고 그것을 win 객체의 add() 메소드를 통해서 win 객체의 구성으로 포함시키자.
		Canvas canvas = new GameCanvas();
		win.add(canvas);
		
		//4.
		//Graphics g =  canvas.getGraphics();
		//g.drawLine(0,0,100,100);
		
		// 5. 왜 선이 보이지 않는걸까? 그 이유는 그림을 그리는 절차를 이해해야 한다.
	}

}
