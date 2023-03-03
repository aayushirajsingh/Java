/* Creat one button and adding it on the JFrame object inside the main() method. */
package Java_Swing;
import javax.swing.*;

public class Swing {
    public static void main(String[] args) 
    {
       JFrame f = new JFrame();             //creating instance of JFrame  
       
       JButton b = new JButton("Click");    //creating instance of JButton
       b.setBounds(130,100,100,40);         //x axis, y axis, width, height  
       
       f.add(b);                            //adding button in JFrame
       
       f.setSize(400,500);
       f.setLayout(null);                   //using no layout managers  
       f.setVisible(true);                  //making the frame visible  
    }
}