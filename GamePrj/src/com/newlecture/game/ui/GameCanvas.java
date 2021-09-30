package com.newlecture.game.ui;

import java.awt.Canvas;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.newlecture.game.item.Fighter;

public class GameCanvas extends Canvas {
//	private Image fighterImag;//변수(필드) 선언
//	private int fighterX;
//	private int fighterY;
	
	private Fighter fighter;
    
	//생성자
	public GameCanvas() {
		fighter = new Fighter(200, 500);
//		fighterX = 200;
//		fighterY = 500;
//		fighterImag = Toolkit
//				.getDefaultToolkit()
//				.getImage("res/images/fighter1.png");// 비동기식 이미지 로딩
	
		this.addMouseListener(new MouseAdapter() {		
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("click");
				int x = e.getX();
				int y = e.getY();
				
//				fighterX = x;
//				fighterY = y;
				fighter.move(x, y);
				
				repaint();
				
			}
		}); 
//		
//		this.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//				//System.out.println(e.getKeyCode());
//				switch(e.getKeyCode()) {
//				case 37:
//					fighterX -= 2;
//					break;
//				case 38:
//					fighterY -= 2;
//					break;
//				case 39:
//					fighterX += 2;
//					break;
//				case 40:
//					fighterY += 2;
//					break;	
//				}
//				repaint();
//			}
//		});
	}
	
	
	
	private static int index = 0;
	
	@Override
	public void paint(Graphics g) {
		System.out.printf("%d : paint\n", ++index);
			
		//image observer: 통보받고 canvas의 paint 메소드 재호출
		//g.drawImage(fighterImag, fighterX, fighterY, this);
		fighter.draw(g);
	}
	

}
