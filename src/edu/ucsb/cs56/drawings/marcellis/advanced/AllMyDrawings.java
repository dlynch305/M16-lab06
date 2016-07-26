package edu.ucsb.cs56.drawings.marcellis.advanced;

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
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a cars and limos 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Car c1 = new Car(100,250,50,75);
	g2.setColor(Color.MAGENTA); g2.draw(c1);
	
	// Make a green car that's half the size, 
	// and moved over 150 pixels in x direction
	// and moved down 25 pixels in y direction
	// and make a black car that's three times the size in y and 6 times in x
	// translated 300 pixels in x direction and -50 in y direction
	
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,25);
	Shape c3 = ShapeTransforms.scaledCopyOfLL(c1, 6, 3);
	c3 = ShapeTransforms.translatedCopyOf(c3, 50, -50);
	g2.setColor(Color.GREEN); 
	g2.draw(c2);
	g2.setColor(Color.BLACK);
	g2.draw(c3);
	
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(c2); 
	
	// Draw Limos
	
	Limo l1 = new Limo(50, 350, 150, 75);
	Shape l2 = ShapeTransforms.verticallyFlippedCopyOf(l1);
	l2 = ShapeTransforms.translatedCopyOf(l2, 300, -150);
	Shape l3 = ShapeTransforms.rotatedCopyOf(l2, 90);
	l3 = ShapeTransforms.scaledCopyOf(l3, 0.5, 0.5);
	
	//draw the first limo red
	Stroke limoStroke = new BasicStroke(6.0f,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);
	g2.setStroke(limoStroke);
	g2.setColor(Color.RED);
	g2.draw(l1);
	g2.setColor(Color.yellow);
	g2.draw(l2);
	g2.setColor(Color.CYAN);
	g2.draw(l3);
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Cars and Limos by Marcellis Carr-Barfield", 20,20);
    }
    
    
    /** Draw a a bunch of limos rotated around a center point
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some limos
	Limo l1 = new Limo(200,200,200,75);
	Shape l2 = ShapeTransforms.rotatedCopyOf(l1, Math.PI/6);
	Shape l3 = ShapeTransforms.rotatedCopyOf(l2, Math.PI/6);
	Shape l4 = ShapeTransforms.rotatedCopyOf(l3, Math.PI/6);
	Shape l5 = ShapeTransforms.rotatedCopyOf(l4, Math.PI/6);
	Shape l6 = ShapeTransforms.rotatedCopyOf(l5, Math.PI/6);
	Shape l7 = ShapeTransforms.rotatedCopyOf(l6, Math.PI/6);
	
	Stroke thick = new BasicStroke(4.0f);
	g2.setStroke(thick);
	g2.setColor(Color.GREEN);   g2.draw(l2);
	g2.setColor(Color.BLUE);    g2.draw(l3);
	g2.setColor(Color.MAGENTA); g2.draw(l4);
	g2.setColor(Color.DARK_GRAY); g2.draw(l5);
	g2.setColor(Color.ORANGE); g2.draw(l6);
	g2.setColor(Color.CYAN); g2.draw(l7);
	g2.setColor(Color.RED);     g2.draw(l1);
	
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Limos by Marcellis Carr-Barfield", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of cars and limos by Marcellis Carr-Barfield", 20,20);
	
	
	// Draw some cars.
	
	Car smallCar = new Car(100,250,50,25);
	Car bigCar = new Car(20,250,75,150);
	
	// Draw some limos
	Limo bigLimo = new Limo(300,250,200,150);
	Limo shortLimo = new Limo(150, 400, 40, 20);
	
	g2.setColor(Color.RED);     g2.draw(smallCar);
	g2.setColor(Color.GREEN);   g2.draw(bigCar);
	g2.setColor(Color.BLUE);	g2.draw(bigLimo);
	g2.setColor(Color.ORANGE);	g2.draw(shortLimo);
	
    }       
}
