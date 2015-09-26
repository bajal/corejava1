import java.applet.*;
import java.awt.*;

public class  SimpleApplet extends Applet
{
	public void paint(Graphics g) 
	{
		System.out.println("Hello World!");
		g.drawString("A simple applet",20,20);
	}
}
