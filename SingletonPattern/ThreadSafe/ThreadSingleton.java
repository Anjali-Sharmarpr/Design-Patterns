package SingletonPattern.ThreadSafe;

public class ThreadSingleton {
	
private static ThreadSingleton instance;
	
	private ThreadSingleton () {};  
	
	public static ThreadSingleton getInstance() {    
		if (instance == null) {
			synchronized (ThreadSingleton.class) {
				if (instance == null) {
					instance = new ThreadSingleton();
				}
			}
		}
		return instance;
	}

}
