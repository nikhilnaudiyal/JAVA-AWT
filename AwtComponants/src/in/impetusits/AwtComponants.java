/*
 * Demonstrating use of all AWT componants
 */
package in.impetusits;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.List;
import java.awt.Panel;

/**
 *
 * @author Hrishi
 */
public class AwtComponants {

    private final Frame frame_main;
    private final Panel panel_exam;
    private final Panel panel_title;
    private final Panel panel_center;
    private final Panel panel_center_top;
    private final Panel panel_center_body;
    private final Panel panel_bottom;
    private final Panel panel_photo;
    private final Label lbl_name;
    private final Label lbl_prn;
    private final Label lbl_add;
    private final Label lbl_course;
    private final Label lbl_branch;
    private final Label lbl_exam;
    private final Label lbl_subject;
  //  private final Label lbl_photo;
    private final Label lbl_title;
    private final Button btn_submit;
    private final Button btn_cancel;

    private final TextField tf_name;
    private final TextField tf_prn;

    private final TextArea ta_address;
//    private final Canvas can_photo;

    private final Checkbox cbx_backlog;
    private final Checkbox cbx_regular;
    private final Checkbox cbx_fe;
    private final Checkbox cbx_se;
    private final Checkbox cbx_te;
    private final Checkbox cbx_be;
    private final CheckboxGroup cbg_course;

    private final List lst_subject;
    private final Choice cho_branch;
    private Font font;

    public AwtComponants() {
        frame_main = new Frame("Examination Form");
        FlowLayout mgr1 = new FlowLayout();
        panel_exam = new Panel(mgr1);
        panel_title = new Panel();
        panel_center = new Panel();
        panel_bottom = new Panel();
        panel_center_body = new Panel();
        panel_center_top = new Panel();
        panel_photo = new Panel();
        lbl_name = new Label("Student Name:");
        lbl_prn = new Label("PRN no:");
        lbl_add = new Label("Address:");
        lbl_course = new Label("Course:");
        lbl_branch = new Label("Branch:");
        lbl_exam = new Label("Exam:");
        lbl_subject = new Label("Subject:");

        lbl_title = new Label("Examination Form");
        btn_submit = new Button("Submit");
        btn_cancel = new Button("Cancel");
        tf_name = new TextField(30);
        tf_prn = new TextField(30);
        ta_address = new TextArea(3, 30);
//        can_photo = new Canvas();

        cbx_backlog = new Checkbox("BackLog:",false);
        cbx_regular = new Checkbox("Regular:",true);
        
        cbg_course = new CheckboxGroup();
        cbx_fe = new Checkbox("FE:", cbg_course, false);
        cbx_se = new Checkbox("SE:", cbg_course, false);
        cbx_te = new Checkbox("TE:", cbg_course, false);
        cbx_be = new Checkbox("BE:", cbg_course, true);

        lst_subject = new List(4);
        cho_branch = new Choice();
    }

    public void launchForm() {
//        title
        panel_exam.setBackground(Color.LIGHT_GRAY);
        panel_title.setPreferredSize(new Dimension(800, 50));
        panel_title.setBackground(Color.DARK_GRAY);
       
        panel_title.setForeground(Color.WHITE);
        font = new Font("Arial", Font.BOLD, 30);
        panel_title.setFont(font);
//        lbl_title.setBackground(Color.red);
        panel_title.add(lbl_title);
        panel_exam.add(panel_title);
        
//        body
        panel_center.setPreferredSize(new Dimension(800, 580));
        panel_center.setBackground(Color.gray);
        panel_center.setForeground(Color.BLACK);
        panel_center.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        font = new Font("Arial", Font.BOLD, 20);
        panel_exam.setFont(font);
        panel_exam.add(panel_center);
       
//       body - center top
        panel_center_top.setPreferredSize(new Dimension(600, 200));
        panel_center.add(panel_center_top);
        panel_center.add(panel_photo);
        panel_center_top.setBackground(Color.GREEN);
        panel_center_top.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        panel_photo.setPreferredSize(new Dimension(200, 200));
        panel_photo.setBackground(Color.GREEN);
//        panel_photo.add(can_photo);
//        Image image = Toolkit.getDefaultToolkit().getImage("amit.jpg");
        panel_photo.add(new ImageComponent("amit.jpg"));
        tf_name.setForeground(Color.BLACK);

        panel_center_top.add(lbl_name);
        panel_center_top.add(tf_name);
        panel_center_top.add(getFiller(70));
        panel_center_top.add(lbl_prn);
        panel_center_top.add(tf_prn);
        panel_center_top.add(getFiller(130));
        panel_center_top.add(lbl_add);
        panel_center_top.add(ta_address);

//       body center-body
        panel_center_body.setBackground(Color.GREEN);
        panel_center_body.setPreferredSize(new Dimension(800, 600));
        panel_center_body.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel_center_body.add(lbl_exam);
        panel_center_body.add(cbx_fe);
        panel_center_body.add(cbx_se);
        panel_center_body.add(cbx_te);
        panel_center_body.add(cbx_be);
        panel_center_body.add(getFiller(450));

        panel_center_body.add(lbl_branch);
        cho_branch.add("Mechnical");
        cho_branch.add("Computer");
        cho_branch.add("Electronics");
        cho_branch.add("Civil");
        cho_branch.add("Electrical");
        panel_center_body.add(cho_branch);
        cho_branch.select(2);
        panel_center_body.add(getFiller(550));

        panel_center_body.add(lbl_course);
        panel_center_body.add(cbx_regular);
        panel_center_body.add(cbx_backlog);
        panel_center_body.add(getFiller(450));

        panel_center_body.add(lbl_subject);
        String[] subjects = {"C++", "C", "Java", "Python","DS","QT"};
        for (String ele : subjects) {
            lst_subject.add(ele);
        }
        lst_subject.setMultipleMode(true);
        panel_center_body.add(lst_subject);
        panel_center.add(panel_center_body);
//           Bottom
        panel_bottom.setPreferredSize(new Dimension(800, 50));
        panel_bottom.setBackground(Color.DARK_GRAY);
        panel_bottom.setFont(new Font("Arial", Font.ITALIC, 20));
        btn_submit.setPreferredSize(new Dimension(100, 30));
        panel_bottom.add(btn_submit);
        btn_cancel.setPreferredSize(new Dimension(100, 30));
        panel_bottom.add(btn_cancel);
        panel_exam.add(panel_bottom);
//        Frame
//        frame_main.setSize(new Dimension(800, 700));
        frame_main.add(panel_exam);
       
        frame_main.validate();
        frame_main.setResizable(false);
        frame_main.setVisible(true);
        frame_main.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    public Label getFiller(int width) {
        Label label_filler = new Label();
        Dimension dim = new Dimension(width, 30);
        label_filler.setPreferredSize(dim);
//        label_filler.setBackground(Color.red);
        return label_filler;
    }

}
