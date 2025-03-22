package BuilderDesignPattern;

public class Pizza {
	
	private String name;
	private String toppings;
	private Long quantity;
	
	
	// Private constructor (Only Builder can create objects)
	Pizza (PizzaBuilder builder) {
		this.name = builder.name;
		this.toppings = builder.toppings;
		this.quantity = builder.quantity;
	}
	
	public void showOrders () {
		System.out.println("Name: " + name);
		System.out.println("Toppings: " + toppings);
		System.out.println("Quantity: " + quantity);
	}

}
