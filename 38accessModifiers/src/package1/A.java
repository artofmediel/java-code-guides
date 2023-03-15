package package1;

import package2.*;

public class A {

		//anything that's on protected modifier is available also to other class of other packages as long as
		//that class is a sub class of whatever class contains this protected member;
		protected String protectedMessage = "This is protected";

		public static void main(String[] args) {
			
			//C c = new C();
			//System.out.println(c.defaultMessage);
			//System.out.println(c.publicMessage);
			//--------------------------------------------------------------
			
			//Asub asub= new Asub();
			//System.out.println(asub.protectedMessage);
			//--------------------------------------------------------------
			
			//B b = new B();
			//System.out.println(b.privateMessage);
		}
}
