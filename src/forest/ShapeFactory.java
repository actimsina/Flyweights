package forest;

import java.awt.Color;
import java.util.HashMap;

/**
 * Created by achyut on 1/17/17.
 */
public class ShapeFactory {
	private static final HashMap<Color, Shape> shapeMap = new HashMap<>();

	public static Shape getShape(Color color) {
		Shape circle = shapeMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			shapeMap.put(color, circle);
			System.out.println("Creating circle of color: " + color);
		}

		return circle;
	}
}
