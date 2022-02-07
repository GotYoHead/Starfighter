//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,10,10,3);
	}

	public Ammo(int x, int y)
	{
		this(x,y,10,10,3);
	}

	public Ammo(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed = s;
	}

	public void setSpeed(int s)
	{
		speed = s;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}


	public void move( String direction )
	{
		//add code to move the ammo UP or DOWN
		//	if(direction.equals("______"))
		//		Call setX/Y like we have done before
		
		if(direction.equals("UP"))
		{
			setY(getY()-speed);
		}
		if(direction.equals("DOWN"))
		{
			setY(getY()+speed);
		}
	}

	public String toString()
	{
		return "";
	}
}
