package edu.ucsb.cs56.drawings.marcellis.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves

import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import edu.ucsb.cs56.drawings.marcellis.simple.Circle; //get access to the Circle class

/**
   A vector drawing of a car that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Marcellis Carr-Barfield 
   @version for CS56, M16, UCSB
   
*/
public class Car extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of the lower left corner of the area the car is to be drawn (defined by width and height)
       @param y y coord of the lower left corner of the area the car is to be drawn (defined by width and height)
       @param width width of the car
       @param height of the car (from bottom of wheels to top of roof)
    */
    public Car(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double wheelHeight = .25 * height;
        double wheelCabinOverlap = 0.125;
        double cabinHeight = (0.5 +  wheelCabinOverlap) * height;
        double roofHeight = .25 * height;
        
        double backWheelCenterXPos = width/3 + x;
        double frontWheelCenterXPos = width*2/3 + x;
        double wheelCenterYPos = y - wheelHeight/2;
        
        //make the back wheel
        Circle backWheel = 
        		new Circle(backWheelCenterXPos, wheelCenterYPos, wheelHeight/2);
	
        //make the front wheel
        Circle frontWheel =
        		new Circle(frontWheelCenterXPos, wheelCenterYPos, wheelHeight/2);
        
        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftRoof = 
            new Line2D.Double (x, y + roofHeight,
                               x + width/2.0, y);
	
        Line2D.Double rightRoof =
            new Line2D.Double (x + width/2.0, y,
                               x + width, y + roofHeight);
	
        // put the whole house together
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(firstStory, false);
        wholeHouse.append(leftRoof, false);
        wholeHouse.append(rightRoof, false);    
    }
}
