package com.ren.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.ren.util.GameUtil;

public class Star {
	
	Image img;
	double x,y;
	double Width,Height;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)(x-Width/2), (int)(y-Height/2), null);
	}
	
	public Star(){
		
	}

	public Star (Image img) {
		this.img = img;
		this.Width = img.getWidth(null);
		this.Height = img.getHeight(null);
	}
	
	public Star(Image img,double x,double y){
		this(img);
		this.x = x;
		this.y = y;
	}
	
	public Star(String imgpath,double x,double y){
		this(GameUtil.getImage(imgpath),x,y);
	}

}
