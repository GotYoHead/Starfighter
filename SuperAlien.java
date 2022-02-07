import java.awt.Graphics;
import java.net.URL;

import javax.imageio.ImageIO;

public class SuperAlien extends Alien {

	public Ammo a;
	
	public SuperAlien(int x, int y, int s)
	{
		super(x,y, 70,70,s);
		a = new Ammo(getX() + getWidth()/2,getY()+getHeight()/2);
		try
		{
			URL url = getClass().getResource("yoshi.png");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("File not found");

		}
		
	}
	public void shoot(Graphics w)
	{
		if(a.getY()>StarFighter.HEIGHT)
			a = new Ammo(getX() + getWidth()/2,getY()+getHeight()/2);
		a.draw(w);
		a.move("DOWN");
	}
}

