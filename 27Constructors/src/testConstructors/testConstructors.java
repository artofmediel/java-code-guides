package testConstructors;

public class testConstructors {

	public static void main(String[] args) {
		
		//constructors = special method that is called when an object is instantiated (created)
		
		Human human1 = new Human("wiru",27,78.5);
		Human human2 = new Human("nugget",1,.2);
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human2.drink();
		human1.eat();
	}

}
