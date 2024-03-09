import java.awt.*;
import java.awt.event.*;
public class Calc extends Frame implements ActionListener,WindowListener
{
	int option,num1;
	String s1,s2,s3,s4,s5;
	Button a,b,c,d,e,f,g,h,i,j,add,sub,mul,div,mod,equal,clear;
	Panel p1,p2;
	TextField t;
	Calc()
	{
		p1=new Panel();
		p2=new Panel();
		a=new Button("1");
		b=new Button("2");
		c=new Button("3");
		d=new Button("4");
		e=new Button("5");
		f=new Button("6");
		g=new Button("7");
		h=new Button("8");
		i=new Button("9");
		j=new Button("0");
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		mod=new Button("%");
equal=new Button("=");
		clear=new Button("C");
		t=new TextField(10);
		p1.add(t);
		p2.add(g);
		p2.add(h);
		p2.add(i);
		p2.add(div);
		p2.add(d);
		p2.add(e);
		p2.add(f);
		p2.add(mul);
		p2.add(a);
		p2.add(b);
		p2.add(c);
		p2.add(sub);
		p2.add(add);
		p2.add(mod);
		p2.add(equal);
		p2.add(j);
		p2.add(clear);
		p2.setLayout(new GridLayout(5, 4));
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
h.addActionListener(this);
		i.addActionListener(this);
		j.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);
		addWindowListener(this);
	}
	public static void main(String ar[])
	{
		Calc cl=new Calc();
		cl.setSize(300,300);
		cl.setTitle("Calculator");
		cl.setVisible(true);
	}
	public void windowOpened(WindowEvent e)
	{
	}
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) 
	{
	}
	public void windowIconified(WindowEvent e) 
	{
	}
	public void windowDeiconified(WindowEvent e) 
{	
	}
	public void windowActivated(WindowEvent e) 
	{	
	}
	public void windowDeactivated(WindowEvent e) 
	{	
	}
	public void actionPerformed(ActionEvent ae) 
	{
			if(ae.getSource()==a)
			{
				s3=t.getText();
				s4="1";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==b)
			{
				s3=t.getText();
				s4="2";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==c)
			{
				s3=t.getText();
				s4="3";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==d)
			{
				s3=t.getText();
				s4="4";
				s5=s3+s4;
				t.setText(s5);
}
			if(ae.getSource()==e)
			{
				s3=t.getText();
				s4="5";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==f)
			{
				s3=t.getText();
				s4="6";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==g)
			{
				s3=t.getText();
				s4="7";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==h)
			{
				s3=t.getText();
				s4="8";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==i)
			{
s3=t.getText();
				s4="9";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==j)
			{
				s3=t.getText();
				s4="0";
				s5=s3+s4;
				t.setText(s5);
			}
			if(ae.getSource()==add)
			{
				s1=t.getText();
				t.setText("");
				option=1;
			}
			if(ae.getSource()==sub)
			{
				s1=t.getText();
				t.setText("");
				option=2;
			}
			if(ae.getSource()==mul)
			{
				s1=t.getText();
				t.setText("");
				option=3;
			}
			if(ae.getSource()==div)
{
				s1=t.getText();
				t.setText("");
				option=4;
			}
			if(ae.getSource()==mod)
			{
				s1=t.getText();
				t.setText("");
				option=5;
			}
			if(ae.getSource()==equal)
			{
				s2=t.getText();
				if(option==1)
				{
				num1=(Integer.parseInt(s1))+(Integer.parseInt(s2));
				t.setText(String.valueOf(num1));
				}
				else if(option==2)
				{
				num1=(Integer.parseInt(s1))-(Integer.parseInt(s2));
				t.setText(String.valueOf(num1));
				}
				else if(option==3)
				{
				num1=(Integer.parseInt(s1))*(Integer.parseInt(s2));
				t.setText(String.valueOf(num1));
				}
				else if(option==4)
				{
					try
					{
					num1=(Integer.parseInt(s1))/(Integer.parseInt(s2));
t.setText(String.valueOf(num1));
					}
					catch(Exception e)
					{
					t.setText("error");
					}
				}
				else if(option==5)
				{
				num1=(Integer.parseInt(s1))%(Integer.parseInt(s2));
				t.setText(String.valueOf(num1));
				}
			}
			if(ae.getSource()==clear)
			{
				t.setText("");
			}
			
	}
	
}

