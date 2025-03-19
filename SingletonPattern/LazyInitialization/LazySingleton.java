package SingletonPattern.LazyInitialization;

public class LazySingleton {

private static LazySingleton instance;
	
	private LazySingleton () {};  
	
	public static LazySingleton getInstance() {    
		if (instance == null) {   // Create only when needed
			instance = new LazySingleton();
		}
		return instance;
	}
}
