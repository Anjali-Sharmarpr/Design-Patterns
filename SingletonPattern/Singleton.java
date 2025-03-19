package SingletonPattern;

public class Singleton {

	private static Singleton instance = new Singleton(); // static instance
	
	private Singleton () {};  // private constructor
	
	public static Singleton getInstance() {    //getInstance method to return the instance 
		return instance;
	}
}
