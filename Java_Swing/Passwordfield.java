/* JPasswordfield example */
package Java_Swing;
import javax.swing.*;

public class Passwordfield {
    public static void main(String[] args) 
    {    
        JFrame f = new JFrame("Password Field Example.");
        JPasswordField value = new JPasswordField();
        JLabel l = new JLabel("Password: ");
        
        l.setBounds(20,100,80,30);        
        value.setBounds(100,100,100,30);
        f.add(value);
        f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }  
}