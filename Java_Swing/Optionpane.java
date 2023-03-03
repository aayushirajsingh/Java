/* JOptionPane example: showMessageDialog() */
package Java_Swing;
import javax.swing.*;

public class Optionpane {
    JFrame f;
    Optionpane()
    {
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Hello, Welcome to Javapoint.");
    }
    public static void main(String[] args) 
    {
        new Optionpane();
    }
}