package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		
		//add() to add elements to the collection
		
		l.add("green");
		l.add("yellow");
		l.add("red");
		l.add("blue");
		System.out.println(l);
		
		//set()-to set an element in particular index
		l.set(1, "pink");
		System.out.println(l);
		l.add("red");
		System.out.println(l);
		
		//indexOf()-to return particular index of repeated elements.
		//it returns the first occurrence
		l.indexOf("red");
		System.out.println(l.indexOf("red"));
		
		//lastindexOf()-return the last occurence of a
		//specified index
		System.out.println(l.lastIndexOf("red"));
		
		//get()-to view the specified element
		System.out.println(l.get(3));
		
		//contains-to check whether an element is present or not
		System.out.println(l.contains("pink"));
		System.out.println(l.contains("orange"));
		
		
		//isEmpty()-to check empty or not
		System.out.println(l.isEmpty());
		
		//remove()-to remove an element using index
		System.out.println(l.remove(2));
		System.out.println(l);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(" for loop list "+l.get(i));
		}
		for(String s:l)
		{
			System.out.println(s);
		}
		
	}

}
