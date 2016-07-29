package edu.ucsb.cs56.drawings.milanes.advanced;

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
 * @author Arturo Milanes
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few fields
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Field f1 = new Field(100,250,80,120);
	g2.setColor(Color.CYAN); g2.draw(f1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(Color.BLACK); g2.draw(f2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
		
	Stroke orig = g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f2); 
	
	// @@@Signature
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few fields by Arturo Milanes", 20,20);
    }
    
    
    /** Draw a picture with a few Fields and Soccer Fields
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Soccer Fields
	
        SoccerField large = new SoccerField(200,50,150,225);
	SoccerField small = new SoccerField(350,900,40,70);
	SoccerField tall = new SoccerField(150,150,100,200);
	SoccerField Fat = new SoccerField(20,250,100,100);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tall);
	g2.setColor(Color.MAGENTA); g2.draw(Fat);
	
	Field f1 = new Field(100,250,90,120);
	g2.setColor(Color.CYAN); g2.draw(f1);
	
	// Make a black field that's half the size, 
	// and moved over 150 pixels in x direction
	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(Color.BLACK); g2.draw(f2);
	
	// Here's a field that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	
	
	
	// Draw a soccerField
	

	SoccerField sf = new SoccerField(200,350,80,110);
	
	g2.draw(sf);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape sf2 = ShapeTransforms.rotatedCopyOf(sf, Math.PI/4.0);
	
	g2.draw(sf2);

		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
		
	Stroke orig = g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(sf2); 
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Fields and SoccerFields by Arturo Milanes", 20,20);
    }
    
    /** Draw a different picture with a few Soccer Fileds
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of SoccerFields by Arturo Milanes", 20,20);
	
	
	// Draw some SoccerFields.
	
        SoccerField large = new SoccerField(100,250,160,240);
	SoccerField small = new SoccerField(20,50,80,120);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
    }       
}
