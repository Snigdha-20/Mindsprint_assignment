package Modifier.program;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.*;


public class LinkedEx {

	public static void main(String[] args) {
		LinkedList<String> l  = new LinkedList<String>();
		l.add("May");
		l.add("June");
		l.add("July");
		l.add("August");
		l.add("April");
		l.add("November");
		
		l.addLast("December");
		l.addFirst("January");
		int i1 = l.indexOf("April");
	
		
		l.add(i1,"Febuary");
		l.add(i1+1,"March");
	
		
		int i2= l.indexOf("November");
		l.add(i2,"September");
		l.add(i2+1,"October");

		 
		 l.add(1,"Febuary");
		 l.add(2,"March");
		 l.add(3,"April");

		 
		 l.remove(8);
		 l.remove(8);
		 l.remove(8);
		 System.out.println("List in order : "+l);


		 
		 //Even months
		 System.out.println("Even months :");

		 for(int i=0;i<11;i++) {
			 if((i+1)%2==0) {
				 System.out.println(l.get(i));
			 }
		 }
		 System.out.println();

		 System.out.println("Odd months :");
		 for(int i=0;i<11;i++) {
			 if((i+1)%2!=0) {
				 System.out.println(l.get(i));
			 }
		 }
		 //iterator
		 System.out.println();

		 System.out.println(" Iterator :");
		 Iterator it = l.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 System.out.println(" First Month: "+l.get(0) + "Last Month : "+ l.get(11));
		 l.remove("November");
		 System.out.println(" After removing birthday month :"+ l);
		 System.out.println("Contains winter month (Dec)?"+ l.contains("December"));
		 System.out.println(" First Month: "+l.peekFirst() + "Last Month : "+ l.peekLast());
		 System.out.println(" First Month: "+l.pollFirst() + "Last Month : "+ l.pollLast());
		 System.out.println(l);

		 

		 
		 

		 



		 
				

	}

}
