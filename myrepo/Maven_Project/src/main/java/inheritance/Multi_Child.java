package inheritance;

public class Multi_Child extends Multi_Inter {
	public void show()
	{
		System.out.println("This is child");
	}

	public static void main(String[] args) {
		Multi_Child obj= new Multi_Child();
		obj.add(3,8);
		obj.display();
		obj.show();

	}

}
