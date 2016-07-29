package edu.ucsb.cs56.drawings.tnkwong.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.tnkwong.simple.Circle;

public class FullCat extends CatHead implements Shape
{

    public FullCat(double x, double y, double size)
    {
	super(x,y,size);
	GeneralPath gp = this.get();

	//Making a cat body
	Ellipse2D.Double body = new Ellipse2D.Double(x + (size * 1 / 3.14), y + (size * 1 / 3.14),
						     size * 4, size * 2);
	GeneralPath FullCat = this.get();

	//Making the legs
	Circle FLeg1 = new Circle(x + (size * 3 / 4), y + (size * 2.5), size / 2);
	Circle FLeg2 = new Circle(x + (size * 3 / 2), y + (size * 2.5), size / 4);
	Circle RLeg1 = new Circle(x + (size * 31 / 8), y + (size * 2.5), size / 2);
	Circle RLeg2 = new Circle(x + (size * 25 / 8), y + (size * 2.5), size / 4);
	Circle Tail = new Circle(x + (size * 4.575), y + (size * 1.314), size / 4);
	FullCat.append(body, false);
	FullCat.append(FLeg1, false);
	FullCat.append(FLeg2, false);
	FullCat.append(RLeg1, false);
	FullCat.append(RLeg2, false);
	FullCat.append(Tail, false);
    }
}
