import java.applet.Applet;
import java.awt.Graphics;

public class FaceApplet extends Applet {
    public void paint(Graphics g) {
        g.drawOval(80, 50, 140, 160);

        g.fillOval(110, 100, 20, 20);
        g.fillOval(170, 100, 20, 20);

        g.drawLine(150, 120, 140, 150);
        g.drawLine(140, 150, 160, 150);

        g.drawArc(120, 150, 60, 30, 0, -180);

        g.drawString("Simple Face", 110, 240);
    }
}
