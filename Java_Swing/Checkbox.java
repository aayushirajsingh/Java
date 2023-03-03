/* JCheckBox Example */
package Java_Swing;
import javax.swing.*;

public class Checkbox {
    Checkbox()
    {
        JFrame f = new JFrame("CheckBox Example");
        JCheckBox box1 = new JCheckBox("C++");
        box1.setBounds(100,100,50,50);
        JCheckBox box2 = new JCheckBox("Java",true);
        box2.setBounds(100,150,80,80);
        f.add(box1);
        f.add(box2);
        f.setSize(400,400);      
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Checkbox();
    }
}