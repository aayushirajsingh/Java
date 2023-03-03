/* JOptionPane example: showInputDialog() */
package Java_Swing;
import javax.swing.*;

public class Optionpane_input {
    JFrame f;
    Optionpane_input()
    {
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f,"Enter Name");
    }
    public static void main(String[] args) 
    {
        new Optionpane_input();
    }
}   