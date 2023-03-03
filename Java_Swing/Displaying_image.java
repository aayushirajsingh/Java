/* Example of displaying image in swing: */
package Java_Swing;
import java.awt.*;
import javax.swing.*;

public class Displaying_image extends Canvas{
    public void paint(Graphics g) 
    {  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("D://Editing//Edit images//source.gif");  
        g.drawImage(i, 120,100,this);         
    }  
    public static void main(String[] args) 
    {  
        Displaying_image m=new Displaying_image();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(1000,1000);  
        f.setVisible(true);  
    }  
}