package serializationtest;

import java.io.*;

public class Main {
	
	//IMPORTANT NOTES:
	//1. children classes of a parent class that implements Serializable will do so as well
	//2. static fields are no serialized(they belong to the class, not an individual object)
	//3. the class's definition ("class file") itself is not recorded, cast it as the object type
	//4. Fields declared as "transient" aren't serialized, they're ignored
	//5. serialVersionUID is a unique version ID
	
	//serialVersionUID = serialVersionUID is a unique ID that functions like a version #
	//	verifies that the sender and receiver of a serialized object,
	//	have loaded classes for that object that match
	//	Ensures object will be compatible between machines
	//	Number must watch. otherwise this will cause a InvalidClassException
	//	A SerialVersionUID will be calculated based on class properties, members, etc.
	// 	A serializable class can declare its own serialVersionUID explicitly (recommended)

	/*public static void main(String[] args) throws IOException {

		//serialization - process of converting an object into a byte stream
		//					Persists (saves the state) the object after program exits
		//					This byte stream can be saved as a file or sent over a network
		//					Can be sent to a different machine
		//					Byte Stream can be saved as a file (.ser) which is platform independent
		//					(Think of this as if you are saving a file with the object's information)
		
		
		//deserialization - the process of converting a byte stream into an object
		//					(Think of this as if you're loading a saved file)
		
		// Steps to serialize an object
		//------------------------------
		// 1. Your object class should implement Serialization interface
		// 2. add import java.io.Serializable;
		// 3. FileOutputStream fileOut = new FileOutputStream(file path);
		// 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
		// 5. out.writeObject(objectName)
		// 6. out.close();	fileOut.close();
		//-----------------------------
		
		User user = new User();
		
		user.name = "wiru";
		user.password = "password123";

		//user.sayHello();
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object Info saved.");
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
	}*/
	
	//----------------------
	//*******NOTICE*********
	//----------------------
	//
	//the above code is set on comment to test the suggestion of chatgpt that in order to 
	//deserialize the UserInfo.ser file, the deserialization program should be on the 
	//same package of the same project folder. and so it did work this way.
	//CHATGPT:
	//One possible cause of this issue is that the class being deserialized is not 
	//in the correct package. If the class was originally in a package, it needs to be 
	//in the same package in the deserialization program for the deserialization to work.
	
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
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
		
	}

}
