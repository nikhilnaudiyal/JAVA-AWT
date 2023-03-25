/*
 * Placing aPanel in the frame
 */
package in.impetusits.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanelDemo {

    public static void main(String[] args) {
        Frame aFrame = new Frame("Frame with panel");
//        aFrame.setSize(500, 500);
        aFrame.setPreferredSize(new Dimension(500, 500));
        aFrame.setLayout(new FlowLayout());
        aFrame.setBackground(Color.YELLOW);
        aFrame.setResizable(false);
        aFrame.setLocation(200, 200);

        Panel aPanel = new Panel();
//        aPanel.setSize(200, 200);
        aPanel.setPreferredSize(new Dimension(200, 200));
        aPanel.setBackground(Color.red);

        aFrame.add(aPanel);
        aFrame.validate();
        aFrame.pack();
        aPanel.setVisible(true);
        aFrame.setVisible(true);

    }

}
