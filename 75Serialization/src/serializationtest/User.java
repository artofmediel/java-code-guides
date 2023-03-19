package serializationtest;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1; // this line changes the serialVersionUID
	
	String name;
	transient String password;
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
}
