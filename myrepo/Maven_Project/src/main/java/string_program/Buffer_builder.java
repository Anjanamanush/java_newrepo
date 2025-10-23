package string_program;

public class Buffer_builder {

	public static void main(String[] args) {
		StringBuffer a= new StringBuffer("hello");
		System.out.println(a);
		
		StringBuilder sb=new StringBuilder("Welcome");
		System.out.println(sb);
		
		//insert- insert a new element
		System.out.println(a.insert(5, "o"));
		System.out.println(a);
		
		//append-add new string at last
		System.out.println(a.append("world"));
		
		//replace
		System.out.println(sb.replace(0, 7, "Anjana"));
		System.out.println(a);
		System.out.println(a.replace(5,6," "));
		
		//reverse- 
		System.out.println(sb.reverse());
		
		//delete
		System.out.println(sb.delete(0, 2));
	

	}

}
