package BuilderDesignPattern;

public class PizzaBuilder {

	String name;
	String toppings;
	Long quantity;

	// Builder starts with a required parameter
	public PizzaBuilder(String name) {
		this.name = name;
	}

	public PizzaBuilder setToppings(String toppings) {
		this.toppings = toppings;
		return this;
	}

	public PizzaBuilder setQuantity(Long quantity) {
		this.quantity = quantity;
		return this;
	}

	 // Build method to return the final Pizza object
	public Pizza build() {
		return new Pizza(this);
	}

}
