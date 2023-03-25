package in.impetusits.canvasdemo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Hrishi
 */
@SuppressWarnings("serial")
class MyCanvas extends Canvas {

    // The image must be obtained in a platform-specific manner.
    private final Image image;

    public MyCanvas(String fileName) {
        // Returns an image which gets pixel data from the specified file, 
        // whose format can be either GIF, JPEG or PNG.
        image = (Toolkit.getDefaultToolkit()).getImage(fileName);
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.PINK);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);

    }
} //end of MyCanvas class
