
import java.applet.*;
import java.awt.*;

/* 
<applet code="SamplePaint" width=300 height =50>
</applet>
*/

public class SamplePaint  extends Applet {
	String msg;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg = "Initialise...";	
	}

	public void start(){
	msg += "Starting...";
	}

	public void paint(Graphics g){
	msg += "paint...";
	g.drawString(msg,10,30);
	showStatus("My first applet!");
	}
}
