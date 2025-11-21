import java.awt.*;
import java.awt.event.*;

class Lab8p1 extends Frame{
	Lab8p1(){
	
	super("Demonstration of MenuBar");
	MenuBar mb = new MenuBar();
	setMenuBar (mb);
	
	mb.add(new Menu("File"));
	mb.add(new Menu("Edit"));
	mb.add(new Menu("Help"));
	
	
	setSize(400,400);
	setVisible(true);

	addWindowListener(
	new WindowAdapter(){
		public void windowClosing(WindowEvent we)
		{
			dispose();
		}	
	});

    
}

public static void main(String...args)
{
	new Lab8p1();
}
}
