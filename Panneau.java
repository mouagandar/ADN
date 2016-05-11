package dna.com;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Panneau extends JPanel  { 
	
	private BufferedImage imgCurrent; 
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	public void paintComponent ( Graphics g ) {	
		int x= this.getWidth()/4; 
		int y= this.getHeight()/4;
		g.drawImage( imgCurrent, x, y, null);
	}  
	
	
	public BufferedImage setImg (int num) throws IOException{
		this.imgCurrent = ImageIO.read(Panneau.class.getResource("/imgs/"+num+".png"));
		return imgCurrent; 
	}
	



}


