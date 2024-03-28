import javax.swing.*;
import java.awt.*;

public class CommonUI extends Keyboard {

    public static void setButtonUI(JButton button, Color color) {
        button.setBackground(color);
        button.setForeground(Color.white);
    }

    public static void setButtonUI(JButton button)
    {
        button.setBackground(Color.white);
        button.setForeground(Color.black);
    }
}
