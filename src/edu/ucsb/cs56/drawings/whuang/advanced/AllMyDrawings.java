package edu.ucsb.cs56.drawings.whuang.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Winfred Huang 
 * @version for UCSB CS56, M16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few phones 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Phone p1 = new Phone(100,150,75,100);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black phone that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a phone that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 

	//After setting stroke, rotate the phone 45 degrees about its center
	Shape p3 = ShapeTransforms.rotatedCopyOf(p2, Math.PI/4.0);
	g2.draw(p3); 
		
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few phones by Winfred Huang", 20,20);
    }
    
    
    /** Draw a picture with a few smartphones
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some smartphones

	PhoneWithButtons superSmall = new PhoneWithButtons(20,250,25,37.5);
	PhoneWithButtons small = new PhoneWithButtons(70,50,50,75);
	PhoneWithButtons medium = new PhoneWithButtons(100,150,100,150);
	PhoneWithButtons large = new PhoneWithButtons(300,100,200,300);
	
	g2.setColor(Color.RED);      g2.draw(superSmall);
	g2.setColor(Color.GREEN);    g2.draw(small);
	g2.setColor(Color.BLUE);     g2.draw(medium);
	g2.setColor(Color.MAGENTA);
	
	// Rotate the largest phone
	Shape smartphone = ShapeTransforms.rotatedCopyOf(large, Math.PI/4.0);
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.draw(smartphone);

	Stroke orig2=g2.getStroke();
	g2.setStroke(orig2);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of smartphones by Winfred Huang", 20,20);
    }
    
    /** Draw a different picture with a few phones and smartphones
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	g2.drawString("A bunch of phones by Winfred Huang", 20,20);
      
	Phone p1 = new Phone(100,150,50,75);
	g2.setColor(Color.GRAY); g2.draw(p1);

	//Blue Phone
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLUE); g2.draw(p2);

	//Enlarged phone
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);

	//Thick stroke phone
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));

	//Rotated phone
	Shape p3 = ShapeTransforms.rotatedCopyOf(p2, Math.PI/4.0);
	g2.draw(p3);

	PhoneWithButtons small = new PhoneWithButtons(70,50,50,75);
	PhoneWithButtons medium = new PhoneWithButtons(100,250,100,150);
	
	g2.setColor(Color.GREEN);      g2.draw(small);
	g2.setColor(Color.DARK_GRAY);  g2.draw(medium);
	
	//Rotate the small phone
	Shape smartphone = ShapeTransforms.rotatedCopyOf(small, Math.PI/4.0);
	smartphone = ShapeTransforms.translatedCopyOf(smartphone,200,0);
	smartphone = ShapeTransforms.scaledCopyOfLL(smartphone,2,2);
	g2.draw(smartphone);
		
	PhoneWithButtons notAPhone1 = new PhoneWithButtons(300,250,225,150);
	PhoneWithButtons notAPhone2 = new PhoneWithButtons(20,200,40,30);
	
	g2.setColor(Color.MAGENTA);      g2.draw(notAPhone1);
	g2.setColor(Color.ORANGE);   g2.draw(notAPhone2);
	
    }       
}
