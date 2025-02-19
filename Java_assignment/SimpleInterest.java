package Modifier.program;

public class SimpleInterest {
	
	public void calculateSI(float p, int  rate, int time) {
		float amount = (p* rate * time )/100;
		float si = p + amount;
		System.out.println("Amount = "+ amount);
		System.out.println("Simple interest = " + si);
	}
	
	
	public static void main(String[] args){
		
		SimpleInterest s = new SimpleInterest();
		s.calculateSI(23000,2, 2);
		
	}

}
