import java.awt.*;
import java.awt.event.*;

class Lab8p2 extends Frame implements ActionListener{
	Label l;
	Lab8p2(){
	
	super("Demonstration of MenuBar");
	MenuBar mb = new MenuBar();
	BorderLayout bl = new BorderLayout();
	setMenuBar (mb);
	setLayout(bl);
	
	l = new Label();
	l.setFont(new Font("Arial",Font.BOLD,40));
	l.setAlignment(l.CENTER);
	//l.setBounds(200,100,200,100);
	add(l,bl.CENTER);
	
	Menu file = new Menu();
	String[] menus = {"File","Edit","Help"};
	String[][]mi ={
		 {"Open", "Save","Close"},
		 {"cut","copy","paste"},
		 {"about","update","license"}
	};
	int x=0,y=0;
	for(String s : menus){
		y=0;
		Menu m = new Menu(s);
		for(int i =0;i<3;i++){
			MenuItem mmi = new MenuItem(mi[x][y]);
			mmi.addActionListener(this);
			m.add(mmi);
			y++;
		}
		x++;
		mb.add(m);
	} 
	
	
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
	public void actionPerformed(ActionEvent ae){
		String mstr = ae.getActionCommand();
		if(mstr.equals("Close")){
			System.exit(0);
		}
		else {
			l.setText(mstr);
			
	}
}		

public static void main(String...args)
{
	new Lab8p2();
}
}
