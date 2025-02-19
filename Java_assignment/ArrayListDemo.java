package Modifier.program;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Apple");
		a.add("Banana");
		a.add("Gauva");
		a.add("Strawberry");
		a.add("Pineapple");
		a.add("Graphes");
		a.add("Chennai");
		a.add("Ludhiana");
		a.add("Dancing");
		a.add("Singing");
		
		System.out.println("ArrayList : " + a);
		a.remove("Dancing");
		System.out.println("ArrayList after removing hobby : " + a);
		System.out.println("Contains Cricket? : " + a.contains("cricket"));
		a.remove("Chennai");
		a.remove("Pineapple");
		System.out.println("ArrayList after removing fruit and city : " + a);
		System.out.println("4 :" + a.get(4) + " 6 : "+ a.get(6));
		int i = a.indexOf("Singning");
		a.set(i,"Dancing");
		Collections.reverse(a);
		System.out.println("Reversed List :"+a );
		a.add(4,"Kerala");
		a.add(2,"Mango");
		System.out.println("Printing the list :"+a);
		System.out.println("Substring : "+ a.subList(2,5));
		
		
		


		


		
		
		
		

	}

}