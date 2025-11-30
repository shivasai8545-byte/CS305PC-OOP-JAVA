import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9p2 extends JFrame{
	Label l;
	Lab9p2(){
		super("Table demo");
		String[] heading = {"Name" , "Course" , "RolNo"};
		
		String[][] data = {
				{"anu","CSE","D2"},
				{"manu","CSD","C2"},
				{"anu","ECE","P2"},
				{"ramya","CSO","D2"},
				};
		JTable jt = new JTable(data,heading);
		JScrollPane jsp = new JScrollPane(jt);
		add(jsp);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String...args){
		new Lab9p2();
	}
}
