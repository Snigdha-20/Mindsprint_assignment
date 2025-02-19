package Modifier.program;


abstract class MNC{
	abstract void leaves();
	abstract void holidays();
	
	MNC(){
		System.out.println("MNC Constructor");
	}
	
	void MNfunc() {
		System.out.println("Inside MNC...");
	}
}

abstract class Mindsprint extends MNC{
	abstract void leaves();
	
	void holidays() {
		System.out.println("Closed Holidays...");
	}
}

class Hello extends Mindsprint{
	void leaves() {
		System.out.println("No leave policy for intern");
	}
	void hello_fnc() {
		System.out.println("Inside Hello class...");
	}
}

public class AbstractionEx {

	public static void main(String[] args) {
		
		MNC mnc = new Hello();
		Hello h = new Hello();
		mnc.MNfunc();
		mnc.holidays();
		mnc.leaves();
		h.hello_fnc();
		
	}

}
