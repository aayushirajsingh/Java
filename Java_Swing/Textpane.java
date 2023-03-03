/* JTextPane Example */
package Java_Swing;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Textpane {
    public static void main(String args[]) throws BadLocationException 
    { 
        JFrame frame = new JFrame("JTextPane Example");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container cp = frame.getContentPane();  
        JTextPane pane = new JTextPane();  
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();  
        StyleConstants.setBold(attributeSet, true);  
        pane.setCharacterAttributes(attributeSet, true);  
        pane.setText("Welcome");  
        attributeSet = new SimpleAttributeSet();  
        StyleConstants.setItalic(attributeSet, true);  
        StyleConstants.setForeground(attributeSet, Color.red);  
        StyleConstants.setBackground(attributeSet, Color.blue);  
        Document doc = pane.getStyledDocument();  
        doc.insertString(doc.getLength(), "To Java ", attributeSet);  
        attributeSet = new SimpleAttributeSet();  
        doc.insertString(doc.getLength(), "World", attributeSet);  
        JScrollPane scrollPane = new JScrollPane(pane);  
        cp.add(scrollPane, BorderLayout.CENTER);    
        frame.setSize(400, 300);  
        frame.setVisible(true);  
    }  
}  