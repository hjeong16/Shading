/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shading;

import java.util.LinkedList;
import java.util.List;

public class Mesh {
    private final Vector3D [][] mesh ;
    private final List<Triangle2> triangles;
    private static final double A = (int)(Math.random()*-1);
    private static final double B = (int)(Math.random()*2);
    private static final double C = (int)(Math.random()*30);
    private static final double D = (int)(Math.random()*-5);
            
    public Mesh( int dim ) {
        this.mesh = new Vector3D[dim][dim];
        Wave w0 = new Wave( A, B, C, D);
        Wave w1 = new Wave( 2.3, 1.2, 5.0, 3.0);
        Wave w2 = new Wave(-0.2,0.5,11.0,3.0);
        
        double deltaX = 2.0/(dim-1);
        double deltaY = 2.0/(dim-1);
        
      
        for(int i=0; i<dim; i++){
            double y = -1.0 +i*deltaY;
            for(int j=0; j<dim; j++){
                double x = -1.0 +j*deltaX;
                
                double z = w0.getZ(x,y) + w1.getZ(x,y) + w2.getZ(x,y);
                
                mesh[i][j] = new Vector3D(x,y,z);
            } //for
        }// for
        
        this.triangles = new LinkedList<>();
        
        for(int i=0; i<dim-1; i++){
            for(int j=0; j<dim-1; j++){
              Triangle2 ul = 
                      new Triangle2( mesh[i][j], mesh[i][j+1],mesh[i+1][j],mesh[i+1][j+1]);  
              Triangle2 lr =
                      new Triangle2(mesh[i][j+1], mesh[i+1][j+1],mesh[i+1][j],mesh[i][j]);
//               Triangle ul = 
//                      new Triangle( mesh[i][j], mesh[i][j+1],mesh[i+1][j],mesh[i+1][j+1]);  
//              Triangle lr =
//                      new Triangle(mesh[i][j+1], mesh[i+1][j+1],mesh[i+1][j],mesh[i][j]);
//              
              this.triangles.add (ul);
              this.triangles.add (lr);
            }//for
        }//for
        
    }// Mesh(int)
    
    public List<Triangle2> getTriangles() {
        return this.triangles;
    }
    
}//Mesh
