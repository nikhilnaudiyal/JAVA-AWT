/*
 * Demonstration of all componants that 
 are available in awt
 *
 */
package in.impetusits;

import java.awt.*;

public class ComponantExample {

    private final Frame frame;
    private final Panel mainPanel;

    private final Label label;
    private final Panel panel1;
    private final TextField tf;

    private final Panel panel2;
    private final Label label2;
    private final Checkbox cb1;
    private final Checkbox cb2;
    private final CheckboxGroup cbg;

    private final Panel panel3;
    private final TextArea ta;
    private final Label label3;

    private final Scrollbar sb1;
    private final Scrollbar sb2;

    private final Panel panel4;
    private final Label lbl_course;
    private final Choice choice;
    private final Label lbl_subject;
    private final List list;
    Font font;
    FlowLayout mgr;

    public ComponantExample() {
        mgr = new FlowLayout(FlowLayout.LEFT);
        frame = new Frame("Componant Example");
        mainPanel = new Panel();
        font = new Font("SAN SERIF", Font.BOLD, 25);

        panel1 = new Panel();
        label = new Label();
//        tf = new TextField();
        tf = new TextField(25);

        panel2 = new Panel();
        label2 = new Label("Gender : ");

//         cb1 = new Checkbox("Male",true);
//         cb2 = new Checkbox("Female");
//         
        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Male", cbg, true);
        cb2 = new Checkbox("Female", cbg, false);
        
        panel3 = new Panel();
//        ta = new TextArea();
        ta = new TextArea(2, 35);
//        ta = new TextArea("Comments", 5, 20, TextArea.SCROLLBARS_HORIZONTAL_ONLY);

        label3 = new Label("Comments ");

        sb1 = new Scrollbar(Scrollbar.VERTICAL, 50, 50, 0, 400);
        sb2 = new Scrollbar();
        
        panel4 = new Panel();
        lbl_course = new Label("Course :");
        choice = new Choice();
        lbl_subject = new Label("Subject :");
        //    list = new List();
        list = new List(3, false);
    }

    public void launchFrame() {

        mainPanel.setPreferredSize(new Dimension(50, 50));
        mainPanel.setBackground(Color.YELLOW);
        mainPanel.setFont(font);
        mainPanel.setLayout(mgr);
        frame.add(mainPanel, BorderLayout.CENTER);
//        mainPanel.setLayout(new GridLayout(5, 2, 10, 10));

        frame.setBackground(Color.PINK);
        frame.setPreferredSize(new Dimension(800, 500));
        frame.setResizable(false);
        frame.setLocation(100, 100);
        frame.setVisible(true);

        label.setBackground(Color.red);
        //  label.setPreferredSize(new Dimension(50,20));
        label.setText("Please enter your name");

//        mainPanel.add(new Label("One "));
//        mainPanel.add(new Label(" Two"));
//        mainPanel.add(new Label("Three"));
//        mainPanel.add(new Label("Four", Label.RIGHT));
        label.setFont(font);
        tf.setForeground(Color.lightGray);
        tf.setText("Please enter your name");
//        panel1.setBackground(Color.BLUE);
        panel1.add(label);
        panel1.add(tf);
        panel1.setLayout(mgr);
        panel1.setPreferredSize(new Dimension(800, 50));
        mainPanel.add(panel1);

        panel2.add(label2);
        panel2.add(cb1);
        panel2.add(cb2);
        panel2.setPreferredSize(new Dimension(800, 50));
        panel2.setLayout(mgr);
        mainPanel.add(panel2);

        panel3.add(label3);
        panel3.add(ta);
        panel3.setPreferredSize(new Dimension(800, 100));
//        panel3.add(getFillerLabel(200,50));
        panel3.setLayout(mgr);
        mainPanel.add(panel3);

        panel4.setPreferredSize(new Dimension(800,300));
        panel4.setLayout(mgr);
        panel4.add(lbl_course);
        choice.add("MCA");
        choice.add("MCS");
        choice.add("MBA");
        choice.select("MBA");
        panel4.add(choice);
        
        list.add("C++");
        list.add("C");
        list.add("Java");
        list.add("Oracle");
        list.add("DS");
        panel4.add(getFillerLabel(100, 50));
        panel4.add(lbl_subject);
        panel4.add(list);
        mainPanel.add(panel4);

        frame.add(sb1, BorderLayout.EAST);
        sb2.setOrientation(Scrollbar.HORIZONTAL);
        frame.add(sb2, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ComponantExample ce = new ComponantExample();
        ce.launchFrame();

    }
    
    private Label getFillerLabel(int width,int height){
        Label filler = new Label();
        filler.setPreferredSize(new Dimension(width,height));
//        filler.setBackground(Color.LIGHT_GRAY);
        return filler;
    }
}
