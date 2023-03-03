/* Java JSlider Example: painting ticks */
package Java_Swing;
import javax.swing.*;

public class Slider_paintingticks extends JFrame{
    public Slider_paintingticks()
    {
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }
    public static void main(String[] args) 
    {
        Slider_paintingticks frame = new Slider_paintingticks();
        frame.pack();
        frame.setVisible(true);
    }
}