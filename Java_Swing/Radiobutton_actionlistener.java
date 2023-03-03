/* JRadioButton example with ActionListener */
package Java_Swing;
import javax.swing.*;
import java.awt.event.*;

public class Radiobutton_actionlistener extends JFrame implements ActionListener{
    JRadioButton rb1,rb2;
    JButton b;
    Radiobutton_actionlistener()
    {
        rb1 = new JRadioButton("Female");
        rb1.setBounds(100,50,100,30);
        rb2 = new JRadioButton("Male");
        rb2.setBounds(100,100,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        b = new JButton("Click");
        b.setBounds(100,150,80,30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(rb1.isSelected())
        {
            JOptionPane.showMessageDialog(this,"You are Female.");
        }
        if(rb2.isSelected())
        {
            JOptionPane.showMessageDialog(this,"You are Male");
        }
    }
    public static void main(String[] args)
    {
        new Radiobutton_actionlistener();
    }
}