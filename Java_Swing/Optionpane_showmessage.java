/* JOptionPane example: showMessageDialog() */
package Java_Swing;
import javax.swing.*;

public class Optionpane_showmessage {
    JFrame f;
    Optionpane_showmessage()
    {
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String[] args) 
    {
        new Optionpane_showmessage();
    }
}