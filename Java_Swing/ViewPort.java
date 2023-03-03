/* JViewport Example */
package Java_Swing;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ViewPort {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Tabbed Pane Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Label");
        label.setPreferredSize(new Dimension(1000,1000));
        JScrollPane jScrollPane = new JScrollPane(label);
        JButton button = new JButton();
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setViewportBorder(new LineBorder(Color.RED));
        jScrollPane.getViewport().add(button,null);
        frame.add(jScrollPane,BorderLayout.CENTER);
        frame.setSize(400,150);
        frame.setVisible(true);
    }
}