/* Java JDesktopPane Example */
package Java_Swing;
import java.awt.*;
import javax.swing.*;

public class DesktopPane extends JFrame {
    public DesktopPane()
    {
        CustomDesktopPane desktopPane = new CustomDesktopPane();
        Container contentPane = getContentPane();
        contentPane.add(desktopPane,BorderLayout.CENTER);
        desktopPane.display(desktopPane);
        setTitle("JDesktopPane Example");
        setSize(300,350);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        new DesktopPane();
    }
}
class CustomDesktopPane extends JDesktopPane
{
    int numFrames = 3,x = 3,y = 30;
    public void display(CustomDesktopPane dp)
    {
        for(int i=0;i<numFrames;++i)
        {
            JInternalFrame jframe = new JInternalFrame("Internal Frame"+i,true,true,true,true);
            jframe.setBounds(x,y,250,85);
            Container c = jframe.getContentPane();
            c.add(new JLabel("I love me"));
            dp.add(jframe);
            jframe.setVisible(true);
            y+=85;
        }
    }
}