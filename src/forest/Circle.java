package forest;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by achyut on 1/17/17.
 */
public class Circle implements Shape {
	private Color color;
	private int x;
	private int y;
	private int radius;

	public Circle(Color color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw(Graphics g) {
		// System.out.println("Circle.draw() [Color: "+color+
		// ", x: "+x+", y:"+y+", radius: "+radius);
		g.setColor(color);
		g.fillOval(x, y, radius, radius);
	}
}
