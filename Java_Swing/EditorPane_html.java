/* JEditorPane Example: using HTML */
package Java_Swing;
import javax.swing.*;

public class EditorPane_html {
    JFrame frame = null;    
    public static void main(String[] a) 
    {    
        (new EditorPane_html()).test();    
    }    
    
    private void test() {    
        frame = new JFrame("JEditorPane Test");    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        frame.setSize(400, 200);    
        JEditorPane pane = new JEditorPane();    
        pane.setContentType("text/html");    
        pane.setText("<h1>Sleeping</h1><p>Sleeping is necessary for a healthy body." + " But sleeping in unnecessary times may spoil our health, wealth and studies." + " Doctors advise that the sleeping at improper timings may lead for obesity during the students days.</p>"); 
        frame.setContentPane(pane);    
        frame.setVisible(true);    
    }    
}