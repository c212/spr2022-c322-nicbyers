import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Ellipse extends JComponent {
    public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Ellipse2D ellipseBlack = new Ellipse2D.Double(25,25, getWidth()-50, getHeight()-50);
    Ellipse2D ellipseBlue = new Ellipse2D.Double(50,50, getWidth()-100, getHeight()-100);
    g2.setColor(Color.BLACK);
    g2.fill(ellipseBlack);
    g2.draw(ellipseBlack);
    g2.setColor(Color.BLUE);
    g2.fill(ellipseBlue);
    g2.draw(ellipseBlue);
}
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ellipse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Ellipse());
        frame.setSize(new Dimension(500, 500));
        frame.setVisible(true);
    }
}
