/*
Grid Layout Example
 */
package in.impetusits;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
/**
 * @author Hrishikesh
 */
public class GridUI
{
    private final Frame aFrame;
    private final Button b1;
    private final Button b2;
    private final Button b3;
    private final Button b4;
    private final Button b5;
    private final Button b6;
    private final Font myFont;
    
    GridUI()
    {
        aFrame = new Frame("Grid layout Example");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        myFont = new Font("Arial",Font.ITALIC,25);
    }

    public void launchFrame()
    {
//       aFrame.setLayout( new GridLayout( ) ); //grid will contain only one row
//       aFrame.setLayout( new GridLayout( 3, 2 ) );
        aFrame.setLayout( new GridLayout(3, 2, 10, 10 ) );
        aFrame.setFont(myFont);
        b1.setPreferredSize(new Dimension(30,30));
        aFrame.add(b1);
        aFrame.add(b2);
        aFrame.add(b3);
        aFrame.add(b4);
        aFrame.add(b5);
        aFrame.add(b6);
//       aFrame.add(new Button("Additional"));
        aFrame.setPreferredSize(new Dimension(500, 500) );
        aFrame.setResizable(true);
        aFrame.setBackground(Color.MAGENTA);
        aFrame.pack();
        aFrame.setVisible( true );
    }
}
