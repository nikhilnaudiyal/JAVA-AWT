package in.impetusits.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author Hrishikesh Pisal
 */
public class MyUI {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        Frame aframe = new Frame("MyFrame");
        aframe.setPreferredSize(new Dimension(500, 500));

        aframe.setBackground(Color.YELLOW);
        aframe.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        CustomPanel redPanel = new CustomPanel(Color.RED);
        redPanel.setPreferredSize(new Dimension(200, 200));
        
        Dimension mydim = new Dimension(100, 100);
        CustomPanel greenPanel;
        greenPanel = new CustomPanel(Color.GREEN, mydim);
     
        redPanel.add(greenPanel);
        aframe.add(redPanel);

        Panel bluePanel = new Panel();
        bluePanel.setPreferredSize(mydim);
        bluePanel.setBackground(Color.BLUE);
        aframe.add(bluePanel);

        aframe.setResizable(true);
        aframe.setLocation(100, 100);

        aframe.setExtendedState(Frame.NORMAL);
//        frame.NORMAL , frame.MAXIMIZED_BOTH);
//        frame.ICONIFIED

        aframe.setAlwaysOnTop(false);

//        Causes this Window to be sized to fit the
//        preferred size and layouts of its subcomponents
        aframe.pack();
        aframe.setVisible(true);
    }

}
