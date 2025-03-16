package slider;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {
    
    //declare
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    
    //construct
    SliderDemo() {
        
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);
        
        slider.setPreferredSize(new Dimension(400, 200));
        
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
//        slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.setOrientation(SwingConstants.VERTICAL);
        
        label.setText("°C = " + slider.getValue());
        
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    //method
    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
