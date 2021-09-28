package part3.ex5.abst.ui;

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
		console.onPrint();
		
/*
          				         ui.ExamConsole   		
		         		         default / private / protected / public
  d-p/d-c(entity.Program)	        X         X          X         O	
  s-p/d-c(ui.Program)               O         X          O         O
  d-p/ÀÚ½Ä-c(entity.NewlecConsole)   X         X          O         O
*/	
	}
}
