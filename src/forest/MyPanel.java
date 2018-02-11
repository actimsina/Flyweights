package forest;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Created by achyut on 1/18/17.
 */
public class MyPanel extends JPanel {
	private static final Color colors[] = { Color.red, Color.green, Color.black };

	@Override
	protected void paintComponent(Graphics g) {
		for (int i = 0; i < 100; i++) {
			Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(50);
			circle.draw(g);
		}
	}

	private static Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 200);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 200);
	}
}
