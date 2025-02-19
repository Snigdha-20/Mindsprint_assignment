package Modifier.program;

public class Calculate {
	
	public int compute(int a,int b){
		return (a+b);
	}
	
	public float compute(float a,float b) {
		return(a-b);
	}
	public long compute(long a,long b) {
		return (a/b);
	}
	
	public double compute(double a, double b) {
		return (a*b);
	}

	public static void main(String[] args) {
		
		Calculate c = new Calculate();
		System.out.println("Sum = "+c.compute(5,5));
		System.out.println("Subtract = "+c.compute(5.0f,5.0f));
		System.out.println("Divide  = "+c.compute(5L,5L));
		System.out.println("Mutliply = "+c.compute(5.25,5.25));



		

	}

}
