package oop_homework;

public class IosPhone extends CellPhone implements TeleCommunication {

	@Override
	public void text() {
		System.out.println("IosPhone...text");	
	}

	@Override
	public void call() {
		System.out.println("IosPhone...call");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("IosPhone...receive call");
	}

	@Override
	public void vedioCall() {
	System.out.println("IosPhone...vedio call");
	}
}







