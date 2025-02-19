package Modifier.program;
import java.util.*;
import java.util.LinkedHashSet;

public class CollectionEx {

	public static void main(String[] args) {
		
//		LinkedHashSet l1 = new LinkedHashSet();
//		l1.add(1);
//		l1.add(2);
//		l1.add(3.5f);
//		l1.add(3.6f);
//		l1.add('a');
//		l1.add('b');
//		l1.add(true);
//		System.out.println(" LinkedHashSet = "+l1);
//		
//		l1.add(4);
//		l1.add(5);
//		l1.remove(2);
//		System.out.println(" LinkedHashSet after removing 2 = "+l1);
//		
//		System.out.println("5 is present or not : "+ l1.contains(5));
//		
//		l1.clear();
//		System.out.println(" Removing all element " +l1);
		
		LinkedHashSet<Integer> l2= new LinkedHashSet<Integer>();
		
		Scanner sc= new Scanner(System.in);		
		System.out.println("Enter 10 elements ");
		
		for(int i=0;i<10;i++) {
			l2.add (sc.nextInt());		
			
		}
		System.out.println(l2);
		
		System.out.println("Enter two more element ");
		l2.add(sc.nextInt());
		l2.add(sc.nextInt());
		System.out.println(l2);
		
		System.out.println("Contains string ? "+ l2.contains("s"));
		
		System.out.println("Enter number to delete ");
		int r = sc.nextInt();
		l2.remove(r);
		System.out.println(l2);

		
        System.out.println("5 is present or not : "+ l2.contains(5));
		
		l2.clear();
		System.out.println(" Removing all element " +l2);
		
		

		

		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
