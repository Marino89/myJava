package part3.ex6.iface.ui;

public class NewlecConsoleListener implements ConsoleListener {

	@Override
	public void onPrint() {
		System.out.println("���ο� ���!!");		
	}

	@Override
	public void onInput() {
		System.out.println("���ο� �Է�!!");
	}
	
}
