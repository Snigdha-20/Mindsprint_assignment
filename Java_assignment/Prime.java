package Modifier.program;

public class Prime {
	
	public boolean checkp (int i) {
		int f=0;
		if(i==0 || i ==1) {
			return false;
		}
		else {
			for(int n=2;n<i;n++) {
				if (i%n==0) {
					f=1;
					break;
				}
			}
		}
		if(f==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime p = new Prime() ;
		if (p.checkp(4)==true) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is  not prime");

		}

	}

}
