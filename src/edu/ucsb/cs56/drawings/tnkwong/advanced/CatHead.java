package edu.ucsb.cs56.drawings.tnkwong.advanced;

import edu.ucsb.cs56.drawings.tnkwong.simple.Circle;

import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;




public class CatHead extends GeneralPathWrapper implements Shape
{
    public CatHead(double x, double y, double size)
    {
	double faceSize = size;

	Circle face = new Circle(x, y, faceSize);
	Line2D leftEar1 = new Line2D.Double( x - (faceSize * 1 / 2), y - (faceSize * 0.866),
					     x - (faceSize * 5 / 4), y - (faceSize * 5 / 4));
	Line2D leftEar2 = new Line2D.Double( x - (faceSize)        , y, 
					     x - (faceSize * 5 / 4), y - (faceSize * 5 / 4));
	Line2D rightEar1 = new Line2D.Double(x + (faceSize * 1 / 2), y - (faceSize * 0.866),
					     x + (faceSize * 5 / 4), y - (faceSize * 5 / 4));
	Line2D rightEar2 = new Line2D.Double( x + (faceSize)        , y                    ,			                          x + (faceSize * 5 / 4), y - (faceSize * 5 / 4));
	Line2D nose1 = new Line2D.Double ( x - (faceSize * 1 / 8), y,
					   x + (faceSize * 1 / 8), y);
	Line2D nose2 = new Line2D.Double ( x + (faceSize * 1 / 8), y,
					   x                     , y + (faceSize * 1 / 4 ));
	Line2D nose3 = new Line2D.Double ( x                     , y + (faceSize * 1 / 4 ),
					   x - (faceSize * 1 / 8), y);
	Circle leftEye = new Circle( x - (faceSize / 3), y - (faceSize * 1 / 3),
				     faceSize / 8 );
	Circle rightEye = new Circle( x + (faceSize / 3), y - (faceSize * 1 / 3),
				      faceSize / 8 );



	
	Line2D LWhisker1 = new Line2D.Double ( x - (faceSize * 1 / 8), y + (faceSize * 1 / 8),
					       x - (faceSize * 2 / 3), y);
	Line2D LWhisker2 = new Line2D.Double ( x - (faceSize * 1 / 8), y + (faceSize * 1 / 8),
					       x - (faceSize * 2 / 3), y + (faceSize * 1 / 8));
	Line2D LWhisker3 = new Line2D.Double ( x - (faceSize * 1 / 8), y + (faceSize * 1 / 8),
					       x - (faceSize * 2 / 3), y + (faceSize * 1 / 4));


	
	Line2D RWhisker1 = new Line2D.Double ( x + (faceSize * 1 / 8), y + (faceSize * 1 / 8),
					       x + (faceSize * 2 / 3), y);
	Line2D RWhisker2 = new Line2D.Double ( x + (faceSize * 1 / 8), y + (faceSize * 1 / 8),
					       x + (faceSize * 2 / 3), y + (faceSize * 1 / 8));
	Line2D RWhisker3 = new Line2D.Double ( x + (faceSize * 1 / 8), y + (faceSize * 1 / 8),
					       x + (faceSize * 2 / 3), y + (faceSize * 1 / 4));

	GeneralPath wholeCat = this.get();
	wholeCat.append(face, false);
	wholeCat.append(leftEar1, false);
	wholeCat.append(leftEar2, false);
	wholeCat.append(rightEar1, false);
	wholeCat.append(rightEar2, false);
	wholeCat.append(nose1, false);
	wholeCat.append(nose2, false);
	wholeCat.append(nose3, false);
	wholeCat.append(leftEye, false);
	wholeCat.append(rightEye, false);
	wholeCat.append(LWhisker1, false);
	wholeCat.append(LWhisker2, false);
	wholeCat.append(LWhisker3, false);
	wholeCat.append(RWhisker1, false);
	wholeCat.append(RWhisker2, false);
	wholeCat.append(RWhisker3, false);

    }
}
