//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = null;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int h) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}
	public Block(int x, int y, int w, int h, Color col) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = col;
	}
	
   //add the other set methods
	@Override
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;	
	}

	@Override
	public void setX(int x) {
		xPos = x;
	}

	@Override
	public void setY(int y) {
		yPos = y;
	}
	
   public void setWidth(int w) {
	   	width = w;
   }
    
   public void setHeight(int h) {
	   	height = h;
   }
   
   public void setColor(Color col)
   {
	   color = col; 
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block) obj;
		if (other.getColor() == color 
				&& other.getX() == xPos 
				&& other.getY() == yPos 
				&& other.getWidth() == width
				&& other.getHeight() == height)
			return true;

		return false;
	}	

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}   

   //add the other get methods
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public Color getColor() {
    	return color;
    }

   //add a toString() method  - x , y , width, height, color
    public String toString()
    {
    	return xPos + " " + yPos + " " + width + " " + height + " " + color;
    }
}