package BuilderDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Making a pizza using builder design pattern");
		PizzaBuilder builder = new PizzaBuilder("FarmHouse").setToppings("Capsicums").setQuantity(2L);
		Pizza pizza = builder.build();
		pizza.showOrders();
		
		builder = new PizzaBuilder("FarmHouse").setToppings("Capsicums");
		pizza = builder.build();
		pizza.showOrders();
		
	}

}
