package testGenerics;

//this is for the generic class
/*public class MyGenericClass <Thing, Thing2>{		//common practice is <V> but let's use Thing2

	Thing x;
	Thing2 y;
	
	MyGenericClass(Thing x,Thing2 y){
		this.x = x;
		this.y = y;
	}
	
	//public Thing getValue() {
	//	return x;
	//}
	
	public Thing2 getValue() {
		return y;
	}
}
*/

//this is for the bounded types
public class MyGenericClass <Thing extends Number, Thing2>{

	Thing x;
	Thing2 y;
	
	MyGenericClass(Thing x,Thing2 y){
		this.x = x;
		this.y = y;
	}
	
	//public Thing getValue() {
	//	return x;
	//}
	
	public Thing2 getValue() {
		return y;
	}
}
