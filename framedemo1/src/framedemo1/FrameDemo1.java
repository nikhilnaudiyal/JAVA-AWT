package framedemo1;

import java.awt.*;
import java.awt.event.*;

public class FrameDemo1 {

    private final Frame mainFrame;
    private final MyWindowListener mwl;

    FrameDemo1() {
        mainFrame = new Frame("Main Frame");
// Instiated the listener Object
        mwl = new MyWindowListener();
    }

    public void launchFrame() {
        mainFrame.setSize(new Dimension(400, 400));
        mainFrame.setBackground(Color.yellow);
// Register the Listener
        mainFrame.addWindowListener(mwl);
        mainFrame.setVisible(true);

    }

    //inner class
    protected class MyWindowListener implements WindowListener {

        @Override
        public void windowActivated(WindowEvent we) {
            System.out.println("Window Activated");
        }

        @Override
        public void windowDeactivated(WindowEvent we) {
            System.out.println("Window Deactivated");
        }

        @Override
        public void windowClosed(WindowEvent we) {
            System.out.println("Window Closed");
        }

        @Override
        public void windowClosing(WindowEvent we) {
            System.out.println("Window closing");
            System.exit(0);

        }

        @Override
        public void windowOpened(WindowEvent we) {
            System.out.println("Window opened");
        }

        @Override
        public void windowIconified(WindowEvent we) {
            System.out.println("Window iconified");
        }

        @Override
        public void windowDeiconified(WindowEvent we) {
            System.out.println("Window Deiconified");
        }
    }

    public static void main(String[] args) {
        FrameDemo1 example = new FrameDemo1();
        example.launchFrame();

    }

}
