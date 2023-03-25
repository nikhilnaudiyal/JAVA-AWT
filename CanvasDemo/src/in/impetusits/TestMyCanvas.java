package in.impetusits;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author Hrishi
 */
public class TestMyCanvas {

    public static void main(String[] args) {
        Frame aFrame = new Frame();
        aFrame.setLayout(null);
        MyCanvas canvas = new MyCanvas("birds.jpg");
        aFrame.add(canvas);
        aFrame.setVisible(true);
        aFrame.setBackground(Color.yellow);
        canvas.setBackground(Color.red);
        canvas.setSize(new Dimension(200, 200));
        aFrame.pack();
        Button btn = new Button("Click");
        btn.setPreferredSize(new Dimension(80, 20));
        btn.setBounds(80, 80, 80, 20);
        
        aFrame.add(btn);
                
    }
}
