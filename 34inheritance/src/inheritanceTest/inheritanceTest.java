package inheritanceTest;

public class inheritanceTest {

	public static void main(String[] args) {
		
		//inheritance = the process where 1 class acquires,
		//				the attributes and methods of another.
	
		Car car = new Car();
		
		car.go();
		
		Bicycle bike = new Bicycle();
		
		bike.stop();

		//access parent class data / method
		System.out.println(car.speed);
		System.out.println(bike.speed);
		//access child class data / method
		System.out.println(car.doors);
		System.out.println(bike.pedals);
	}

}
