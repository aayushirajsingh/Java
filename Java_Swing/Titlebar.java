/* Example to change TitleBar icon in Java Swing */
package Java_Swing;
import javax.swing.*;
import java.awt.*;

public class Titlebar {
    Titlebar()
    {
        JFrame f=new JFrame();   
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\girl.jpg");
        f.setIconImage(icon);  
        f.setLayout(null);   
        f.setSize(200,200);   
        f.setVisible(true);      
    }     
    public static void main(String args[])
    {     
        new Titlebar();     
    }     
} 