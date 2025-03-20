package AbstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractShapeFactory abs = ShapeFactory.getFactory(false);
		Shape s1 =  abs.getShape("circle");
		s1.draw();
		s1 = abs.getShape("square");
		s1.draw();
		
		AbstractShapeFactory abs2 = ShapeFactory.getFactory(true);
		s1 = abs2.getShape("circle");
		s1.draw();
		s1 =  abs2.getShape("square");
		s1.draw();
		

	}

}
