/*
 Demonstration of window events
 *  by implementing window listener
 */
package framedemo2;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Hrishikesh
 */
public class FrameDemo2 {

    private final Frame mainFrame;
    private final Frame subFrame;

    FrameDemo2() {
        mainFrame = new Frame("MyFrame");
        subFrame = new Frame("SubFrame");
    }

    public void launchFrame() {
        mainFrame.setSize(new Dimension(400, 400));
        subFrame.setSize(new Dimension(300, 200));
        mainFrame.setBackground(Color.yellow);
        subFrame.setBackground(Color.PINK);

        //Listener class object is created
        MyWindowListener mwl = new MyWindowListener();

        //registering the listener object with the mainFrame
        mainFrame.addWindowListener(mwl);
        subFrame.addWindowListener(mwl);

        subFrame.setVisible(true);
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {
        FrameDemo2 f = new FrameDemo2();
        f.launchFrame();
    }
    
    //inner class
    protected class MyWindowListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
           
            if (e.getComponent() == mainFrame) {
                System.out.println("Application closing");
                System.exit(0);
            } else {
                System.out.println("Disposing Subframe");
                //Releases the resources held by this window
                
                subFrame.dispose();
            }
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("SubFrame has closed");
        }
    }

}
