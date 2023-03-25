package in.impetusits.ui;

import java.awt.Color;
import java.awt.Frame;

public class FrameDemo
{
    public static void main(String[] args)
    {
        Frame aframe = new Frame();
        aframe.setTitle("My First Window");
        aframe.setBackground(Color.YELLOW);
        aframe.setSize(500, 500);
        aframe.setLocation(200,200);
        aframe.setVisible(true);
        aframe.setResizable(false);
        aframe.setAlwaysOnTop(true);
        aframe.setExtendedState(Frame.MAXIMIZED_HORIZ|Frame.MAXIMIZED_VERT);
       
    }

}
