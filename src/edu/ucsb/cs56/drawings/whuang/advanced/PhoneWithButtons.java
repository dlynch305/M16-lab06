package edu.ucsb.cs56.drawings.whuang.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
   A Phone
      
   @author Winfred Huang
   @version for CS56, M16, UCSB
   
*/
public class PhoneWithButtons extends Phone implements Shape
{
    public PhoneWithButtons(double x, double y, double width, double height)
    {
	// construct the basic phone outline
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make three buttons, spaced like this, where screen width is between the phone bezels
	// three buttons will dynamically change accordingly to the width of the phone
	// | +----+----+----+ |
	// | |    |    |    | |
	// | +----+----+----+ |
	// |   b1   b2   b3   |
	//
	// The button starting position is the top left corner which is measured by
	// y + height - screenYPosition - buttonHeight
	// the height of each button is height times 0.08;
	
	double buttonWidth = (width * 0.75)/3;
	double buttonHeight = height * 0.08;
	double screenWidth = width * 0.75;
	double screenHeight = height * 0.8;
	double screenXPosition = (width - screenWidth)/2;
	double screenYPosition = (height - screenHeight)/2;

	double buttonTopPosition = height - screenYPosition - buttonHeight;
	double screenLeftBorder = x + screenXPosition;
	
	Rectangle2D.Double button1 =
	    new Rectangle2D.Double(screenLeftBorder, y + buttonTopPosition, buttonWidth, buttonHeight);
	Rectangle2D.Double button2 =
	    new Rectangle2D.Double(screenLeftBorder + buttonWidth, y + buttonTopPosition, buttonWidth, buttonHeight);
	Rectangle2D.Double button3 =
	    new Rectangle2D.Double(screenLeftBorder + buttonWidth*2, y + buttonTopPosition, buttonWidth, buttonHeight);

	//add the buttons to the phone
	GeneralPath smartPhone = this.get();
	smartPhone.append(button1,false);
	smartPhone.append(button2,false);
	smartPhone.append(button3,false);
	
    }    
}
