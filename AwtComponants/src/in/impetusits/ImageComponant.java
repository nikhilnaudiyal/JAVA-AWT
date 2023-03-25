package in.impetusits;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Hrishi
 */
class ImageComponent extends Component {
//  BufferedImage subclass describes an Image with an accessible buffer of 
//  image data. 
    BufferedImage img;

    @Override
    public void paint(Graphics g) {
        Image img1 = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        g.drawImage(img1, 0, 0, null);
    }

    public ImageComponent(String path) {
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        if (img == null) {
            return new Dimension(100, 100);
        } else {
            return new Dimension(img.getWidth(), img.getHeight());
        }
    }
}
