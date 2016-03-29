/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shading;


public class Wave {
    private final double cx;
    private final double cy;
    private final double freq;
    private final double phase;
    
    public Wave(double cx, double cy, double freq, double phase) {
        this.cx =cx;
        this.cy = cy;
        this.freq = freq;
        this.phase = phase;
    } // Wave(double, double, double, double)
    
    public double getZ(double x, double y) {
        double xDiff = x - this.cx;
        double yDiff = y - this.cy;
        double r = Math.sqrt( xDiff*xDiff + yDiff*yDiff);
        
               
        return Math.sin(this.freq*r+this.phase*r);
    }//getZ(double, double)
    
}// Wave
