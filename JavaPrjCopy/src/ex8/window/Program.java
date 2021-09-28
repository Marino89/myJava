package ex8.window;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Program {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GameCanvas canvas =  new GameCanvas();
		frame.add(canvas);
		frame.setBounds(100,10,700,500);
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
//		canvas.paint(g);  setVisible()/repaint()-> update()->paint();
		
	}

}
