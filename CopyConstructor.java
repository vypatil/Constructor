package Constructor;

public class CopyConstructor {

	int id;		// instance variables
	String name;
	
	CopyConstructor(int i , String s){		// param const.
		
		id = i;
		name = s;
		
	}
		CopyConstructor(CopyConstructor ct){	// const. for copying
		
		id=ct.id;
		name=ct.name;
		
	}
		void display() {		// display method for invoking
		
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		
		// call first const.
		CopyConstructor obj = new CopyConstructor(100 , "vaibhav");
		
		// call another const. changing its values
		CopyConstructor obj2 = new CopyConstructor(obj);
		obj2.id=10;
		obj2.name="java";
		
		obj.display();
		obj2.display();
	}
}
