//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10, 0, 0);
       speed =5;
   }
   //add the other Paddle constructors
   public Paddle(int x, int y) {
	   super(x, y, 0, 0, Color.BLACK);
	   speed = 0;
   }
   
   public Paddle(int x, int y, int w) {
	   super(x, y, w, 0, Color.BLACK);
	   speed = 0;
   }
   public Paddle(int x, int y, int w, int h) {
	   super(x, y, w, h, Color.BLACK);
	   speed = 0;
   }
   public Paddle(int x, int y, int w, int h, int s) {
	   super(x, y, w, h, Color.BLACK);
	   speed = s;
   }
   public Paddle(int x, int y, int w, int h, Color col, int s) {
	   super(x, y, w, h, col);
	   speed = s;
   }

   public void setSpeed(int s) {
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   
	   setY(getY() + speed);
	   
	   draw(window, super.getColor());

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   
	   setY(getY() - speed);
	   
	   draw(window, super.getColor());

   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
		 return getX()  + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getSpeed();

   }
}