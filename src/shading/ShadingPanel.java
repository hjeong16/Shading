package shading;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.util.Random;
import javax.swing.JPanel;

public class ShadingPanel extends JPanel {

    private static final Color BG_COLOR = new Color(250, 154, 130);
//    private static final int RED = (int)(Math.random()*256);
//    private static final int GREEN = (int)(Math.random()*256);
//    private static final int BLUE = (int)(Math.random()*256);

    public ShadingPanel() {
        this.setBackground(BG_COLOR);
    } // ShadingPanel()

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        
//g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//                RenderingHints.VALUE_ANTIALIAS_ON);

        int w = this.getWidth();
        int h = this.getHeight();

        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(1 , 1 );

        AffineTransform scale = new AffineTransform();
        scale.setToScale(w / 2, h / 2);

        AffineTransform transform = new AffineTransform();
        transform.concatenate(scale);
        transform.concatenate(translate);
        
        

        Vector3D illumination = new Vector3D(1.0, 4.0, 5.0);
        illumination = illumination.normalize();



        Mesh mesh = new Mesh(250);
        
        
        for (Triangle2 t : mesh.getTriangles()) {
            double dotProduct = t.getNormal().dot(illumination);
            if (dotProduct < 0.0) {
                dotProduct = 0.0;
            } // if
            
            // Java 'Color' class takes 3 floats, from 0 to 1.
            Random rand = new Random();
            float redValue = (float) (rand.nextFloat()*dotProduct );
            float greenValue = (float) (rand.nextFloat()*dotProduct);
            float blueValue = (float) (rand.nextFloat()*dotProduct);

//            int redValue = (int) (RED * dotProduct);
//            int greenValue = (int) (GREEN * dotProduct);
//            int blueValue = (int) (BLUE * dotProduct);
//          
            Color color = new Color(redValue, greenValue, blueValue);
           g2D.setColor(color);
            Shape shape = t.getShape();
            g2D.fill(transform.createTransformedShape(shape));
        }//for
    } // paintComponent( Graphics )

//    private List<Triangle> makeTriangles() {
//        List<Triangle> triangles = new LinkedList<>();
//
//        double x = -1.0;
//        double y = 0.0;
//        double z = 0.0;
//        Vector3D west = new Vector3D(x, y, z);
//
//        x = 0.0;
//        y = 0.0;
//        z = 1.0;
//        Vector3D center = new Vector3D(x, y, z);
//
//        x = 0.0;
//        y = 1.0;
//        z = 0.0;
//        Vector3D north = new Vector3D(x, y, z);
//
//        x = 1.0;
//        y = 0.0;
//        z = 0.0;
//        Vector3D east = new Vector3D(x, y, z);
//
//        x = 0.0;
//        y = -1.0;
//        z = 0.0;
//        Vector3D south = new Vector3D(x, y, z);
//
//        Triangle triangle = new Triangle(west, center, north);
//        triangles.addAll(triangle.subdivide());
//
//        triangle = new Triangle(center, east, north);
//        triangles.addAll(triangle.subdivide());
//
//        triangle = new Triangle(south, center, west);
//        triangles.addAll(triangle.subdivide());
//
//        triangle = new Triangle(south, east, center);
//        triangles.addAll(triangle.subdivide());
//
//        return triangles;
//    } // makeTriangles()

} // ShadingPanel
