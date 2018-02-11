package forest;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * Created by achyut on 1/17/17.
 */
public class Client {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Flyweight");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(400, 300);
				frame.setVisible(true);

				frame.getContentPane().add(new MyPanel());

				frame.repaint();
			}
		});

	}

}
