/* To Create  a simple Panel
 *  holding the bluePanel in a frame
 *  holding a bluePanel within a bluePanel
 */
package in.impetusits.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;

public class CustomPanel extends Panel {

    public CustomPanel(Color bkcolor) {
        this.setBackground(bkcolor);
    }

    public CustomPanel(Color bkcolor, Dimension dim) {
        this.setBackground(bkcolor);
        this.setPreferredSize(dim);
    }
}

/*
 *      /*
 Awt2 myPanel2 = new Awt2();
 myPanel2.setBackground(Color.BLUE);
 myPanel2.setPreferredSize(new Dimension(50,50));

 Awt2 myPanel3 = new Awt2();
 myPanel3.setBackground(Color.PINK);
 myPanel3.setPreferredSize(new Dimension(50,50));

 Awt2 myPanel4 = new Awt2();
 myPanel4.setBackground(Color.GREEN);
 myPanel4.setPreferredSize(new Dimension(50,50));

 redPanel.setLocation(10,10);
 myPanel2.setLocation(60,10);
 myPanel3.setLocation(120,10);
 myPanel4.setLocation(180,10);
 */
 /*
 f.add(myPanel2);
 f.add(myPanel3);
 f.add(myPanel4);
 */
