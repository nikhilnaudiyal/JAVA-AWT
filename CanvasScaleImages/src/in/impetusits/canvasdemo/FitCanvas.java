
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

class FitCanvas extends Canvas {
    private static final long serialVersionUID = 1L;

    private Image image;

    public FitCanvas(String fileName) {
        image = (Toolkit.getDefaultToolkit()).getImage(fileName);
        
        //  Creates a scaled version of this image.
        //  A new Image object is returned which 
        //  will render the image at the specified
        //  width and height by default using the 
        //  specified Algorithm
        image = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        
        /*
         * Other Algorithms for image rendering :
         Image.SCALE_AREA_AVERAGING);
         Image.SCALE_DEFAULT);
         Image.SCALE_SMOOTH);
         Image.SCALE_REPLICATE);
         */
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.GREEN);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
        
    }
} //end of FitCanvas class
