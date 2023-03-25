package awtdynamiclabels;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author impetus
 */
public class AwtDynamicLabels {

    private Frame frame;
    private Button btnCreate;
    private TextArea ta;
    private Button btnRemove;
    private Panel bottomPanel;
    private int count = 0;
    AwtDynamicLabels()
    {
        frame = new Frame("Component Example");
        btnCreate   = new Button("Create Label");
        ta = new TextArea();
        btnRemove  = new Button("Remove Label");
        bottomPanel = new Panel();
    }

    public void launchFrame()
    {
        frame.setLayout(new FlowLayout());
        bottomPanel.setBackground(Color.pink);

        Font myFont = new Font("San Serif",Font.PLAIN,30);

        btnRemove.setFont(myFont);
        btnCreate.setFont(myFont);

        ta.setForeground(Color.BLACK);
        ta.setText("Hello Welcome");
        ta.setFont(new Font("San Serif",Font.BOLD,30));
        ta.setEditable(false);
        bottomPanel.add(btnCreate);
        bottomPanel.add(btnRemove);
        btnRemove.setEnabled(false);

        frame.add(ta);
        frame.add(bottomPanel);

        frame.addContainerListener(new ContainerListener()
        {
            public void componentRemoved(ContainerEvent ce)
            {
                    ta.setText("\nButton Removed");

            }
            public void componentAdded(ContainerEvent ce)
            {
                ta.setText("\nButton Number " + count + " added");
            }

        });

        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        btnCreate.addActionListener( new ActionListener()
        {
           public void actionPerformed(ActionEvent ae)
           {
                count++;
                Label tempLabel = new Label(" No :"+ count);
                tempLabel.setBackground(Color.GRAY);
                tempLabel.setFont(new Font("Arial",Font.ITALIC,15));
                tempLabel.setPreferredSize(new Dimension(50,40));
                frame.add(tempLabel);
                frame.setVisible(true);
                if(count != 0 )
                {
                    btnRemove.setEnabled(true);
                }

           }
        });

        btnRemove.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent ae)
           {
               if(frame.getComponentCount() > 2)
               {
                    frame.remove(frame.getComponentCount() -1 );

                    count--;
              }

               if( count == 0)
               {
                        btnRemove.setEnabled(false);
               }

           }

        });

        frame.addComponentListener(new ComponentAdapter()
        {
            @Override
            public void componentMoved(ComponentEvent ce)
            {
                ta.setText("Frame Has been Moved");
            }
            @Override
            public void componentResized(ComponentEvent ce)
            {
                    ta.setText("Frame Has been Resized");

            }
        });
        ta.setPreferredSize(new Dimension(500,200));
        ta.setBackground(Color.lightGray);
        frame.setSize(new Dimension(500,500));
        frame.setBackground(Color.PINK);
        frame.setVisible(true);

    }

    public static void main(String[] args)
    {
       AwtDynamicLabels ac = new AwtDynamicLabels();
       ac.launchFrame();
    }

}
