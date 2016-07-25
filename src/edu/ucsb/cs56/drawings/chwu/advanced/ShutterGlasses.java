package edu.ucsb.cs56.drawings.chwu.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;

/**
   A pair of SunGlasses
      
   @author Chi(Mark) Wu 
   @version for CS56, S16, UCSB
   
*/
public class ShutterGlasses extends Glasses implements Shape
{
    
    public ShutterGlasses(double x, double y, double width, double height)
    {
	// construct the basic glasses shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

        double lensHeight = 0.75 * height;
	double lensWidth = (.80 * width)/2;
	double lensLUpperLeftX = x + (width - lensWidth * 2)/3;
	double lensLUpperLeftY = y + height + (height - lensHeight)/2;

	double lensRUpperLeftX = lensLUpperLeftX + lensWidth + (width - lensWidth * 2)/3;
	double lensRUpperLeftY = lensLUpperLeftY;
	double gap = lensHeight/5;
	
	Line2D.Double lineL1 = 
            new Line2D.Double (lensLUpperLeftX, lensLUpperLeftY +gap,
                               lensLUpperLeftX + lensWidth, lensLUpperLeftY +gap);
	Line2D.Double lineR1 = 
            new Line2D.Double (lensRUpperLeftX, lensRUpperLeftY +gap,
                               lensRUpperLeftX + lensWidth, lensRUpperLeftY +gap);
	Line2D.Double lineL2 = 
            new Line2D.Double (lensLUpperLeftX, lensLUpperLeftY +gap*2,
                               lensLUpperLeftX + lensWidth, lensLUpperLeftY +gap*2);
	Line2D.Double lineR2 = 
            new Line2D.Double (lensRUpperLeftX, lensRUpperLeftY +gap*2,
                               lensRUpperLeftX + lensWidth, lensRUpperLeftY +gap*2);
	Line2D.Double lineL3 = 
            new Line2D.Double (lensLUpperLeftX, lensLUpperLeftY +gap*3,
                               lensLUpperLeftX + lensWidth, lensLUpperLeftY +gap*3);
	Line2D.Double lineR3 = 
            new Line2D.Double (lensRUpperLeftX, lensRUpperLeftY +gap*3,
                               lensRUpperLeftX + lensWidth, lensRUpperLeftY +gap*3);
	Line2D.Double lineL4 = 
            new Line2D.Double (lensLUpperLeftX, lensLUpperLeftY +gap*4,
                               lensLUpperLeftX + lensWidth, lensLUpperLeftY +gap*4);
	Line2D.Double lineR4 = 
            new Line2D.Double (lensRUpperLeftX, lensRUpperLeftY +gap*4,
                               lensRUpperLeftX + lensWidth, lensRUpperLeftY +gap*4);
	
	// add the lines to the lens
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeGlasses = this.get();
        wholeGlasses.append(lineL1, false);
        wholeGlasses.append(lineL2, false);
        wholeGlasses.append(lineL3, false);
	wholeGlasses.append(lineL4, false);
        wholeGlasses.append(lineR1, false);
        wholeGlasses.append(lineR2, false);
        wholeGlasses.append(lineR3, false);
        wholeGlasses.append(lineR4, false);
	
    }    
}
