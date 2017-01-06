package com.ren.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.ren.util.*;;

public class SolarFrame extends MyFrame {
	
	Image Space = GameUtil.getImage("images/Space.jpg");
	Star sun = new Star("images/Sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	Planet earth = new Planet(sun, "images/earth.jpg", 150, 150, 0.05);
	Planet mars = new Planet(sun, "images/earth.jpg", 200, 130, 0.15);
	Planet moon = new Planet(earth, "images/earth.jpg", 50, 50, 0.1, true);
			
			
	public void paint(Graphics g) {
		g.drawImage(Space, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
	}
	
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}

}
