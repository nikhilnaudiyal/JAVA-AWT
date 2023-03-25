/*
 * Demo of GridBagLayout
 */
package gridbagexample;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagUI
{
    Frame aFrame;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Font myfont;
    
    GridBagUI()
    {
        aFrame = new Frame("Grid Bag Layout");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
        myfont = new Font("Arial",Font.PLAIN,20);
    }

    public void launchFrame()
    {
        aFrame.setFont(myfont);
        GridBagLayout gbl = new GridBagLayout();
        aFrame.setLayout( gbl );
        
        GridBagConstraints gbc = new GridBagConstraints();

//        This field is used when the component's 
//        display area is larger than the component's 
//        requested size. 
//        It determines whether to resize the component, 
//        and if so, how
        
        gbc.fill =   GridBagConstraints.VERTICAL;
        gbc.weightx = 2.0;
        gbc.weighty = 2.0;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        
        b1.setPreferredSize(new Dimension(100, 50));
        b5.setPreferredSize(new Dimension(100, 50));
        gbl.setConstraints(b1, gbc);
        gbl.setConstraints(b5, gbc);
        
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 15;
        gbc.gridheight=4;
        gbc.weightx = 15.0;
        gbl.setConstraints(b2,gbc);
        gbl.setConstraints(b3,gbc);
        gbl.setConstraints(b4,gbc);
        gbl.setConstraints(b6,gbc);
        b4.setPreferredSize(new Dimension(50,50));
        b6.setPreferredSize(new Dimension(50,50));
        
        aFrame.add(b1);
        aFrame.add(b2);
        aFrame.add(b3);
        aFrame.add(b4);
        aFrame.add(b5);
        aFrame.add(b6);
    //    aFrame.setPreferredSize(new Dimension(400,400));
        aFrame.pack();
        aFrame.setVisible(true);
    }
    
}
