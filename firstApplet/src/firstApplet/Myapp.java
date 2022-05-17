package firstApplet;
import java.applet.*;
import java.awt.*;

import org.omg.CORBA.portable.ValueOutputStream;

public class Myapp extends Applet {
	String Studentname;
	int age;
	
	
	public void init() {
		setBackground(Color.RED);
		String param=getParameter("Age");
		if(param==null) {
			age=0;
		}else {
			age=Integer.parseInt(param);
		}
		
		
	}
	
	public void paint(Graphics g) {
		
		g.drawString("age is"+age, 10,10);
		g.draw3DRect(100, 100, 20, 20, true);
		g.drawRect(100, 130, 30, 30);
		
		
		
		
	}

}

/* <applet code="Myapp" width="1000" height="1000">
 * <param name="Studentname" value="Princekumar">
 * <param name="Age" value="20">
 * </applet>*/
