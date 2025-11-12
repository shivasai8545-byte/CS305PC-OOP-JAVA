import java.awt.*;
import java.awt.event.*;
class Lab7P1{
	public static void main(String...args){
		final int[] a = {1};
		Frame f = new Frame();
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   	
		TextField tf = new TextField();
		tf.setColumns(30);
		Button b = new Button();
		b.setLabel("Click");
		b.setSize(100,30);
		Label l = new Label();
		l.setPreferredSize(new Dimension(100,200));
		f.setSize(400,500);
		b.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					System.out.println("Hello");
					l.setText(tf.getText()+"-"+a[0]);
					a[0]++;
				}
		});
		
		

		f.add(tf);
		f.add(b);
		f.add(l);
		
		
		f.setSize(400,500);
		f.setVisible(true);
		
	}
}
		
