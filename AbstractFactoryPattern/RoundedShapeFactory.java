package AbstractFactoryPattern;

public class RoundedShapeFactory implements AbstractShapeFactory{
	
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equals("circle")) {
			return new RoundedCircle();
		}
		else if (shapeType.equals("square")) {
			return new RoundedSquare();
		}
		else {
			return null;
		}
	}

}
