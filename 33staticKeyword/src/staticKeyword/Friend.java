package staticKeyword;

public class Friend {

	String name;
	static int numberofFriends;
	
	Friend(String name){
		this.name = name;
		numberofFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+ numberofFriends + " friends.");
	}
}
