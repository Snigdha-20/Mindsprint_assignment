package Modifier.program;
import java.util.*;

public class Hashmp {

	public static void main(String[] args) {
		Map<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(91, "India");
		lhm.put(880, "Bangladesh");
		lhm.put(94, "Sri Lanka");
		lhm.put(92, "Pakistan");
		lhm.put(93, "Afghanistan");
		lhm.put(86, "China");
		lhm.put(39, "Italy");
		lhm.put(57, "Colombia");
		lhm.put(49, "Germany");
		lhm.put(254, "Kenya");
		
		System.out.println("All keys : "+ lhm.keySet());
		System.out.println("All values : "+ lhm.values());
		System.out.println("India Exists ? : "+ lhm.containsValue("India"));
		System.out.println("45 Exists ? : "+ lhm.containsKey(45));
		lhm.remove(86);
		System.out.println("After Removing: "+ lhm);
		
		Map<Integer,String> l = new LinkedHashMap<Integer,String>();
		l.put(3,"Punjab");
		l.put(4, "Uttarakhand");
		l.put(7, "Delhi");

		
		
		l.putAll(lhm);
		System.out.println("after Merging : "+l);
		System.out.println("Empty or not ? "+ l.isEmpty());
		l.clear();
		System.out.println("After clearing : "+l);






	}

}
