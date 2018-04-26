//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;
	private AlienHorde aliens;
	private FastAlien fAlien;
	private Bullets shots;
	
	private boolean bulletLock;
	private boolean[] keys;
	private boolean gameOver;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400, 450, 75, 50, 2);
		// alienOne = new Alien(100, 150, 55, 30, 1);
        // alienTwo = new Alien(150, 200, 55, 30, 1);
         shots = new Bullets();
         aliens = new AlienHorde(4);
         fAlien = new FastAlien();
         
         int xPos = 100;
         for (int i = 1; i <= 15; i++) {
             aliens.add(new Alien(xPos,60,1));
             aliens.add(new Alien(xPos,15,2));
             if (i%5 == 0) {
            	 fAlien.add(new Alien(100, 60, 1));
             }
             xPos -= 100;
         }
         

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		bulletLock = false;
		gameOver = false;
		
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.YELLOW);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		aliens.drawEmAll(graphToBack);
		aliens.moveEmAll();
		aliens.removeDeadOnes(shots);
		fAlien.drawEmAll(graphToBack);
		fAlien.moveEmAll();
		fAlien.removeDeadOnes(shots);
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
	
		
		if (keys[4] == true) {
			shots.add(new Ammo((ship.getX() + ship.getWidth() / 2) - 5, ship.getY() - 5, 5));
			keys[4] = false;
		}
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		
		if(keys[0] == true)
		{
			if (ship.getX() > -15)
				ship.move("LEFT");
		}
		//add code to move Ship, Alien, etc.
		if(keys[1] == true)
		{
			if(ship.getX() < 725)
				ship.move("RIGHT");
			
		}
		if(keys[3] == true)
		{
			if (ship.getY() < 500)
				ship.move("UP");
			
		}
		if(keys[2] == true)
		{
			if (ship.getY() > 10)
				ship.move("DOWN");
			
		}
	
		//collides with Alien
		for(Alien a: aliens.getList()) {
			if (0 < (ship.getX() - a.getX()) 
					&& (ship.getX() - a.getX()) < 75
					&& (ship.getY() - a.getY()) > 0
					&& (ship.getY() - a.getY()) < 50) {
				
				gameOver = true;				
			}	
		}
		if (gameOver) {
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(0, 0, 800, 600);
			graphToBack.setColor(Color.YELLOW);
			graphToBack.drawString("GAME OVER" , 350, 500);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE && bulletLock == false)
		{
			keys[4] = true;
			bulletLock = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
			bulletLock = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

