import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class FastAlien {
	private List<Alien> aliens;

	public FastAlien()
	{
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}
	
	public List<Alien> getList(){
		return aliens;
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien a: aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Alien a: aliens) {
			int rand = (int)(Math.random() * 4);
			if(rand == 0) {
				a.setY(a.getY() + 5);
			}
			if(rand == 1) {
				a.setY(a.getY() - 5);
			}
			if(rand == 2) {
				a.setX(a.getX() + 5);
			}
			if(rand == 3) {
				a.setX(a.getX() - 5);
			}
			a.setX(a.getX() + a.getSpeed());
			if((a.getX() < 10 && a.getY() > 60)|| a.getX() > 700 || a.getY() < 10) {
				a.setSpeed(a.getSpeed() * -1);
			}
			
		}
	}

	public void removeDeadOnes(Bullets shots)
	{
		for(Alien a: aliens) {
			for(Ammo b: shots.getList()) {
				if (0 < (b.getX() - a.getX()) 
						&& (b.getX() - a.getX()) < 30
						&& (b.getY() - a.getY()) > 0
						&& (b.getY() - a.getY()) < 30) {
					shots.getList().remove(b);
					aliens.remove(a);
				}
				
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
