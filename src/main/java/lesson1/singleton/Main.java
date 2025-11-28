package lesson1.singleton;

public class Main {
	public static void main(String[] args) {
		SingleObject singleObject = SingleObject.getInstance();
		singleObject.showMessage();
	}
}
