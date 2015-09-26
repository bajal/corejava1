
import java.applet.*;
import java.awt.*;

/* 
<applet code="SimpleImageLoad" width=600 height =408>
	<param name="img" value="LFCOLWI1.JPG">
</applet>
*/

public class SimpleImageLoad  extends Applet
{

	Image img;

	public void init(){
	 img = getImage(getDocumentBase(), getParameter("img"));
	}
	public void paint(Graphics g){
	g.drawImage(img,0,0,this);
	}
}
