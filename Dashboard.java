package Management_Class;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dashboard  extends JFrame implements ActionListener{
	
	JMenuBar mb;JMenu m1,m2;JMenuItem i1,i2,i3,i4;

	public Dashboard() {
		mb=new JMenuBar();
		add(mb);
		m1=new JMenu("HOTEL MANAGEMENT");
		m1.setForeground(Color.red);
		mb.add(m1);
		m2=new JMenu("ADMIN");
		m2.setForeground(Color.blue);
		mb.add(m2);
		
		i1=new JMenuItem("RECEPTION");
		i1.addActionListener( this);
		m1.add(i1);
		i2=new JMenuItem("ADD EMPLOYEE");
		i2.addActionListener( this);
		m2.add(i2);
		i3=new JMenuItem("ADD ROOMS");
		i3.addActionListener(this);
		m2.add(i3);
		i4=new JMenuItem("ADD DRIVERS");
		i4.addActionListener(this);
		m2.add(i4);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("third.jpg"));
		Image i2=i1.getImage().getScaledInstance(1280, 1000, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(0, 0, 1280, 680);
		add(l1);
		
		JLabel l2=new JLabel("The TAJ GROUP WELCOME YOU");
		l2.setBounds(400, 10, 600, 200);
		l2.setForeground(Color.white);
		l2.setFont(new Font(" ",Font.BOLD,30));
		l1.add(l2);
		
		setLayout(null);
		setBounds(0,0,1280,680);
		setVisible(true);
		mb.setBounds(0,0, 1280, 30);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand().equals("RECEPTION"))
	{
		new Reception().setVisible(true);
	}
	else if(e.getActionCommand().equals("ADD EMPLOYEE"))
		
	{
		new AddEmployee().setVisible(true);
	}
	else if(e.getActionCommand().equals("ADD ROOMS"))
	{
	new AddRoom().setVisible(true);	
	}
	else if(e.getActionCommand().equals("ADD DRIVERS"))
	{
		new AddDriver().setVisible(true);
	}
		
	}

	public static void main(String[] args) {
		new Dashboard().setVisible(true);

	}

	

}
