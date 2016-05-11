package dna.com;


import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.io.IOException;


public class Fenetre extends JFrame{
	
	private Panneau dash =new Panneau ();
	private JPanel jp= new JPanel(); 
	private JPanel jp_Information=new JPanel(); 
	public Fenetre() throws InterruptedException, IOException{
	this.setTitle("Animations");
	this.setSize(1000, 800);
	this.setLocationRelativeTo(null);               
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	jp.setLayout(new BoxLayout(jp, BoxLayout.PAGE_AXIS));
	jp.add(new JButton ("Brin")); 
	jp.add(new JButton ("Transcription")); 
	jp.add(new JButton ("Traduction")); 
	JButton jbMitose= new JButton("Mitose");
	jp.add(jbMitose);
	JButton jbMeiose= new JButton("Meiose");
	jp.add(jbMeiose);
	JButton jbFusion = new JButton("fusion");
	jp.add(jbFusion); 
	jp.add(new JCheckBox("Activer les mutations"));
	jp_Information.setLayout(new BoxLayout(jp_Information, BoxLayout.PAGE_AXIS));
	jp_Information.add(new JTextField("Opératiosn:"));
	jp_Information.add(new JTextField("Etapes:"));
	jp_Information.add(new JTextField("Nombre de chromosomes:"));
	jp_Information.add(new JTextField("Quantité d'ADN par cellule:"));
		
	this.add(jp, BorderLayout.LINE_START);
	this.add(dash, BorderLayout.CENTER);
	this.add(jp_Information, BorderLayout.SOUTH);
	dash.setBackground(Color.black);
	dash.setSize(1000, 800);
	jp.setBackground(Color.white);
	jp_Information.setBackground(Color.white);
	this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	jbMitose.addActionListener(new ActionMitose());
	jbMeiose.addActionListener(new ActionMeiose());
	jbFusion.addActionListener(new ActionFusion());
		

	}
		
		class ActionMitose implements  ActionListener {
	        public void actionPerformed (ActionEvent e) {
	        	new Thread() {
	                public void run() {
	                	for(int i=0; i<120; i++){
			        		try {
								dash.setImg(i);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							repaint();
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
	                	
	                	
	                }
	            }.start();
	        	
	        }
	    }
		
		
		class ActionMeiose implements  ActionListener {
	        public void actionPerformed (ActionEvent e) {
	        	new Thread() {
	                public void run() {
	                	for(int i=30; i<80; i++){
			        		try {
								dash.setImg(i);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							repaint();
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
	                	
	                	
	                    
	                }
	            }.start();
	        	
	        }
	    }
		
		
		class ActionFusion implements  ActionListener {
	        public void actionPerformed (ActionEvent e) {
	        	new Thread() {
	                public void run() {
	                	for(int i=0; i<120; i++){
			        		try {
								dash.setImg(i);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							repaint();
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
	                	
	                	
	                }
	            }.start();
	        	
	        }
	    }
		
		
		
		
		
		
		
		
	   
		
	
}


