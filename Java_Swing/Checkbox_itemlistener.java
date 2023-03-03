/* JCheckBox example with itemlistener */
package Java_Swing;
import javax.swing.*;
import java.awt.event.*;

public class Checkbox_itemlistener {
    Checkbox_itemlistener()
    {
        JFrame f = new JFrame("Checkbox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JCheckBox box1 = new JCheckBox("C++");
        box1.setBounds(150,100,50,50);
        JCheckBox box2 = new JCheckBox("Java");
        box2.setBounds(150,150,80,80);
        f.add(box1);
        f.add(box2);
        f.add(label);
        box1.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                label.setText("C++ Checkbox:"+(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        box2.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                label.setText("Java Checkbox:"+(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Checkbox_itemlistener();
    }
}