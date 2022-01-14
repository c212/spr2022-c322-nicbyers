import java.awt.*; 
import java.awt.geom.*;
import javax.swing.JComponent; 
import javax.swing.JFrame;


public class Ellipse extends JComponent{
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Shape ell = new Ellipse2D.Float(0, 0, getWidth() - 10, getHeight() - 10);

		g2.setPaint(Color.BLUE); 
		g2.fill(ell);
		g2.setStroke(new BasicStroke(4));
		g2.setPaint(Color.BLACK);
		g2.draw(ell);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ellipse"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Ellipse());
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
	}
}