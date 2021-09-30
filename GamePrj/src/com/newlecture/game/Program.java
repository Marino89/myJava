package com.newlecture.game;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.newlecture.game.ui.GameCanvas;

public class Program {

	public static void main(String[] args) {
		//1.JFame ������ ��ü wind�� �����ϰ� ȭ������� ���� serVisible()�޼ҵ忡 true ���� �־ ȣ���Ͻÿ�.
		
		JFrame win = new JFrame();
		
		win.setVisible(true);
			
		//2. win ��ü�� �ʱ� ���ʰ� ���� �ȵ� ũ�⸦ �����ϴ� setSize �޼ҵ带 ���ؼ� ũ�⸦ �ʺ� 500, ���� 700���� ��������
		// �ݱ��ư�� ������ �ٷ� ���μ����� ������ �� �ֵ��� setDefaultCloseOperation �޼ҵ带 ���ؼ� JFrame.EXIT_ON_CLOSE �� ��������.
		
		win.setSize(500, 700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3. Canvas ��ü canvas�� �����ϰ� �װ��� win ��ü�� add() �޼ҵ带 ���ؼ� win ��ü�� �������� ���Խ�Ű��.
		Canvas canvas = new GameCanvas();
		win.add(canvas);
		
		//4.
		//Graphics g =  canvas.getGraphics();
		//g.drawLine(0,0,100,100);
		
		// 5. �� ���� ������ �ʴ°ɱ�? �� ������ �׸��� �׸��� ������ �����ؾ� �Ѵ�.
	}

}
