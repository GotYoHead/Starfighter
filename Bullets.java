//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets 
{
	
	protected Image image;
	
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
		
		for(int i = 0; i < 30; i++)
		{
			ammo.add(new Ammo(-10,-10));
		}
		
	}

	public void add(Ammo al)
	{
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
	}

	public void moveEmAll()
	{
	}

	public void cleanEmUp()
	{
		// If any of the Ammos go off the top of the screen, remove them

	}

	public List<Ammo> getList()
	{
		return null;
	}

	public String toString()
	{
		return "";
	}

	

}
