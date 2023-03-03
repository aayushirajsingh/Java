/* Java BorderLayout: Without Specifying Region */
package Java_Swing.Layout;
import java.awt.*;
import javax.swing.*;

public class Border_layout_2 {
    JFrame jframe;      
    Border_layout_2()  
    {     
        jframe = new JFrame();    
        JButton btn1 = new JButton("NORTH");    
        JButton btn2 = new JButton("SOUTH");    
        JButton btn3 = new JButton("EAST");   
        JButton btn4 = new JButton("WEST");    
        JButton btn5 = new JButton("CENTER");  
        jframe.setLayout(new BorderLayout(7, 7));
         jframe.add(btn1);    
        jframe.add(btn2);    
        jframe.add(btn3);  
        jframe.add(btn4);  
        jframe.add(btn5);  

        jframe.setSize(300,300);    
        jframe.setVisible(true);    
    }    
    public static void main(String argvs[])   
    {    
        new Border_layout_2();
    }
}