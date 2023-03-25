package in.impetusits;

import java.awt.Image;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

/**
 *
 * @author Hrishi
 */
public class MyCanvas extends Canvas{
    Image img;

    public MyCanvas(String name) {
        this.img = Toolkit.getDefaultToolkit().getImage(name);
    }  

    @Override
    public void paint(Graphics g) {
        g.drawImage(img,0,0,this);
    }
    
    
}
