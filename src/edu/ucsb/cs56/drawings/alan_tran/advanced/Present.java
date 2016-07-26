package edu.ucsb.cs56.drawings.alan_tran.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.alan_tran.simple.Circle;

public class Present extends Square implements Shape
{
    public Present(double x, double y, double width, double height)
    {
	super(x,y,width,height);
	double crossWidth = width;
	double crossHeight = height*0.1;
	Rectangle2D.Double crossHorizontal = new Rectangle2D.Double(x,y+.45*y,crossWidth,crossHeight);
	Rectangle2D.Double crossVertical = new Rectangle2D.Double(x+.45*x,y,crossHeight,crossWidth);
        Circle bowCircle = new Circle(x*1.5,y*.9,x/10);
	Ellipse2D.Double bowLeft  = new Ellipse2D.Double(x,y*.8,width*.4,height*.2);
	Ellipse2D.Double bowRight = new Ellipse2D.Double(x*1.6,y*.8,width*.4,height*.2);
	GeneralPath box = this.get();
	box.append(crossHorizontal,false);
	box.append(crossVertical,false);
        box.append(bowCircle,false);
	box.append(bowRight,false);
	box.append(bowLeft,false);
	
    }
}
