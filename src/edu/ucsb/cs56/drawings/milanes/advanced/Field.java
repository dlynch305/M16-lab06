package edu.ucsb.cs56.drawings.milanes.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Field

   @author Arturo Milanes
   @version for CS56, W16, UCSB
   
*/
public class Field extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Field
     */
    public Field(double x, double y, double width, double length)
    {
        
	Double midLineY = y+length/2.0 ;
        
	//make the boundaries
	Rectangle2D.Double boundaries = new Rectangle2D.Double (x,y,width,length);

	// middle line
	Line2D.Double midLine = new Line2D.Double (x, midLineY, x+width, midLineY);
       
        GeneralPath wholeField = this.get();  

	wholeField.append(boundaries, false);
	wholeField.append(midLine, false);
        
    }

}
