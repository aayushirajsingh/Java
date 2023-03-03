/* Java JLabel example */
package Java_Swing;
import javax.swing.*;

public class Label {
    public static void main(String[] args) 
    {
        JFrame f = new JFrame ("Lable example");
        JLabel l1,l2;
        l1 = new JLabel("First Label.");
        l1.setBounds(50,50,100,30);
        l2 = new JLabel ("Second Label.");
        f.add(l1);
        f.add(l2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}