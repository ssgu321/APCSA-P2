//© A+ Computer Science  -  www.apluscompsci.com
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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore;
	private int leftScore;
	private boolean gameOver;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(300,90,10,10, Color.BLACK, 1, 2);
		leftPaddle = new Paddle(30, 300, 10, 80, Color.RED, 5);
		rightPaddle = new Paddle(740, 300, 10, 80, Color.GREEN, 5);
		keys = new boolean[4];
		rightScore = 0;
		leftScore = 0;
		gameOver = false;
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.drawString("Leftscore: " + Integer.toString(leftScore), 400, 450);
		graphToBack.drawString("Rightscore: " + Integer.toString(rightScore), 400, 500);

		//see if ball hits left wall or right wall
		if (ball.didCollideLeft(null)) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Leftscore: " + Integer.toString(leftScore), 400, 450);
			graphToBack.drawString("Rightscore: " + Integer.toString(rightScore), 400, 500);
			graphToBack.setColor(Color.BLACK);
			rightScore++;
			graphToBack.drawString("Leftscore: " + Integer.toString(leftScore), 400, 450);
			graphToBack.drawString("Rightscore: " + Integer.toString(rightScore), 400, 500);
			gameOver = true;
			
			
		}
		if (ball.didCollideRight(null)) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Leftscore: " + Integer.toString(leftScore), 400, 450);
			graphToBack.drawString("Rightscore: " + Integer.toString(rightScore), 400, 500);
			graphToBack.setColor(Color.BLACK);
			leftScore++;
			graphToBack.drawString("Leftscore: " + Integer.toString(leftScore), 400, 450);
			graphToBack.drawString("Rightscore: " + Integer.toString(rightScore), 400, 500);
			gameOver = true;
			
		}
		
		//see if the ball hits the top or bottom wall 
		if (ball.didCollideBottom(null) || ball.didCollideTop(null)) {
			ball.setXSpeed(ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if the ball hits the left paddle
		if(ball.getX()>leftPaddle.getX() && ball.getX() < leftPaddle.getX()+leftPaddle.getWidth()){
			if(ball.getY()>leftPaddle.getY() && ball.getY() < leftPaddle.getY()+leftPaddle.getHeight()){
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());
				
			}
		}
					
		//see if the ball hits the right paddle
		if(ball.getX() == rightPaddle.getX() ){
			if(ball.getY()>rightPaddle.getY() && ball.getY() < rightPaddle.getY()+rightPaddle.getHeight()){
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());
			}
		}
		
		if(gameOver) {
			gameOver = false;
			ball = new Ball(300,90,10,10, Color.BLACK, 1, 2);
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}