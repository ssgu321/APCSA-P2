//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200, 0, 0);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		setPos(x, y);
	}
	public Ball(int x, int y, int w, int h) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
	}
	public Ball(int x, int y, int w, int h, Color col) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(col);
	}
	public Ball(int x, int y, int w, int h, int xS, int yS) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setSpeed(xS, yS);
		
	}
	public Ball(int x, int y, int w, int h, Color col, int xS, int yS) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(col);
		setSpeed(xS, yS);
		
	}
	
   //add the set methods
	public void setSpeed(int xS, int yS) {
		xSpeed = xS;
		ySpeed = yS;
	}
   public void setXSpeed(int xS) {
	   xSpeed = xS;
   }
   public void setYSpeed(int yS) {
	   ySpeed = yS;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY() + ySpeed);

		//draw the ball at its new location
      draw(window, super.getColor());
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		if (other.getColor() == getColor() 
				&& other.getX() == getX() 
				&& other.getY() == getY() 
				&& other.getWidth() == getWidth()
				&& other.getHeight() == getHeight()
				&& other.getXSpeed() == getXSpeed()
				&& other.getYSpeed() == getYSpeed())
			return true;



		return false;
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}

   //add a toString() method
	public String toString() {
		 return getX()  + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + xSpeed + " " + ySpeed;
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		// TODO Auto-generated method stub
		return getX() < -10;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		return getX() > 780;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		return getY() <= 10;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		return getY() >= 550;
	}
}