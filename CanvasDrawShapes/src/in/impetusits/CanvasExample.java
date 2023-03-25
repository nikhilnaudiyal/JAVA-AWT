/*
 *  Demonstration of use of Canvas
 *  to draw basic shapes
 */
package in.impetusits;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Hrishikesh
 */
public class CanvasExample extends WindowAdapter {

    private final Frame frame;
    private final MyCanvas canvas;

    CanvasExample() {
        frame = new Frame();
        canvas = new MyCanvas();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void launchFrame() {
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(500, 500));
        frame.setBackground(Color.YELLOW);
        frame.addWindowListener(this);
        
        canvas.setSize(new Dimension(400, 400));
        canvas.setBackground(Color.white);
        canvas.setForeground(Color.GREEN);

        frame.add(canvas);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        CanvasExample ce = new CanvasExample();
        ce.launchFrame();
    }
}

