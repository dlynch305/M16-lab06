package edu.ucsb.cs56.drawings.chwu.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pair of glasses that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Chi(Mark) Wu 
   @version for CS56, S16, UCSB
   
*/
public class Glasses extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of glasses
       @param y y coord of upper left corner of glasses
       @param width width of the glasses frame
       @param height height of the glasses frame
    */
    public Glasses(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
	double templeHeight = height;
        double lensHeight = .75 * height;
        double lensWidth = (.80 * width)/2;
        double frameUpperLeftY = y + templeHeight;
	
	double lensLUpperLeftX = x + (width - lensWidth * 2)/3;
	double lensLUpperLeftY = frameUpperLeftY + (height - lensHeight)/2;

	double lensRUpperLeftX = lensLUpperLeftX + lensWidth + (width - lensWidth * 2)/3;
	double lensRUpperLeftY = lensLUpperLeftY;
        
        Rectangle2D.Double frame = 
            new Rectangle2D.Double(x, y + templeHeight ,
				   width, height);
	Rectangle2D.Double lensL =
	    new Rectangle2D.Double(lensLUpperLeftX, lensLUpperLeftY,
				   lensWidth, lensHeight);
	Rectangle2D.Double lensR =
	    new Rectangle2D.Double(lensRUpperLeftX, lensRUpperLeftY,
				   lensWidth, lensHeight);
	
        // make the temples.
        
        Line2D.Double templeL = 
            new Line2D.Double (x, y + templeHeight,
                               x * 1.25, y);
	
        Line2D.Double templeR =
            new Line2D.Double (x + width, y + templeHeight,
                               x + width * 1.25, y);
	// make the temple tips.
	Line2D.Double templeTipL =
	    new Line2D.Double (x * 1.25, y,
			       x * 1.25, y * 1.25);
	Line2D.Double templeTipR =
	    new Line2D.Double (x + width * 1.25, y,
			       x + width * 1.25, y * 1.25);

	
        // put the whole glasses together
	
        GeneralPath wholeGlasses = this.get();
        wholeGlasses.append(frame, false);
        wholeGlasses.append(lensL, false);
        wholeGlasses.append(lensR, false);
	wholeGlasses.append(templeL, false);
	wholeGlasses.append(templeR, false);
	wholeGlasses.append(templeTipL, false);
	wholeGlasses.append(templeTipR, false);
    }
}
