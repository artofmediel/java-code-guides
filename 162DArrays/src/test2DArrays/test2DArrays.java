package test2DArrays;

public class test2DArrays {

	public static void main(String[] args) {
		
		//2d array = array of arrays
		//can be declared like this
		//String[][] cars = new String[3][3];
		//cars[0][0] = "Camaro";
		//cars[0][1] = "Ferrari";
		//cars[0][1] = "Paggani";
		//cars[1][0] = "Mitshubishi";
		//and so on.. or like this
		
		String[][] cars = 	{
								{"Camaro","Ferrari","Paggani"},
								{"Mitsubishi","Lamborghini","Audi"},
								{"Tesla","Subaru","Toyota"}
							};
		
		for(int a=0;a<cars.length;a++) {
			System.out.println();
			for(int b=0;b<cars[a].length;b++) {
				System.out.print(cars[a][b]+" ");
			}
		}
		
	}

}
