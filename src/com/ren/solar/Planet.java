package com.ren.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import com.ren.util.GameUtil;

public class Planet extends Star {
	
	double longAxis;   //椭圆的长轴
	double shortAxis;  //椭圆的短轴
	double speed;      //飞行的速度
	double degree;     //角度
	Star center;       //环绕的中心
	
	boolean satellite;
	
	
	public void draw(Graphics g) {
		if (!satellite) {
			drawTrace(g);
		}
		super.draw(g);
		move();

	}
	
	public void drawTrace(Graphics g) {
		//画运动轨迹
		Color c = g.getColor();
		g.setColor(Color.red);
		g.drawOval((int)(center.x-this.longAxis), (int)(center.y-this.shortAxis), (int)(this.longAxis*2), (int)(this.shortAxis*2));
		g.setColor(c);
	}
	
	public void move(){
		//沿着椭圆轨迹飞行
		x = center.x+longAxis*Math.cos(degree);
		y = center.y+shortAxis*Math.sin(degree);
		degree += speed;
	}


	public Planet(Star center, String imgpath, double longAxis, double shortAxis, double speed) {
		super(GameUtil.getImage(imgpath));
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		this.x = center.x+longAxis;
		this.y = center.y+shortAxis;
	}
	
	public Planet(Star center, String imgpath, double longAxis, double shortAxis, double speed, boolean satellite) {
		this(center, imgpath, longAxis, shortAxis, speed);
		this.satellite = satellite;
	}

	public Planet(Image img, double x, double y) {
		super(img, x, y);
	}
	
	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
	}


}
