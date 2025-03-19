package SingletonPattern.EnumSingleton;

public class Main {

	public static void main(String[] args) {
		
		EnumSingleton obj1 = EnumSingleton.INSTANCE;
		EnumSingleton obj2 = EnumSingleton.INSTANCE;
		
		obj1.showMessage();
		
		System.out.println(obj1 == obj2);

	}

}
