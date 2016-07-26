package edu.ucsb.cs56.drawings.marcellis.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Limo
      
   @author Marcellis Carr-Barfield 
   @version for CS56, M16, UCSB
   
*/
public class Limo extends Car implements Shape
{
    /**
     * Constructor for objects of class Limo
     */
    public Limo(double x, double y, double width, double height)
    {
	// construct the basic car shell
	super(x,y,width,height);
	double wheelHeight = .25 * height;
    double wheelCabinOverlap = wheelHeight/height/2;
    double cabinHeight = (0.4 +  wheelCabinOverlap) * height;
    double roofHeight = .35 * height;      
    double backWheelCenterXPos = width/6 + x;
    double frontWheelCenterXPos = width*5/6 + x;
    double wheelCenterYPos = y - wheelHeight/2;
    double wheelRadius = wheelHeight/2;
	// get the GeneralPath that we are going to append stuff to
	GeneralPath Limo = this.get();
	
	//0.44 is used as width of limo center window because trunk+hood is 1/3 of width, and the windshields are 1/6, and the space between windshields and center is 1/18
	// 1 - 1/3 - 1/6 - 1/18 = 0.44, the remaining width for the center window.
	Rectangle2D.Double extraWindows = new Rectangle2D.Double
			(
					backWheelCenterXPos + width/12 + width/36, y - cabinHeight - roofHeight + roofHeight/6,
						0.44*width, roofHeight*5/6
															);
	
    Limo.append(extraWindows, false);
         
    }    
}
