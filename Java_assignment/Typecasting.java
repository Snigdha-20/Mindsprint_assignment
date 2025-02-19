package Modifier.program;

public class Typecasting {
	
		
		public int area(int d1, int d2) {
			int res= ( d1 *d2)/2;
			return res;
		}
		
		public int area(float radius) {
			float res = 3.14f* radius* radius;
			int ans= (int) res;
			return ans;
			
		}
		
		public float area (float l,float b) {
			return l*b;
		}
		
		public long area(int side) {
			return side*side;
		}
	
	
	public static void main(String[] args) {
		
		Typecasting tc  = new Typecasting();
		System.out.println("Area of rohmbus = " + tc.area(4,5));
		System.out.println("Area of Circle= " + tc.area(1.5f));
		System.out.println("Area of rectangle = " + tc.area(2.5f,3.5f));
		System.out.println("Area of sqaure = " + tc.area(4));



	}

}
