package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("apple");
		s.add("banana");
		s.add("orange");
		s.add("grapes");
		s.add("avocado");
		System.out.println(s);
		
		Set<String> st=new HashSet<String>();
		st.add("red");
		st.add("green");
		st.add("blue");
		st.add("yellow");
		st.add("black");
		st.add("red"); //duplicate entry is not possible in set
		System.out.println(st);
		
		//addAll
		System.out.println(s.addAll(st));
		System.out.println(s);
		
		//contains()
		System.out.println(s.contains("red"));
		
		//containsAll()
		System.out.println(s.containsAll(st));
		
		//size()
		System.out.println(s.size());
		
		//remove
		System.out.println(s.remove("avocado"));
		System.out.println(s);
		
		//isEmpty()
		System.out.println(s.isEmpty());
		
		//clear
		s.clear();
		System.out.println(s);
		
	}

}
