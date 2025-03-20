package AbstractFactoryPattern;

public class ShapeFactory {

	public static AbstractShapeFactory getFactory(boolean isRounded) {

		if (isRounded)
			return new RoundedShapeFactory();
		else
			return new NormalShapeFactory();

	}
}
