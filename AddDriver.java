package Management_Class;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.*;

public class AddDriver extends JFrame implements  ActionListener{

	JComboBox c1,c2;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5;
	public AddDriver() {
		
		JLabel title=new JLabel("Add Driver");
		title.setBounds(150, 10, 150, 30);
		title.setFont(new Font(" ",Font.BOLD,20));
		add(title);
		
	JLabel name=new JLabel("Name");
	name.setBounds(60,50,100,30);
	name.setFont(new Font(" ",Font.PLAIN,15));
	add(name);
	
	t1=new JTextField();
	t1.setBounds(200, 50, 160, 30);
	add(t1);
	
	JLabel age=new JLabel("Age");
	age.setBounds(60, 90, 150, 30);
	age.setFont(new Font(" ",Font.PLAIN,15));
	add(age);
	

	t2=new JTextField();
	t2.setBounds(200, 95, 160, 30);
	add(t2);
	
JLabel gender=new JLabel("Gender");
gender.setBounds(60,130,100,30);
gender.setFont(new Font(" ",Font.PLAIN,15));
add( gender);

c1=new JComboBox(new String [] {"Male","Female"});
c1.setBounds(200, 130, 160, 30);
c1.setBackground(Color.white);
add(c1);

JLabel car=new JLabel("Car Company");
car.setBounds(60, 170, 150, 30);
car.setFont(new Font(" ",Font.PLAIN,15));
add(car);

t3=new JTextField();
t3.setBounds(200, 175, 160, 30);
add(t3);


JLabel model=new JLabel("Car Model");
model.setBounds(60,210,100,30);
model.setFont(new Font(" ",Font.PLAIN,15));
add(model);


t4=new JTextField();
t4.setBounds(200, 215, 160, 30);
add(t4);



JLabel available=new JLabel("Available");
available.setBounds(60, 250, 150, 30);
available.setFont(new Font(" ",Font.PLAIN,15));
add( available);

c2=new JComboBox(new String [] {"Available","Busy"});
c2.setBounds(200, 250, 160, 30);
c2.setBackground(Color.white);
add(c2);

JLabel location=new JLabel("Location");
location.setBounds(60,290,100,30);
location.setFont(new Font(" ",Font.PLAIN,15));
add(location);


t5=new JTextField();
t5.setBounds(200, 290, 160, 30);
add(t5);

b1=new JButton("Add Driver");
b1.setBackground(Color.black);
b1.setForeground(Color.white);
b1.setBounds(60, 350, 130, 30);
add(b1);

	
	
b1=new JButton("Add Driver");
b1.setBackground(Color.black);
b1.setForeground(Color.white);
b1.setBounds(60, 350, 130, 30);
b1.addActionListener(this);
add(b1);


b2=new JButton("Cancel");
b2.setBackground(Color.black);
b2.setForeground(Color.white);
b2.setBounds(220, 350, 130, 30);
b2.addActionListener(this);
add(b2);



	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("eleven.jpg"));
	Image i2=i1.getImage().getScaledInstance(500,350,Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel l1=new JLabel(i3);
	l1.setBounds(400, 20, 500, 400);
	add(l1);


getContentPane().setBackground(Color.white);
	setLayout(null);
	setBounds(220,200,920,450);
	setVisible(true);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String name=t1.getText();
			String age=t2.getText();
			String gender=(String)c1.getSelectedItem();
			String company=t3.getText();
			String brand=t4.getText();
			String available=(String) c2.getSelectedItem();
			String location=t5.getText();
			
			conn c=new conn();
			String str="insert into driver values ('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
				try
				{
					c.s.executeUpdate(str);
					JOptionPane.showMessageDialog(null, "New Room Added");
					this.setVisible(false);
				}
				catch(Exception e1)
				{
					
				}
				
		}
		else if(e.getSource()==b2)
		{
			this.setVisible(false);
		}
		
	}

	public static void main(String[] args) {
	new AddDriver().setVisible(true);

	}

	

}
