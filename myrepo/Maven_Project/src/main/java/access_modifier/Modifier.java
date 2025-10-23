package access_modifier;

public class Modifier extends Specifier_1 {

	public static void main(String[] args) {
		Modifier ch=new Modifier();
		ch.defMehod();
		//ch.privMehod();it does not access from outside the class
		ch.protMehod();
		ch.pubMehod();
		

	}

}
