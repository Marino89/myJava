package part3.ex5.abst.ui;

import java.util.Scanner;

import part3.ex5.abst.entity.NewlecExam;

public class NewlecExamConsole extends  ExamConsole{

	@Override
	protected void onPrint() {
		NewlecExam exam = (NewlecExam)getExam();//
		System.out.println("컴퓨터 : " + exam.getCom());	// TODO Auto-generated method stub
		
	}
	
	@Override
	public void input() {		
		super.input();
		Scanner scan = new Scanner(System.in);
		System.out.print("컴퓨터 >");
		int com = scan.nextInt();
		
		//ExamConsole의 Exam 참조의형식의 개체를 get해서 
		//NewlecExamConsole로 타입변환
		//강제변환 조건은 자식->부모->자식 아닌가?
		NewlecExam exam = (NewlecExam)getExam();		
		exam.setCom(com);
		
		scan.close();
	
	}
	
}
