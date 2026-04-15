import java.util.*;
public class Hash{
	public static void main(String[] args){
		HashSet<String> hs = new  HashSet<>();
		hs.add("java");
	    hs.add("c++");
	    hs.add("python");
	    hs.add("python");
	    hs.add("java");
	    hs.add("c");
	    System.out.println(hs);
		
		
		TreeSet<String> h = new  TreeSet<>();
		h.add("java");
	    h.add("c++");
	    h.add("python");
	    h.add("python");
	    h.add("java");
	    h.add("c");
	    System.out.println(h);
		Iterator it = h.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		LinkedHashSet<String> s = new  LinkedHashSet<>();
		s.add("java");
	    s.add("c++");
	    s.add("python");
	    s.add("python");
	    s.add("java");
	    s.add("c");
	    System.out.println(s);
	}
}