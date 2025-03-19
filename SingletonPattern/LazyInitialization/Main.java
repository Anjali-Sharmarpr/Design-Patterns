package SingletonPattern.LazyInitialization;

public class Main {

	public static void main(String[] args) {
		
		LazySingleton obj1 = LazySingleton.getInstance();
		LazySingleton obj2 = LazySingleton.getInstance();
		
		System.out.println(obj1 == obj2);

	}

}
