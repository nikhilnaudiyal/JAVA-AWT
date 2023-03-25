package in.impetusits;

import java.awt.GraphicsDevice;
import static java.awt.GraphicsDevice.WindowTranslucency.*;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author Hrishikesh Pisal
 */
public class AwtGraphics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Determine what the default GraphicsDevice can support.
        GraphicsEnvironment ge
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        boolean isUniformTranslucencySupported
                = gd.isWindowTranslucencySupported(TRANSLUCENT);
        System.out.println("1)" + isUniformTranslucencySupported);
        boolean isPerPixelTranslucencySupported
                = gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);
        System.out.println("2)" + isPerPixelTranslucencySupported);
        boolean isShapedWindowSupported
                = gd.isWindowTranslucencySupported(PERPIXEL_TRANSPARENT);
        System.out.println("3)" + isShapedWindowSupported);
        
        String n[] = ge.getAvailableFontFamilyNames();
        System.out.println("Font families:");
        for (int i = 0; i < n.length; i++) {
            System.out.println("   " + n[i]);
        }
        Point p = ge.getCenterPoint();
        System.out.println("Window center point: " + p.x + ", " + p.y);
        Rectangle r = ge.getMaximumWindowBounds();
        System.out.println("Maximum window bounds: " + r.x + ", " + r.y
                + ", " + r.width + ", " + r.height);
        
        System.out.println("Device ID: " + gd.getIDstring());
    }

}
