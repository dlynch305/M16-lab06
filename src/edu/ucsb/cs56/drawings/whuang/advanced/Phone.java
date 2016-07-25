package edu.ucsb.cs56.drawings.whuang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Winfred Huang 
   @version for CS56, M16, UCSB
   
*/
public class Phone extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x upper left corner of phone
       @param y upper left corner of phone
       @param width of the phone
       @param height of phone
    */
    public Phone(double x, double y, double width, double height)
    {
	double screenWidth = width * 0.75;
	double screenHeight = height * 0.8;
	double screenYPosition = (height - screenHeight)/2;
	double screenXPosition = (width - screenWidth)/2;
	
	double phoneEdgeArcWidth = screenXPosition * 2;
	double phoneEdgeArcHeight = screenYPosition * 2;
		
	// Make the outline of the phone
	RoundRectangle2D.Double phoneOutline =
	    new RoundRectangle2D.Double(x, y,
					width, height,
					phoneEdgeArcWidth, phoneEdgeArcHeight);

	// Make the screen of the phone
	Rectangle2D.Double screen =
	    new Rectangle2D.Double(x + screenXPosition, y + screenYPosition,
				   screenWidth, screenHeight);
	
        // put the whole phone together

	GeneralPath wholePhone = this.get();
	wholePhone.append(phoneOutline, false);
	wholePhone.append(screen, false);
	
    }
}
