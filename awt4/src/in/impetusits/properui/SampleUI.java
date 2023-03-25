/*
 * demonstration of placing component on 
 * the container
 */
package in.impetusits.properui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Point;

public class SampleUI {

    // List all the componants required for the UI
    private final Frame aFrame;
    private final Panel aPanel;

    //Instantiate and keep the componants ready to be used
    SampleUI() {
        aFrame = new Frame("My Frame");
        aPanel = new Panel();
    }

    // Use to the componants to construct UI
    public void launchFrame() {
        aFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        aFrame.setSize(400, 400);
//        frame.setLayout(null);
        // frame.setPreferredSize(new Dimension(400,400));
        aFrame.setBackground(Color.red);
//        panel.setSize(200, 200);
        aPanel.setPreferredSize(new Dimension(200, 200));
        aPanel.setLocation(new Point(100, 100));
        aPanel.setBackground(Color.BLUE);
        aPanel.setVisible(true);
        aFrame.add(aPanel);

//        frame.validate();
        aFrame.pack();
        aFrame.setVisible(true);
    }
}
