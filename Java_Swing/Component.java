/* JComponent Example */
package Java_Swing;
import java.awt.*;
import javax.swing.*;

class Comp extends JComponent
{
    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(30,30,100,100);
    }
}
public class Component {
    public static void main(String[] args) 
    {
        Comp com = new Comp();    
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JComponent Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(com);
        frame.setVisible(true);
    }
}