package SingletonPattern.EagerInitialization;

public class Singleton {

	private static Singleton instance = new Singleton(); // Instance created immediately
	
	private Singleton () {};  // private constructor
	
	public static Singleton getInstance() {    //getInstance method to return the instance 
		return instance;
	}
}
