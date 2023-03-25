package in.impetusits;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Hrishi
 */
public class TestImageCanvas {

    public static void main(String argv[]) {
//        String imgName = argv[0];
        //String imgName ="F:/IndianSanctuareis/east/images/crane.jpg";
        String imgName = "butter.jpg";//bird6.jpg";//"butter.jpg";
        Frame frame = new Frame("Image Canvas");

        frame.setLayout(new BorderLayout());
        frame.add(BorderLayout.CENTER, new ImageCanvas(imgName));
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(500, 500);
        //   frame.pack();
        frame.setVisible(true);

    }
}
