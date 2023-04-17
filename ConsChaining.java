package Constructor;

class Test {
					// using super() keyword
	Test (){

		System.out.println("default constructor of parent");
	}

	Test (int a){

		System.out.println("one param cons. of parent");
	}

	Test (int a , int b){

		System.out.println("two param cons. of parent");
	}
}

public class ConsChaining extends Test {

	ConsChaining (){
		super();
		System.out.println("No-arg const. in child class");
	}

	ConsChaining (int a){
		super(5);
		System.out.println("one-arg const. in child class");
	}

	ConsChaining (int a , int b){

		System.out.println("two-arg const. in child class");
	}

	public static void main(String[] args) {

		new ConsChaining(10);	// creating Anonymous object of child
	}

}
