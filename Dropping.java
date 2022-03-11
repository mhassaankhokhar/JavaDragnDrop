import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Dropping{
	public static void main(String[] args){
		JFrame f = new JFrame("Main Page");
		f.setLayout(null);
		f.setSize(400,450);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		JButton b1 = new JButton("Drop TextField");
		b1.setBounds(90,50,200,50);
		f.add(b1);
		f.setVisible(true);
	}
}