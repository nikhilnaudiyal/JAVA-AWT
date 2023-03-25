/*
 * Demo of how the relative position of components 
 changes when managed  by FlowLayout mgr
 * Changing the alignment of FlowLayout mgr
 */
package in.impetusits.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Point;

public class FlowLayoutDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("MyFrame");

//        frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
//         frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

        frame.setPreferredSize(new Dimension(600, 600));
        frame.setLocation(200, 200);
        frame.setExtendedState(Frame.NORMAL);
        frame.setBackground(Color.yellow);

        Panel bluePanel = new Panel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setPreferredSize(new Dimension(200, 200));
//        bluePanel.setSize(new Dimension(200, 200));
        bluePanel.setLocation(new Point(50, 50));
        frame.add(bluePanel);
        bluePanel.setVisible(true);

        Panel cyanPanel = new Panel();
        cyanPanel.setBackground(Color.CYAN);
        cyanPanel.setPreferredSize(new Dimension(200, 200));
//        bluePanel.setSize(new Dimension(200, 200));
        cyanPanel.setLocation(new Point(50, 50));
        frame.add(cyanPanel);
        cyanPanel.setVisible(true);

        frame.validate();
        frame.pack();
        frame.setVisible(true);
    }
}
