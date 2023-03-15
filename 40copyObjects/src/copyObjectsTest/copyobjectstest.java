package copyObjectsTest;

public class copyobjectstest {

	public static void main(String[] args) {

		Car car1= new Car("Chevrolet","Camaro",2021);
		Car car2= new Car("Ford","Mustang",2022);
		
		//wrong method
		//car2 = car1;
		//
		//what this does is it points the memory address of both cars to the same location, 
		//not copying them
		
		System.out.println(car1);		//check address on memory
		System.out.println(car2);		//check address on memory
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println();
		
		//copy object
		car2.copy(car1);
		//test change
		System.out.println(car1);		//check address on memory
		System.out.println(car2);		//check address on memory
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println("--------------------------------------------");
		
		//example 2 ------------------------------------------------------------------------
		//what if you want to copy object by using constructor
		Car car3= new Car("Lamborghini","Aventador",2020);
		Car car4= new Car(car3);
		
		//test change
		System.out.println(car3);		//check address on memory
		System.out.println(car4);		//check address on memory
		System.out.println();
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());
		System.out.println();
		System.out.println(car4.getMake());
		System.out.println(car4.getModel());
		System.out.println(car4.getYear());
		System.out.println();
	}

}
