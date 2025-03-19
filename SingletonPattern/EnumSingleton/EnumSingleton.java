package SingletonPattern.EnumSingleton;

public enum EnumSingleton {
	INSTANCE;
	
	public void showMessage() {
		System.out.println("Hello World");
	}

}
