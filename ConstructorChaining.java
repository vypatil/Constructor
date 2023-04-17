package Constructor;
		
			// using this() keyword
 
public class ConstructorChaining {

	ConstructorChaining () {	
		
		this(10);	// using this keyword we call another constructor
		System.out.println("default constructor");
	}

	ConstructorChaining (int a) {
		
		this(10,10);
		System.out.println("one param constructor" + a);
	}

	ConstructorChaining (int a , int b) {

		System.out.println("two param constructor" + a*b);
	}
	
	public static void main(String[] args) {
		
	// invokes default constructor	
	ConstructorChaining c = new ConstructorChaining ();	
		
	}
	

	
}
