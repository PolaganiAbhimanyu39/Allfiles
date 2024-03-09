import java.awt.*;
import java.awt.event.*;
class MyButtons extends Frame implements ActionListener
{
 MyButtons()
{
this.setLayout(null);

Button b1=new Button("Red");
Button b2=new Button("Green");
Button b3=new Button("Blue");

b1.setBounds(100,100,70,40);
b2.setBounds(100,160,70,40);
b3.setBounds(100,220,70,40);

this.add(b1);
this.add(b2);
this.add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

	addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent we)
	{
	System.exit(0);
	}
	});
}

public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("Red"))this.setBackground(Color.red);
if(str.equals("Green"))this.setBackground(Color.green);
if(str.equals("Blue"))this.setBackground(Color.blue);
}
public static void main(String args[])
{
MyButtons b=new MyButtons();
b.setSize(400,400);
b.setTitle("MyButtons");
b.setVisible(true);
}
}