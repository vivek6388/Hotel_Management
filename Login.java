package Management_Class;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
JLabel l1,l2;
JTextField t1,t2;
JButton b1,b2;

Login()
{
	l1=new JLabel("Username");
	l1.setBounds(40, 20, 100, 30);
	add(l1);
	
	
	
	l2=new JLabel("Password");
	l2.setBounds(40,70,100,30);
	add(l2);
	
	t1=new JTextField();
	t1.setBounds(150, 20, 180, 30);
	add(t1);
	
	
	t2=new JTextField();
	t2.setBounds(150, 70, 180, 30);
	add(t2);
	
	b1=new JButton("Login");
	b1.setBackground(Color.black);
	b1.setForeground(Color.white);
	b1.setBounds(40, 130, 110, 30);
	b1.addActionListener(this);
	add(b1);
	
	
	b2=new JButton("Cancel");
	b2.setBackground(Color.black);
	b2.setForeground(Color.white);
	b2.setBounds(180, 130, 120, 30);
	b2.addActionListener(this);
	add(b2);
	
	

	
	
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("second.jpg"));
	Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel l3=new JLabel(i3);
	l3.setBounds(350, 10, 200, 200);
	add(l3);
	
	getContentPane().setBackground(Color.white);
	
	setLayout(null);
	setBounds(500,100,600,400);
	setVisible(true);
}



public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		String username=t1.getText();
		String password=t2.getText();
		conn con=new conn();
		String str="select * fromg login where username = '"+username+"'and password = '"+password+"'";
		try
		{
		ResultSet res=con.s.executeQuery(str);
	if(res.next())
	{
		new Dashboard().setVisible(true);
		this.setVisible(false);
	}
	else 
	{
		JOptionPane.showMessageDialog(null, "Ivalid  username and parrword");
		this.setVisible(false);
	}
		
		
		
		}
		catch(Exception e1)
		{
			
		}
	}
	else if(e.getSource()==b2)
	{
		System.exit(0);
	}
}
public static void main(String [] a)
{
	new Login();
}
}
