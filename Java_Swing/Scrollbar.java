/* JScrollbar example */
package Java_Swing;
import javax.swing.*;

public class Scrollbar {
    Scrollbar()
    {
        JFrame f = new JFrame ("Scrollbar example");
        JScrollBar s = new JScrollBar();
        s.setBounds(100,100,50,100);
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);        
    }
    public static void main(String[] args) 
    {
        new Scrollbar();
    }
}