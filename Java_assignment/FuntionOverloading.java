package Modifier.program;

public class FuntionOverloading {
	

	
	public void area(int a, int b) {
		System.out.println("The area is = "+(a+b));
		
	}

	float  area(float radius) {
		float res = 3.14f*radius*radius;
		return res;
		
	}
	public void area(int x,int y ,int z) {
		System.out.println("The sum is "+(x+y+z));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuntionOverloading f = new FuntionOverloading();
		f.area(5,7);
		System.out.println("Area of circle = "+f.area(5));
		f.area(3,45,7);
	}

}
