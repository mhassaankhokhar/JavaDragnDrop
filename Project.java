import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
class Project{
	public static void main(String args[]){
		InsertTextField obj = new InsertTextField();
		InsertLabel o = new InsertLabel();
		InsertButton o2 = new InsertButton();
		int tfbounds[] = {100,10,150,50};
		int lbounds[] = {50,0,150,50};
		int bbounds[] = {70,20,150,50};
		JFrame mainframe = new JFrame("Main Frame");
		mainframe.setLayout(null);
		mainframe.setSize(600,550);
		mainframe.setDefaultCloseOperation(mainframe.EXIT_ON_CLOSE);
		JFrame f = new JFrame("Droping Frame");
		f.setLayout(null);
		f.setSize(400,450);
		f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
		JButton b1 = new JButton("Drop Label");
		JButton b2 = new JButton("Drop TextField");
		JButton b3 = new JButton("Drop Button");
		b1.setBounds(90,50,200,50);
		b2.setBounds(90,150,200,50);
		b3.setBounds(90,250,200,50);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		b1.addActionListener(new DropField(mainframe,o,lbounds));
		b2.addActionListener(new DropField(mainframe,obj,tfbounds));
		b3.addActionListener(new DropField(mainframe,o2,bbounds));
		f.setVisible(true);
		mainframe.setVisible(true);
	}
}
class DropField implements ActionListener{
	JFrame f; int bounds[];
	InsertTextField o;
	InsertLabel ob;
	InsertButton o2;
	DropField()
	{

	}
	DropField(JFrame f, InsertTextField o, int bounds[])
	{
		this.f = f;
		this.o = o;
		this.bounds = bounds;
	}
	DropField(JFrame f, InsertLabel ob, int bounds[])
	{
		this.f = f;
		this.ob = ob;
		this.bounds = bounds;
	}
	DropField(JFrame f, InsertButton o2, int bounds[])
	{
		this.f = f;
		this.o2 = o2;
		this.bounds = bounds;
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton jbth = (JButton)e.getSource();
		String a = jbth.getText();
		if(a.equals("Drop TextField"))
		{
			o.insert(f,bounds);
		}
		else if(a.equals("Drop Label"))
		{
			labelWindows();
		}
		else
		{
			buttonWindows();
		}
	}
	void labelWindows()
	{
		JFrame frame = new JFrame("Label Details");
		frame.setLayout(null);
		frame.setSize(380,200);
		frame.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
		JLabel l1 = new JLabel("Enter Label Value");
		JTextField t1 = new JTextField("");
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("Cancel");
		l1.setBounds(20,10,100,100);
		t1.setBounds(22,70,320,20);
		ok.setBounds(160,100,80,30);
		cancel.setBounds(262,100,80,30);
		ok.addActionListener(new InsertLabel(this.f,ob,bounds,t1));
		cancel.addActionListener(new InsertLabel(frame));
		frame.add(l1);
		frame.add(t1);
		frame.add(ok);
		frame.add(cancel);
		frame.setVisible(true);
	}
	void buttonWindows()
	{
		JFrame frame = new JFrame("Button Details");
		frame.setLayout(null);
		frame.setSize(380,200);
		frame.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
		JLabel l1 = new JLabel("Enter Label Value");
		JTextField t1 = new JTextField("");
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("Cancel");
		l1.setBounds(20,10,100,100);
		t1.setBounds(22,70,320,20);
		ok.setBounds(160,100,80,30);
		cancel.setBounds(262,100,80,30);
		ok.addActionListener(new InsertButton(this.f,o2,bounds,t1));
		cancel.addActionListener(new InsertButton(frame));
		frame.add(l1);
		frame.add(t1);
		frame.add(ok);
		frame.add(cancel);
		frame.setVisible(true);	
	}
}
class TextField{
	JTextField textfield;
	TextField next;
	TextField()
	{
		textfield = new JTextField("0");
		next = null;
	}
}
class InsertTextField{
	TextField head;
	InsertTextField()
	{
		head=null;
	}
	void insert(JFrame f, int tfbounds[])
	{
		TextField ne = new TextField();
		if(head==null)
		{
			ne.textfield.setBounds(tfbounds[0],tfbounds[1],tfbounds[2],tfbounds[3]);
			f.add(ne.textfield);
			head=ne;
			f.setVisible(true);
			System.out.println("Comming");
		}
		else
		{
			TextField cur=head,tc=null;
			while(cur!=null)
			{
				tc=cur;
				cur=cur.next;
			}
			ne.textfield.setBounds(tfbounds[0],tfbounds[1]+=60,tfbounds[2],tfbounds[3]);
			f.add(ne.textfield);
			tc.next=ne;
			f.setVisible(true);
			System.out.println("comming here too");
		}
	}
}
class Label{
	JLabel label;
	Label next;
	Label()
	{
		label = new JLabel();
		next = null;
	}
}
class InsertLabel implements ActionListener{
	Label head;
	JFrame f; int bounds[];
	InsertLabel o;
	JTextField t;
	InsertLabel()
	{
		head = null;
	}
	InsertLabel(JFrame f)
	{
		this.f=f;
	}
	InsertLabel(JFrame f, InsertLabel o, int bounds[],JTextField t)
	{
		this.f=f;
		this.o=o;
		this.t=t;
		this.bounds=bounds;
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton jbtn =(JButton)ae.getSource();
		String s = jbtn.getText();
		if(s.equals("OK"))
		{
			String a=t.getText();
			o.insert(f,o,bounds,a);
		}
		else
		{
			f.dispose();
		}
	}
	void insert(JFrame f, InsertLabel o, int bounds[],String x)
	{
		Label ne = new Label();
		ne.label.setText(x);
		if(head==null)
		{
			System.out.println(ne.label.getText());
			ne.label.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
			f.add(ne.label);
			head=ne;
			f.setVisible(true);
			System.out.println("Comming");
		}
		else
		{
			Label cur=head,tc=null;
			while(cur!=null)
			{
				tc=cur;
				cur=cur.next;
			}
			ne.label.setBounds(bounds[0],bounds[1]+=60,bounds[2],bounds[3]);
			f.add(ne.label);
			tc.next=ne;
			f.setVisible(true);
			System.out.println("comming here too");
		}
	}
}
class Button{
	JButton jbtn;
	Button next;
	Button()
	{
		jbtn = new JButton();
		next = null;
	}
}
class InsertButton implements ActionListener{
	Button head;
	JFrame f; int bounds[];
	InsertButton o;
	JTextField t;
	InsertButton()
	{
		head = null;
	}
	InsertButton(JFrame f)
	{
		this.f=f;
	}
	InsertButton(JFrame f, InsertButton o, int bounds[],JTextField t)
	{
		this.f=f;
		this.o=o;
		this.t=t;
		this.bounds=bounds;
	}
	public void actionPerformed(ActionEvent ae)
	{
		try{
			JButton jbtn =(JButton)ae.getSource();
		String s = jbtn.getText();
		if(s.equals("OK"))
		{
			String a=t.getText();
			o.insert(f,o,bounds,a);
		}
		else
		{
			f.dispose();
		}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
	void insert(JFrame f, InsertButton o, int bounds[],String x)
	{
		Button ne = new Button();
		ne.jbtn.setText(x);
		if(head==null)
		{
			System.out.println(ne.jbtn.getText());
			ne.jbtn.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
			f.add(ne.jbtn);
			head=ne;
			f.setVisible(true);
			System.out.println("Comming");
		}
		else
		{
			Button cur=head,tc=null;
			while(cur!=null)
			{
				tc=cur;
				cur=cur.next;
			}
			ne.jbtn.setBounds(bounds[0],bounds[1]+=60,bounds[2],bounds[3]);
			f.add(ne.jbtn);
			tc.next=ne;
			f.setVisible(true);
			System.out.println("comming here too");
		}
	}
}
