package encapsulation;

public class Encap1_Child {

	public static void main(String[] args) {
		Encap1_Parent obj=new Encap1_Parent();
		obj.setName("Anjana");
		String s=obj.getName();
		System.out.println(s);
		
		obj.setRollnumber(13);
		int a=obj.getRollnumber();
		System.out.println(a);
		
		obj.setMark(80);
		System.out.println(obj.getMark());
		
		obj.setTotal(500);
		System.out.println(obj.getTotal());
		
		obj.setGrade("A");
		System.out.println(obj.getGrade());

	}

}
