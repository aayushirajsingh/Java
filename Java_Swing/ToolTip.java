/* Simple ToolTip Example */
package Java_Swing;
import javax.swing.*;

public class ToolTip {
    public static void main(String[] args) 
    {    
        JFrame f=new JFrame("Password Field Example");    
        JPasswordField value = new JPasswordField();   
        value.setBounds(100,100,100,30);    
        value.setToolTipText("Enter your Password");  
        JLabel l1=new JLabel("Password:");    
        l1.setBounds(20,100, 80,30);    
        f.add(value);  f.add(l1);  
        f.setSize(300,300);    
        f.setLayout(null);    
        f.setVisible(true);      
    }  
}