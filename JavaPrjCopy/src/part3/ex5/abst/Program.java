package part3.ex5.abst;

import java.io.IOException;

import part3.ex5.abst.entity.NewlecExam;
import part3.ex5.abst.ui.NewlecExamConsole;

public class Program {

	public static void main(String[] args) throws IOException {
		
		NewlecExam exam = new NewlecExam();		
		NewlecExamConsole console = new NewlecExamConsole();
		console.setExam(exam);
		console.input();
		console.print();
		
		
	}
}
