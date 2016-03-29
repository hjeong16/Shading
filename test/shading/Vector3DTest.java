
package shading;

import org.junit.Test;
import static org.junit.Assert.*;


public class Vector3DTest {
    private static final double EPSILON = 1E-8;
    
    public Vector3DTest() {
    } // Vector3DTest()

    /**
     * Test of getX method, of class Vector3D.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Vector3D instance = new Vector3D (10,20,30);
        double expResult = 10.0;
        double result = instance.getX();
        assertEquals(expResult, result, EPSILON);
        // TODO review the generated test code and remove the default call to fail.
        
    } // testGetX()

    /**
     * Test of getY method, of class Vector3D.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Vector3D instance = new Vector3D (10,20,30);
        double expResult = 20.0;
        double result = instance.getY();
        assertEquals(expResult, result, EPSILON);
        // TODO review the generated test code and remove the default call to fail.
        
    } // testGetY()

    /**
     * Test of getZ method, of class Vector3D.
     */
    @Test
    public void testGetZ() {
        System.out.println("getZ");
        Vector3D instance = new Vector3D (10,20,30);
        double expResult = 30.0;
        double result = instance.getZ();
        assertEquals(expResult, result, EPSILON);
        // TODO review the generated test code and remove the default call to fail.
      
    } // testGetZ()

    /**
     * Test of add method, of class Vector3D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D v = new Vector3D (10,20,30);
        Vector3D instance = new Vector3D (5,5,5);
        Vector3D expResult = new Vector3D (15,25,35);
        Vector3D result = instance.add(v);
        assertEquals(expResult.getX(), result.getX(), EPSILON);
        assertEquals(expResult.getY(), result.getY(), EPSILON);
        assertEquals(expResult.getZ(), result.getZ(), EPSILON);
        // To test equality of two vectors, test the equality
        // of the x, y, and z components of the two vectors.
        // Add 3 calls to assertEquals() here to test the equality
        // of the x, y, and z components of the two vectors.
        
        // TODO review the generated test code and remove the default call to fail.
      
    } // testAdd()

    /**
     * Test of subtract method, of class Vector3D.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Vector3D v = new Vector3D (10,20,30);;
        Vector3D instance = new Vector3D (15,25,35);;
        Vector3D expResult = new Vector3D (5,5,5);
        Vector3D result = instance.subtract(v);
        assertEquals(expResult.getX(), result.getX(), EPSILON);
        assertEquals(expResult.getY(), result.getY(), EPSILON);
        assertEquals(expResult.getZ(), result.getZ(), EPSILON);
        // To test equality of two vectors, test the equality
        // of the x, y, and z components of the two vectors.
        // Add 3 calls to assertEquals() here to test the equality
        // of the x, y, and z components of the two vectors.
        
        // TODO review the generated test code and remove the default call to fail.
        
    } // testSubtract()

    /**
     * Test of scale method, of class Vector3D.
     */
    @Test
    public void testScale() {
        System.out.println("scale");
        double s = 2.0;
        Vector3D instance = new Vector3D (10,20,30);
        Vector3D expResult = new Vector3D (20,40,60);
        Vector3D result = instance.scale(s);
        assertEquals(expResult.getX(), result.getX(), EPSILON);
        assertEquals(expResult.getY(), result.getY(), EPSILON);
        assertEquals(expResult.getZ(), result.getZ(), EPSILON);
        // To test equality of two vectors, test the equality
        // of the x, y, and z components of the two vectors.
        // Add 3 calls to assertEquals() here to test the equality
        // of the x, y, and z components of the two vectors.

        // TODO review the generated test code and remove the default call to fail.
     
    } // testScale()

    /**
     * Test of dot method, of class Vector3D.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vector3D v = new Vector3D (10,20,30);
        Vector3D instance = new Vector3D (2,2,2);
        double expResult = 120.0;
        double result = instance.dot(v);
        
        // TODO review the generated test code and remove the default call to fail.
        
    } // testDot()

    /**
     * Test of magnitude method, of class Vector3D.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Vector3D instance = new Vector3D (1,2,3);
        double expResult = Math.sqrt(14);
        double result = instance.magnitude();        
        assertEquals(expResult, result, EPSILON);
        // TODO review the generated test code and remove the default call to fail.
        
    } // testMagnitude()

    /**
     * Test of normalize method, of class Vector3D.
     */
    @Test
    public void testNormalize() {
        System.out.println("normalize");
        Vector3D instance = new Vector3D (1,2,3);
        Vector3D expResult = new Vector3D (1,1/4,1/9);
        Vector3D result = instance.normalize();
        
        // To test equality of two vectors, test the equality
        // of the x, y, and z components of the two vectors.
        // Add 3 calls to assertEquals() here to test the equality
        // of the x, y, and z components of the two vectors.
        
        // TODO review the generated test code and remove the default call to fail.
        
    } // testNormalize()

    /**
     * Test of cross method, of class Vector3D.
     */
    @Test
    public void testCross() {
        System.out.println("cross");
        Vector3D v = new Vector3D (1,2,3);
        Vector3D instance = new Vector3D (2,2,2);
        Vector3D expResult = new Vector3D (2,-4,2);
        Vector3D result = instance.cross(v);
        assertEquals(expResult.getX(), result.getX(), EPSILON);
        assertEquals(expResult.getY(), result.getY(), EPSILON);
        assertEquals(expResult.getZ(), result.getZ(), EPSILON);
        // To test equality of two vectors, test the equality
        // of the x, y, and z components of the two vectors.
        // Add 3 calls to assertEquals() here to test the equality
        // of the x, y, and z components of the two vectors.
        
        // TODO review the generated test code and remove the default call to fail.
       
    } // testCross()
    
} // Vector3DTest
