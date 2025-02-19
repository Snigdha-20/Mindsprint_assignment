package Modifier.program;

public class Even {
	
	public boolean checknum(int a){
		if(a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Even e = new Even();
		if(e.checknum(4)==true) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");

		}
		

	}

}
