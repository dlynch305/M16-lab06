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
        double wheelCabinOverlap = wheelHeight/height/2;
        double cabinHeight = (0.4 +  wheelCabinOverlap) * height;
        double roofHeight = .35 * height;      
        double backWheelCenterXPos = width/6 + x;
        double frontWheelCenterXPos = width*5/6 + x;
        double wheelCenterYPos = y - wheelHeight/2;
        double wheelRadius = wheelHeight/2;
        
        //check to make sure the wheels are a reasonable size and reposition if necessary
        if (wheelHeight > width/4){
        	wheelHeight = width/4;
        	wheelRadius = wheelHeight/2;
        	wheelCenterYPos = y - wheelHeight/2;
        }
        
        
        
        //make the back wheel
        Circle backWheel = 
        		new Circle(backWheelCenterXPos, wheelCenterYPos, wheelHeight/2);
	
        //make the front wheel
        Circle frontWheel =
        		new Circle(frontWheelCenterXPos, wheelCenterYPos, wheelHeight/2);
        
        // make the cabin, trunk, and hood.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double bottomTrunk = 
        		new Line2D.Double (x, y - wheelRadius,
                               	backWheelCenterXPos - wheelRadius, y - wheelRadius);
        
        Line2D.Double sideTrunk =
        		new Line2D.Double(x, y - wheelRadius,
        						x, y - cabinHeight);
        
        Line2D.Double topTrunk =
        		new Line2D.Double(x,  y - cabinHeight,
        						backWheelCenterXPos, y - cabinHeight);
        
        Line2D.Double bottomHood = 
        		new Line2D.Double(frontWheelCenterXPos + wheelRadius, y - wheelRadius,
        						x + width, y - wheelRadius);
        
        Line2D.Double sideHood = 
        		new Line2D.Double(x + width, y - wheelRadius,
        						x + width, y - cabinHeight);
	
        Line2D.Double topHood =
        		new Line2D.Double (x + width, y - cabinHeight,
            					frontWheelCenterXPos, y - cabinHeight);
        
        Line2D.Double bottomCabin = 
        		new Line2D.Double(backWheelCenterXPos + wheelRadius, y - wheelRadius,
        						frontWheelCenterXPos - wheelRadius, y - wheelRadius);
        
        Line2D.Double frontCabin = 
        		new Line2D.Double(frontWheelCenterXPos, y - cabinHeight,
        						frontWheelCenterXPos, y - cabinHeight - roofHeight);
        
        Line2D.Double backCabin =
        		new Line2D.Double(backWheelCenterXPos, y - cabinHeight,
        						backWheelCenterXPos, y - cabinHeight - roofHeight);
        
        Line2D.Double roofCabin = 
        		new Line2D.Double(backWheelCenterXPos, y - cabinHeight - roofHeight,
        						frontWheelCenterXPos, y - cabinHeight - roofHeight);
        
        // create the car windows
        Rectangle2D.Double frontWindshield = 
        		new Rectangle2D.Double(frontWheelCenterXPos - width/12, y - cabinHeight - roofHeight + roofHeight/6,
        						width/12, roofHeight*5/6);
        
        Rectangle2D.Double backWindshield =
        		new Rectangle2D.Double(backWheelCenterXPos, y - cabinHeight - roofHeight + roofHeight/6, width/12,  roofHeight*5/6);
	
        // put the whole house together
	
        GeneralPath wholeCar = this.get();
        wholeCar.append(backWheel, false);
        wholeCar.append(frontWheel, false);
        wholeCar.append(bottomTrunk, false);
        wholeCar.append(sideTrunk, false);
        wholeCar.append(topTrunk, false);
        wholeCar.append(bottomHood, false);
        wholeCar.append(sideHood, false);
        wholeCar.append(topHood, false);
        wholeCar.append(bottomCabin, false);
        wholeCar.append(frontCabin, false);
        wholeCar.append(backCabin, false);
        wholeCar.append(roofCabin, false);
        wholeCar.append(frontWindshield, false);
        wholeCar.append(backWindshield, false);
    }
}
