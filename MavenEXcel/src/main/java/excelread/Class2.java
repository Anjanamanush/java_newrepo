package excelread;

import java.io.IOException;

public class Class2 {

	public static void main(String[] args) throws IOException {
		String st=Class1.getStringData(1,0);
		System.out.println(st);
		System.out.println(Class1.getIntData(1,1));
		System.out.println(Class1.getFloatData(2,1));
	}

}
