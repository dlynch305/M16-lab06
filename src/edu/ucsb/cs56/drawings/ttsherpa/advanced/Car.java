package edu.ucsb.cs56.drawings.ttsherpa.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class Car extends GeneralPathWrapper implements Shape
{

    public Car(double x, double y, double length, double height)
    {

		double trunkHeight= .53 * height;
		double roofHeight= height - trunkHeight;
		double lightheight= .20 * height;
		double lightlength= .10 * length;
	
		Rectangle2D.Double base = 
		new Rectangle2D.Double(x, y, length, 
		trunkHeight);
		
		Rectangle2D.Double top=
		new Rectangle2D.Double(x+(.25*length),y, 
		length-(.5*length), height-trunkHeight);
		
		Shape upwards = ShapeTransforms.verticallyFlippedCopyOf(top);

		Ellipse2D.Double backTire= new Ellipse2D.Double(x+ length * .17 , y+height*.4, .15*length, .15*length);
		Ellipse2D.Double frontTire= new Ellipse2D.Double(x+ length *.8 , y+height *.4, .15*length, .15*length);
		Rectangle2D.Double backlight =
		    new Rectangle2D.Double(x, y, lightlength,
					   lightheight);

		Ellipse2D.Double frontlight =
		    new Ellipse2D.Double(x+length, y, .04*length,.08*length );

		Line2D.Double doorsep =
		    new Line2D.Double (x+length/2, y,
				       x+length/2, y+trunkHeight);
		
		GeneralPath wholeCar= this.get();
		wholeCar.append(base, false);
		wholeCar.append(frontTire, false);
		wholeCar.append(backTire, false);
		wholeCar.append(upwards, false);
		wholeCar.append(backlight,false);
		wholeCar.append(frontlight,false);
		wholeCar.append(doorsep, false);
    }
}	
