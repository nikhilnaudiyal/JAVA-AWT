package in.impetusits;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Toolkit;

/**
 *
 * @author Hrishi
 */
// A Canvas component represents a blank 
// rectangular area of the screen onto which 
// the application can draw
// Applications that subclass Canvas should 
// override paint() method in order to 
// perform some useful operation
class MyCanvas extends Canvas {
    int counter = 1;
    private static final long serialVersionUID = 1L;
    BasicStroke bs = new BasicStroke(20,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
   
    @Override
    public void paint(Graphics g) {
        System.out.println("Painted..."+counter++);
        g.drawLine(5, 5, 400, 5);
        g.setColor(Color.red);
        g.drawRect(10, 10, 50, 100);
        g.draw3DRect(200, 200, 100,100, true);
        g.drawOval(120, 10, 50, 100);
        g.drawOval(170, 10, 100, 50);
        g.drawOval(120,300,100,100);
        g.setColor(Color.GREEN);
        g.fillOval(220, 10, 50, 100);
        g.setColor(Color.BLUE);
        g.drawRoundRect(280, 10, 100, 100, 10, 10);
        g.drawString("Hello", 300, 200);
        int []x = {150,200,100};
        int []y = {200,300,300};
//        g.drawPolygon(x, y, 3);
        Polygon triangle = new Polygon(x,y,3);
        g.drawPolygon(triangle);
        g.fillArc(10,180, 100,100, 0,270);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(bs);
        g2d.drawLine(10, 150, 300 , 150);
//        bs = new BasicStroke(50,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_BEVEL);
//        g2d.setStroke(bs);
        g2d.setColor(Color.orange);
        g2d.fill3DRect(300,300,100,100,true);
       
            
    }
}
