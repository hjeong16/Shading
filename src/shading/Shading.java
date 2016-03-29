
package shading;

import java.awt.Container;
import javax.swing.JFrame;


public class Shading extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;
    private static final String FRAME_TITLE = "Shading!!!";
    
    public Shading() {
        JFrame frame = new JFrame();
        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setTitle( FRAME_TITLE );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        
        Container panel = new ShadingPanel();
        frame.setLocationRelativeTo(null);
        frame.add( panel );
        frame.setVisible(true);
    } // Shading()
    
    public static void main(String[] args) {
        Shading shading = new Shading();
    } // main( String [] )
    
} // Shading
