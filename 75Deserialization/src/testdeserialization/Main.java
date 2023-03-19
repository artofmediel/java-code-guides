package testdeserialization;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Steps to Deserialize
		//------------------------------------------------------------
		// 1. Declare you object(don't instantiate)
		// 2. Your class should implement Serializable interface
		// 3. add import java.io.Seriializable;
		// 4. FileInputStream fileIn = new FileInputStream(file Path);
		// 5. ObjectInputStream in = new ObjectInputStream(fileIn);
		// 6. objectName = (Class) in.readObject();
		// 7. in.close();	fileIn.close();
		//-------------------------------------------------------------
		
		User user = null;
		
		
		FileInputStream fileIn = new FileInputStream("G:\\William\\eclipse-java\\eclipse-workspace\\TestSerialization\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();	
		fileIn.close();

		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
	}
	
	//----------------------
	//*******NOTICE*********
	//----------------------
	//
	//the above code is copied on the serialization project to test chatgpt's suggestion that to 
	//deserialize the UserInfo.ser file, the deserialization program should be on the 
	//same package of the same project folder. and so it did work this way.
	//CHATGPT:
	//One possible cause of this issue is that the class being deserialized is not 
	//in the correct package. If the class was originally in a package, it needs to be 
	//in the same package in the deserialization program for the deserialization to work.

}
