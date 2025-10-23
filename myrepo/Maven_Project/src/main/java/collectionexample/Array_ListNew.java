package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_ListNew {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<>();
		arr.add("orange");
		arr.add("apple");
		arr.add("grapes");
		arr.add("banana");
		arr.add("kiwi");
		arr.add("watermelon");
		System.out.println(arr);
		
		ArrayList<String> n=new ArrayList<>();
		n.add("pen");
		n.add("paper");
		n.add("pencil");
		n.add("book");
		n.add("sharpner");
		n.add("box");
		System.out.println(n);
		
		//addAll --combine two list together
		System.out.println(arr.addAll(n));
		System.out.println(arr);
		
		//containsall-check whether a list present in another list
		System.out.println(arr.containsAll(n));
		System.out.println(n.containsAll(arr));
		
		//isEmpty(),clear(),remove(),sizeOf()
		System.out.println(arr.remove(10));
		System.out.println(arr);
		
		//Iterator
		System.out.println("Iterator");
		Iterator<String> itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(arr);
		

	}

}
