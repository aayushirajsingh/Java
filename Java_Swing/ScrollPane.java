/* JScrollPane Example */
package Java_Swing;
import java.awt.*;
import javax.swing.*;

public class ScrollPane {
    private static final long serialVersionUID = 1L;
    private static void createAndShowGUI()
    {
        final JFrame frame = new JFrame("Scroll Pane Example");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        JTextArea textarea = new JTextArea(20,20);
        JScrollPane scrollableTextArea = new JScrollPane(textarea);
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(scrollableTextArea);
    }
    public static void main(String[] args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}