package SingletonPattern.ThreadSafe;

public class Main {

	public static void main(String[] args) {
		
		ThreadSingleton obj1 = ThreadSingleton.getInstance();
		ThreadSingleton obj2 = ThreadSingleton.getInstance();
		
		System.out.println(obj1 == obj2);

	}

}
