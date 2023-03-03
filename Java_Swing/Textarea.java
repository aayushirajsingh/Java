/* TextArea example */
package Java_Swing;
import javax.swing.*;

public class Textarea {
    Textarea()
    {
        JFrame f = new JFrame ();
        JTextArea area = new JTextArea("Welcome to javapoint ");
        area.setBounds(10,30,200,200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Textarea();
    }            
}
