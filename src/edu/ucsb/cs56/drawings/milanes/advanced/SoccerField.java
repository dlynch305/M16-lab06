package edu.ucsb.cs56.drawings.milanes.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Soccer Field
      
   @author Arturo Milanes 
   @version for CS56, W16, UCSB
   
*/
public class SoccerField extends Field implements Shape
{
    /**
     * Constructor for objects of class Field
     */
    public SoccerField(double x, double y, double width, double length)
    {
	// construct the basic field shell
	super(x,y,width,length);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	//make soccer field with Areas, halfmoons(arcs), penalty dots, and a center circle with center dot

	//CIRCLES

	double diameterC = length*.01;
	double diameter = length*.1;
	double radius = diameter/2.0;
	
	Ellipse2D.Double centerCircle =
	    new Ellipse2D.Double(x+width*.425, y + length*.45, diameter, diameter);
	
	Ellipse2D.Double center=
	    new Ellipse2D.Double(x+width*.4925, y + length*.495, diameterC, diameterC);

	Ellipse2D.Double penaltyA=  new Ellipse2D.Double(x+width*.4925, y + length*.10, diameterC, diameterC);
	
		Ellipse2D.Double penaltyB=  new Ellipse2D.Double(x+width*.4925, y + length*.90, diameterC, diameterC);


		
       	//AREAS
	double smallW = width * .20;
	double smallL = length * .05;
	double bigL = length * .15;
	double bigW = width * .40;
	
	    
	
	Rectangle2D.Double smallAreaA =
	    new Rectangle2D.Double(x + width*.4, y,smallW ,smallL );
	Rectangle2D.Double bigAreaA =
	    new Rectangle2D.Double(x + width *.3, y, bigW, bigL);
	Rectangle2D.Double smallAreaB =
	    new Rectangle2D.Double(x+width*.4, y+length*.95, smallW, smallL);
	Rectangle2D.Double bigAreaB =
	    new Rectangle2D.Double(x+width*.3, y+length*.85 , bigW, bigL);

       	//ARCS
	//halfmoon and penalty point 

	Arc2D.Double halfMoonA =
	    new Arc2D.Double (x+width*.425, y + length*.13, diameter, radius, 0,-180, Arc2D.OPEN);
	Arc2D.Double halfMoonB =
	    new Arc2D.Double (x+width*.425, y+length*.82, diameter, radius, 0, 180, Arc2D.OPEN);


	
	//create the full field adding everything together
        GeneralPath fullField = this.get();
        fullField.append(smallAreaA, false);
	fullField.append(bigAreaA, false);
	fullField.append(smallAreaB, false);
	fullField.append(bigAreaB, false);
	fullField.append(centerCircle, false);
	fullField.append(halfMoonA, false);
	fullField.append(halfMoonB, false);
	fullField.append(center, false);
	fullField.append(penaltyA, false);
	fullField.append(penaltyB, false);
    }    
}
