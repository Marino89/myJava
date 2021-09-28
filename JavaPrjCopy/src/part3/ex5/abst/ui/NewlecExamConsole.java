package part3.ex5.abst.ui;

import java.util.Scanner;

import part3.ex5.abst.entity.NewlecExam;

public class NewlecExamConsole extends  ExamConsole{

	@Override
	protected void onPrint() {
		NewlecExam exam = (NewlecExam)getExam();
		System.out.println("컴퓨터 : " + exam.getCom());
	}
	
	@Override
	public void input() {		
		super.input();
		Scanner scan = new Scanner(System.in);
		System.out.print("컴퓨터 >");
		int com = scan.nextInt();
		
		NewlecExam exam = (NewlecExam)getExam();		
		exam.setCom(com);
	}
	
}
