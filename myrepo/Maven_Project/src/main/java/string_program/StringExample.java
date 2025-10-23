package string_program;

public class StringExample {

	public static void main(String[] args) {
		String s="hello";
		String st=new String ("Anjana");
		System.out.println(s);
		System.out.println(st);
		
		//length of a string
		System.out.println(s.length());
		System.out.println(st.length());
		
		//concatination(add two strings)
		System.out.println(s.concat(st));
		System.out.println(s);
		
		//contains(checking character in the string if yes=true)
		String str="Welcome to India";
		System.out.println(str.contains("hello"));
		System.out.println(str.contains("to"));
		
		String var="java";
		String vr="java";
		String v="Java";
		String sl="selenium";
		//equals 
		System.out.println(var.equals(vr));
		System.out.println(var.equals(v));
		System.out.println(var.equals(sl));
		
		//equalIgnoreCase
		System.out.println(var.equalsIgnoreCase(v));
		
		//
		System.out.println(var==vr);
		String v1=new String("java");
		System.out.println(v1.equals(var));
		
		//in case of new keyword ,== operator checks the reference of the variable
		System.out.println(v1==var);
		
		//valueOf -converts any type to string(type conversion)
		int m=14;
		System.out.println(String.valueOf(m));
		
		//isEmpty-checks wheather string is empty or not
		System.out.println(var.isEmpty());
		String name="";
		System.out.println(name.isEmpty());
		

	}

}
