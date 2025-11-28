package lesson1.singleton;

public class SingleObject {

	//creating instance
	private static SingleObject instance= new SingleObject();
	
	//returning same available object every time
	public static SingleObject getInstance(){
		return instance;
	}
	
	//private constructor is that can not create object of class
	private SingleObject(){
		
	}
	
	public void showMessage(){
		System.out.println("Show message printed");
	}
	
}
