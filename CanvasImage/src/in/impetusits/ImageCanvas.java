/*
 * Displaying image1 in a class which extends 
 * canvas class
 * adding all images to the same canvas class
 */
package in.impetusits;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

public class ImageCanvas extends Canvas {
//  The abstract class Image is the superclass 
//  of all classes that represent graphical images
    Image image1;
    Image image2;
    MediaTracker media;

    public ImageCanvas(String name) {
        //The MediaTracker class is a utility class 
        //to track the status of a number of media 
        //objects.
        //Media objects could include audio clips as 
        //well as images,though currently only 
        //images are supported.
        media = new MediaTracker(this);
        
        //Returns an image which gets pixel data 
        //from the specified file, whose format can 
        //be either GIF, JPEG or PNG
        image1 = 
          (Toolkit.getDefaultToolkit()).getImage(name);
        image2 = 
          Toolkit.getDefaultToolkit().getImage("Birds.jpg");
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image1, 0, 0, this);
        g.drawImage(image2, 200, 200, this);
        media.addImage(image1, 1);
        media.addImage(image2, 2);
    }
}
   