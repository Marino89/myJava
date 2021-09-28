package part3.ex6.iface;

import java.io.IOException;

import part3.ex5.abst.entity.NewlecExam;
import part3.ex6.iface.ui.ExamConsole;
import part3.ex6.iface.ui.NewlecConsoleListener;

public class Program {

	public static void main(String[] args) throws IOException {
		
		NewlecExam exam = new NewlecExam();		
		ExamConsole console = new ExamConsole();
		console.setExam(exam);
		console.setListener(new NewlecConsoleListener());
		console.input();
		console.print();
		
		
	}
}
