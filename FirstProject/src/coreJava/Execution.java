package coreJava;

public class Execution {

	public static void main (String [] args) {
		
		Computer refVar1 = new Computer();
		 
		refVar1.model = "HP";
		System.out.println(refVar1.model);
		
		Computer refVar3 = new Computer("Mac");
		System.out.println("its the one "+refVar3.model);
		System.out.println(Computer.keys);
		
		Math math = new Math();
		int newValue = math.calculator1(7,8);
		System.out.println(newValue);
		
		int newValue2= Math.calculator2(10, 5);
		System.out.println(newValue2);
		
	}
}