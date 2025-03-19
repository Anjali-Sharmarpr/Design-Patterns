package SingletonPattern.EagerInitialization;

public class Main {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		System.out.println(obj1 == obj2);

	}

}
