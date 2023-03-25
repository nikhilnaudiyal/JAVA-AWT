package in.impetusits;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;



/**
 *
 * @author Hrishikesh Pisal
 */
public class AwtGridBag extends Panel  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Frame f = new Frame("GridBag Layout Example");
	AwtGridBag ex1 = new AwtGridBag();
    	f.add("Center", ex1);
	f.pack();
	f.resize(f.preferredSize());
	f.show();
    }

    public AwtGridBag() {
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
 
        setFont(new Font("Helvetica", Font.PLAIN, 14));
        setLayout(gridbag);
   
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        makebutton("Button1", gridbag, c);
        makebutton("Button2", gridbag, c);
        makebutton("Button3", gridbag, c);
    
	c.gridwidth = GridBagConstraints.REMAINDER; //end row
        makebutton("Button4", gridbag, c);
    
        c.weightx = 0.0;		   //reset to the default
        makebutton("Button5", gridbag, c); //another row
    
	c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last in row
        makebutton("Button6", gridbag, c);
    
	c.gridwidth = GridBagConstraints.REMAINDER; //end row
        makebutton("Button7", gridbag, c);
    
	c.gridwidth = 1;	   	   //reset to the default
	c.gridheight = 2;
        c.weighty = 1.0;
        makebutton("Button8", gridbag, c);
    
        c.weighty = 0.0;		   //reset to the default
	c.gridwidth = GridBagConstraints.REMAINDER; //end row
	c.gridheight = 1;		   //reset to the default
        makebutton("Button9", gridbag, c);
        makebutton("Button10", gridbag, c);
    
        resize(300, 100);
    }

    protected void makebutton(String name,
            GridBagLayout gridbag,
            GridBagConstraints c) {
        Button button = new Button(name);
        gridbag.setConstraints(button, c);
        add(button);
        
    }
}
