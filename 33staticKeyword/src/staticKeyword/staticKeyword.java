package staticKeyword;

public class staticKeyword {

	public static void main(String[] args) {
		
		//static = modifier. A single copy of a variable/method is created and shared
		//		The class "owns" the static member
		
		Friend friend1 = new Friend("wiru");
		Friend friend2 = new Friend("gold");
		Friend friend3 = new Friend("nugget");
		Friend friend4 = new Friend("mediel");
		
		//System.out.println(Friend.numberofFriends);
		Friend.displayFriends();
		
	}

}
