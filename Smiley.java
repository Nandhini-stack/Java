/*
Aim:Write an applet to display a smiley face. Also display a welcome message by passing parameters to the applet.
*/

import java.applet.Applet;
import java.awt.*;

public class Smiley extends Applet
{
	String s;
	public void init()
	{
		s = getParameter ("a");
		if(s == null)
		{
			s = "User";
		}
		
		
		s = "Welcome " + s + " !!!";
		
	}
	
	public void paint (Graphics g)
	{
		g.drawString(s,30,30);
		g.setColor(Color.yellow);
		g.fillOval(100,100,380,380);
		g.setColor(Color.black);
		g.fillOval(170,130,90,180);
		g.setColor(Color.white);
		g.fillOval(190,220,60,60);
		g.setColor(Color.black);
		g.fillOval(320,130,90,180);
		g.setColor(Color.white);
		g.fillOval(340,220,60,60);
		g.setColor(Color.red);		
		g.fillArc(250,390,90,25,180,180);
	}
}


/*
<applet code = "Smiley.class"
width = 600
height = 600>

<param name = "a" value = "ABC">
</param>

</applet>
*/
