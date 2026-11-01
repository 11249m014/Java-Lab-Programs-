import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class HouseApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        int[] x = {100, 175, 250};
        int[] y = {100, 40, 100};
        g.fillPolygon(x, y, 3);

        g.setColor(Color.YELLOW);
        g.fillRect(100, 100, 150, 120);

        g.setColor(Color.BLUE);
        g.fillRect(155, 150, 40, 70);

        g.setColor(Color.CYAN);
        g.fillRect(115, 120, 30, 30);
        g.fillRect(205, 120, 30, 30);

        g.setColor(Color.BLACK);
        g.drawString("My House", 145, 250);
    }
}
