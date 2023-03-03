/* Creat one button and adding it on the JFrame object with intheritance. */
package Java_Swing;
import javax.swing.*;

public class Swing_inheritance extends JFrame {
    JFrame f;
    Swing_inheritance()
    {
        JButton b = new JButton ("Click");
        b.setBounds(200,100,100,40);
        
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) 
    {  
         new Swing_inheritance();  
    }
}  