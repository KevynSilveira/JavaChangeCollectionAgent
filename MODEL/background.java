package MODEL;

/*      @author Kevyn      */

import java.awt.Color;
import javax.swing.JFrame;

public class background {
    
    public static void setCorDeFundo(JFrame frame) {
        Color background = Color.decode("#808080"); // Troca o background de acordo com a cor hexadecimal
        frame.getContentPane().setBackground(background);
    }
}

