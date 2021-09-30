package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	private Image img;
	private int x;
	private int y;
	
	public Fighter(int x, int y) {
		x = 200;
		y = 500;
		
		img =  Toolkit.getDefaultToolkit().getImage("res/images/fighter1.png");
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g){
		g.drawImage(img, x, y, null);
	}
}
