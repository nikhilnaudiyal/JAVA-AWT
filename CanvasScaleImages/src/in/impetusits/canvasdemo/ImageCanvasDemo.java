/*
 * Adding image to a frame using canvas object
 * Adding canvas instance to the frame for 
 * every new images
 * Scaling images to the size of the 
 * canvas or preferred sizes
 * Use of different scaling Algorithm
 */
package in.impetusits.canvasdemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ImageCanvasDemo {

    private final Frame frame;

    ImageCanvasDemo() {
        frame = new Frame("Image Canvas Demo");
    }

    public void launchFrame() {
        frame.setSize(new Dimension(800, 800));
        frame.setBackground(Color.ORANGE);
        frame.setLayout(new FlowLayout());
        //  frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        frame.add(new MyCanvas("birds.jpg"));
        frame.add(new MyCanvas("bird6.jpg"));

        frame.add(new FitCanvas("birds.jpg"));
        frame.add(new FitCanvas("bird6.jpg"));

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        ImageCanvasDemo icd = new ImageCanvasDemo();
        icd.launchFrame();
    }
} // end of ImageCanvasDemo class

