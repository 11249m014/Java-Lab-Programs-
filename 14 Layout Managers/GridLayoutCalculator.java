import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator - GridLayout");
        frame.setLayout(new GridLayout(4, 4, 5, 5));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            frame.add(new JButton(buttons[i]));
        }

        frame.setVisible(true);
    }
}
