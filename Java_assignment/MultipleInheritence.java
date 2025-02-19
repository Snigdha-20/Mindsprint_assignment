package Modifier.program;

	class Product{
		int id = 78;
		String name = "Amul";
		
		public void display() {
			System.out.println("Id = "+id + " Name = " + name);
		}
	}
	
	class A extends Product{
		int count = 50;
		String category="Butter";
		
		public void display() {
			System.out.println("Count = "+ count+ " Category = "+ category);

		}
	}
	
	 class B extends Product{
		int count=90;
		String category ="Milk";
		
		public void display() {
			System.out.println("Count = "+count + " Category = "+ category);
		}
	}
	 class C extends Product{
		int count=56;
		String category ="Choco";
		
		public void display() {
			System.out.println("Count = "+count + " Category = "+ category);
		}
	}
	
	class SubA extends A{
		int price = 30;
		int total_price = count*price;
		
		public void display() {
			System.out.println("ID = "+id + " Name = "+name + " Category = "+category +" Price = " +total_price);
			}
	}
	
  class SubB extends B{
		int price = 10;
		int total_price= count*price;
		
		public void display() {
			System.out.println("ID = "+id + " Name = "+name + " Category = "+category + " Price = " +total_price);
	 }
	}
public class MultipleInheritence {

	public static void main(String[] args) {
		
		SubA  s = new SubA();
		s.display();
		
		SubB sB= new SubB();
		sB.display();


	}

}
