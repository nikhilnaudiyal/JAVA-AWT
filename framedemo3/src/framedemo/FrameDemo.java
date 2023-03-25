/*
 Frame demo with Annonymous class
 */
package framedemo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Hrishikesh
 */
public class FrameDemo {

    private final Frame aFrame;

    FrameDemo() {
        aFrame = new Frame("FrameDemo");
    }

    public void launchFrame() {
        aFrame.setSize(new Dimension(400, 400));
        aFrame.setBackground(Color.yellow);
//        Using Annonymous class object as parameter
//        to the method
        aFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing the Application");
                System.exit(0);
            }

        });

        aFrame.setVisible(true);

    }

    public static void main(String s[]) {
        FrameDemo fd = new FrameDemo();
        fd.launchFrame();
    }
}
