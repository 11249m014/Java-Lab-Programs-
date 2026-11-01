import java.applet.Applet;
import java.awt.Graphics;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.drawRect(20, 20, 100, 60);
        g.drawString("Rectangle", 35, 100);

        g.drawOval(150, 20, 80, 80);
        g.drawString("Circle", 170, 120);

        g.drawLine(20, 150, 150, 200);
        g.drawString("Line", 70, 220);

        g.drawLine(250, 200, 300, 120);
        g.drawLine(300, 120, 350, 200);
        g.drawLine(250, 200, 350, 200);
        g.drawString("Triangle", 270, 220);
    }
}
