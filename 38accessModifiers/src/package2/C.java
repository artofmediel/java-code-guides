package package2;

import package1.*;

public class C {

	//anything that's on public modifier is available also to other class of other packages;  
	public String publicMessage = "This is public";
	//anything that's on protected modifier is available also to other class of other packages as long as
	//that class is a sub class of whatever class contains this protected member;
	protected String protectedMessage = "This is protected";
	//only visible to the class that contains itself
	private String privateMessage = "This is private";
	
	String defaultMessage = "This is the default";
	
}
