package edu.ucsb.cs56.drawings.alan_tran.advanced;

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
    /** Draw a picture with a box 
     */
    public static void drawPicture1(Graphics2D g2) {
	Square s2 = new Square (150,150,150,150);
	g2.setColor(Color.BLACK);
	g2.draw(s2);
	g2.drawString("A Box By Alan Tran", 23,23);
    }
    
    
     //Draw a picture with boxes and presents
     
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some square.
	
	Square large = new Square(250,250,250,250);
	Square smallS = new Square(50,50,50,50);
	
       	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallS);
		
	Square s1 = new Square(100,100,100,100);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black box that's half the size, 
	// and moved over 150 pixels in x direction
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two present
	
	Present sp1 = new Present(50,50,50,50);
	Present sp2 = new Present(200,200,200,200);
	
	g2.draw(sp1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second square 45 degrees around its center.
	Shape sp3 = ShapeTransforms.rotatedCopyOf(sp2, Math.PI/4.0);
	
	g2.draw(sp3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of box and a few present by Alan Tran", 20,20);
    }
    
     //Draw a different picture with boxes and present
  
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A Square and Present by Alan Tran", 20,20);
	
	
	// Draw some coffee cups.
	
	Square largeS = new Square(100,100,100,100);
	Present smallP = new Present(25,25,25,25);
	
	g2.setColor(Color.RED);     g2.draw(largeS);
	g2.setColor(Color.GREEN);   g2.draw(smallP);
	
    }
}
