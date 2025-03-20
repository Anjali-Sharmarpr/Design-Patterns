package FactoryPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape1 = ShapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = ShapeFactory.getShape("square");
		shape2.draw();
		

	}

}
