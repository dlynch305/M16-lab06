package edu.ucsb.cs56.drawings.chwu.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A pair of SunGlasses
      
   @author Chi(Mark) Wu 
   @version for CS56, S16, UCSB
   
*/
public class SunGlasses extends Glasses implements Shape
{
    
    public SunGlasses(double x, double y, double width, double height)
    {
	// construct the basic glasses shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	
	double w = 0.10 * width;
	double winTop = y + 0.5 * height;
	double winHt =  0.25 * height;
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(win1, false);
        wholeHouse.append(win2, false);
        wholeHouse.append(win3, false); 
    }    
}
