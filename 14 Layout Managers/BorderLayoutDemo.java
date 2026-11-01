import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Dashboard");
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JLabel("HEADER", SwingConstants.CENTER), BorderLayout.NORTH);
        frame.add(new JLabel("FOOTER", SwingConstants.CENTER), BorderLayout.SOUTH);
        frame.add(new JButton("MENU"), BorderLayout.WEST);
        frame.add(new JButton("SIDE"), BorderLayout.EAST);
        frame.add(new JLabel("CONTENT AREA", SwingConstants.CENTER), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
