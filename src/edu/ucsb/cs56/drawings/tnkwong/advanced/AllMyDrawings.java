package edu.ucsb.cs56.drawings.tnkwong.advanced;

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
    /** Draw a picture with a few cats
     */
    
    public static void drawPicture1(Graphics2D g2) {


	CatHead cat1 = new CatHead(100, 250, 80);
	g2.setColor(Color.CYAN); g2.draw(cat1);

	Shape cat2 = ShapeTransforms.scaledCopyOfLL(cat1, 0.5, 0.5);
	g2.setColor(Color.BLACK); g2.draw(cat2);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	cat2 = ShapeTransforms.scaledCopyOfLL(cat2,4,4);
	cat2 = ShapeTransforms.translatedCopyOf(cat2,150,0);

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(cat2);

	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Some cat heads by Timothy Kwong", 20,20);
    }
	/**	House h1 = new House(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two houses with Windows
	
	HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
	HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few houses by Phill Conrad", 20,20);
    }
    
	*/    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some cats.
	
      	FullCat large = new FullCat(100,50,150);
	FullCat smallCC = new FullCat(20,50,40);
	FullCat tallSkinny = new FullCat(20,150,20);
	FullCat shortFat = new FullCat(20,250,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	CatHead cat1 = new CatHead(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(cat1);
	
	// Make a black cat that's half the size, 
	// and moved over 150 pixels in x direction
	Shape cat2 = ShapeTransforms.scaledCopyOfLL(cat1,0.5,0.5);
	cat2 = ShapeTransforms.translatedCopyOf(cat2,150,0);
	g2.setColor(Color.BLACK); g2.draw(cat2);
	
	// Here's a cat that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	cat2 = ShapeTransforms.scaledCopyOfLL(cat2,4,4);
	cat2 = ShapeTransforms.translatedCopyOf(cat2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(cat2); 
	
	
	FullCat cat3 = new FullCat(50,350,40);

	
	g2.draw(cat3);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second cat 45 degrees around its center.
	Shape cat4 = ShapeTransforms.rotatedCopyOf(cat3, Math.PI/4.0);
	
	g2.draw(cat4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Cats everywhere by Timothy Kwong", 20,20);
    }
	
    public static void drawPicture3(Graphics2D g2) {
		
	g2.drawString("Cat Clan by Timothy Kwong", 20,20);
       
	
	FullCat large = new FullCat(400,400,60);
	FullCat small = new FullCat(100,100,20);
	FullCat medium = new FullCat(100,400,70);
	FullCat tiltCat = new FullCat(400, 100, 40);
	Shape cat4 = ShapeTransforms.rotatedCopyOf(tiltCat, Math.PI/4.0);

	g2.setColor(Color.PINK);     g2.draw(medium);
	g2.setColor(Color.RED);      g2.draw(large);
	g2.setColor(Color.GREEN);    g2.draw(small);
	g2.setColor(Color.BLUE);   g2.draw(cat4);
	
    }       
}
