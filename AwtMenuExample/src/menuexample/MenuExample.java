/*
 * demonstration of all componants
 */
package menuexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Hrishikesh
 */
public class MenuExample {

    private final Frame f;

    private final MenuBar mbar;

    private final Menu mFile;
    private final Menu mEdit;
    private final Menu mHelp;
    private final Menu mSubMenu;

    private final MenuItem mNewFile;
    private final MenuItem mExistingFile;

    private final MenuItem mOpen;
    private final MenuItem mClose;
    private final MenuItem mExit;

    private final MenuItem mCut;
    private final MenuItem mCopy;
    private final MenuItem mSearch;

    private final FileDialog fd;
    public MenuExample() {

        f = new Frame("Menu Example");
        f.setLayout(new BorderLayout(10, 10));

        mbar = new MenuBar();

        mFile = new Menu("FILE");
        //  mFile.setShortcut(new MenuShortcut( KeyEvent.VK_A ,false));
        mEdit = new Menu("EDIT");
        mHelp = new Menu("HELP");
        mSubMenu = new Menu("SubMenu");

        mNewFile = new MenuItem("New File");
        mExistingFile = new MenuItem("Existing File");

        mOpen = new MenuItem("Open");
        boolean useShiftModifier = true;
        mClose = new MenuItem("Close", new MenuShortcut('C', useShiftModifier));

        mExit = new MenuItem("Exit");
        mExit.setShortcut(new MenuShortcut('X'));
        mCut = new MenuItem("Cut");
        mCopy = new MenuItem("Copy");

        mSearch = new CheckboxMenuItem("Search", true);
        mOpen.setShortcut(new MenuShortcut('O'));
        
        f.setMenuBar(mbar);
        fd = new FileDialog(f);
    }

    public void launchMenu () {
        f.setFont(new Font("Arial", Font.PLAIN, 20));
        mSubMenu.add(mNewFile);
        mSubMenu.add(mExistingFile);

        mFile.add(mOpen);
        mFile.add(mClose);
        mFile.add(mSubMenu);
        mFile.addSeparator();
        mFile.add(mExit);
        mFile.setShortcut(new MenuShortcut(KeyEvent.VK_F,true));
        
        
        mEdit.add(mCut);
        mEdit.add(mCopy);
        mEdit.addSeparator();
        mEdit.add(mSearch);
        mbar.setFont(new Font("Arial", Font.PLAIN, 20));
        mbar.add(mFile);
        mbar.add(mEdit);

        mHelp.add(new MenuItem("About"));
        mbar.setHelpMenu(mHelp);

        mbar.setName("MyMenu bar");
        //  hbar.setSize(10, 10);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0);
            }
            
        });
        
        mExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.dispose();
                System.exit(0);
            }
        });
        
        mOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Open has been selected");
                    fd.setDirectory("D:\\javaProgram");
                    fd.setVisible(true);
                    System.out.println("File : "+ fd.getFile());
            }
        });
        
        
        f.setSize(500, 500);
        f.setVisible(true);

    }

}
