import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Change{
	public static void main(String args[])
	{
		JFrame f = new JFrame("Editing");
		f.setLayout(null);
		f.setSize(580,600);
		f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
		JLabel l1 = new JLabel("Position");
		JLabel lx = new JLabel("X-axis");
		JLabel ly = new JLabel("Y-axis");
		JLabel l2 = new JLabel("Size");
		JLabel lle = new JLabel("Length");
		JLabel lwi = new JLabel("Width");
		JLabel lb1 = new JLabel("Change Position");
		JLabel lb2 = new JLabel("Change Size");
		JLabel l3 = new JLabel("Movement Ratio");
		JLabel l4 = new JLabel("Set Value");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JTextField t4 = new JTextField();
		JTextField t5 = new JTextField();
		JTextField t6 = new JTextField();
		JButton b1 = new JButton("MoveUp");
		JButton b2 = new JButton("MoveDn");
		JButton b3 = new JButton("Left");
		JButton b4 = new JButton("Right");
		JButton b5 = new JButton("Incheight");
		JButton b6 = new JButton("Decheight");
		JButton b7 = new JButton("IncWidth");
		JButton b8 = new JButton("DecWidth");
		JButton set = new JButton("Set Bounds");
		JButton done = new JButton("Done");
		l1.setBounds(130,15,60,50);
		lx.setBounds(40,50,100,50);
		t1.setBounds(80,50,150,50);
		lle.setBounds(305,50,100,50);
		t2.setBounds(350,50,150,50);
		ly.setBounds(40,110,100,50);
		l2.setBounds(400,15,60,50);
		t3.setBounds(80,110,150,50);
		lwi.setBounds(310,110,150,50);
		t4.setBounds(350,110,150,50);
		set.setBounds(80,170,420,50);
		f.add(l1);
		f.add(l2);
		f.add(lx);
		f.add(ly);
		f.add(lle);
		f.add(lwi);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(set);
		lb1.setBounds(70,260,100,50);
		b1.setBounds(70,300,90,30);
		b3.setBounds(10,335,90,30);
		b4.setBounds(130,335,90,30);
		b2.setBounds(70,370,90,30);
		lb2.setBounds(410,260,100,50);
		b5.setBounds(400,300,90,30);
		b7.setBounds(340,335,90,30);
		b8.setBounds(460,335,90,30);
		b6.setBounds(400,370,90,30);
		l3.setBounds(70,390,100,50);
		l4.setBounds(410,390,100,50);
		t5.setBounds(10,425,215,50);
		t6.setBounds(340,425,215,50);
		done.setBounds(80,480,400,50);
		// b1.addActionListener(new EventHandler(mainf,tx,arr));
		// b2.addActionListener(new EventHandler(mainf,tx,arr));
		// b3.addActionListener(new EventHandler(mainf,tx,arr));
		// b4.addActionListener(new EventHandler(mainf,tx,arr));
		f.add(lb1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(lb2);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(l3);
		f.add(l4);
		f.add(t5);
		f.add(t6);
		f.add(done);
		f.setVisible(true);
	}
}