package part3.ex6.iface.ui;

public class NewlecConsoleListener implements ConsoleListener {

	@Override
	public void onPrint() {
		System.out.println("새로운 출력!!");		
	}

	@Override
	public void onInput() {
		System.out.println("새로운 입력!!");
	}
	
}
