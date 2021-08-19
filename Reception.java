package Management_Class;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.*;

public class Reception extends JFrame implements ActionListener{

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	public Reception() {
		b1=new JButton("New Customer Form");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(10,30,190,30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Room");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(10,70,190,30);
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Department");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(10,110,190,30);
		b3.addActionListener(this);
		add(b3);
		
		b4=new JButton("All Employee Info");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(10,150,190,30);
		b4.addActionListener(this);
		add(b4);
		
		b5=new JButton("Customer Info");
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.setBounds(10,190,190,30);
		b5.addActionListener(this);
		add(b5);
		
		b6=new JButton("Manager Info");
		b6.setBackground(Color.black);
		b6.setForeground(Color.white);
		b6.setBounds(10,230,190,30);
		b6.addActionListener(this);
		add(b6);
		
		b7=new JButton("Check Out");
		b7.setBackground(Color.black);
		b7.setForeground(Color.white);
		b7.setBounds(10,270,190,30);
		b7.addActionListener(this);
		add(b7);
		
		b8=new JButton("Update Check Status");
		b8.setBackground(Color.black);
		b8.setForeground(Color.white);
		b8.setBounds(10,310,190,30);
		b8.addActionListener(this);
		add(b8);
		
		b9=new JButton("Update Room Status");
		b9.setBackground(Color.black);
		b9.setForeground(Color.white);
		b9.setBounds(10,350,190,30);
		b9.addActionListener(this);
		add(b9);
		
		
		b10=new JButton("Pick Up Service");
		b10.setBackground(Color.black);
		b10.setForeground(Color.white);
		b10.setBounds(10,390,190,30);
		b10.addActionListener(this);
		add(b10);
		
		
		b11=new JButton("Search Room");
		b11.setBackground(Color.black);
		b11.setForeground(Color.white);
		b11.setBounds(10,430,190,30);
		b11.addActionListener(this);
		add(b11);
		
		
		b12=new JButton("Logout");
		b12.setBackground(Color.black);
		b12.setForeground(Color.white);
		b12.setBounds(10,470,190,30);
		b12.addActionListener(this);
		add(b12);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fourth.jpg"));
		JLabel l1=new JLabel(i1);
		l1.setBounds(250, 30, 500, 450);
		add(l1);
		
		getContentPane().setBackground(Color.white);
	
		setLayout(null);
		setBounds(220,130,780,540);
		setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			new AddCustomer().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b2)
		{
			new Room().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b3)
		{
			new Department().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b4)
		{
			new EmployeeInfo().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b5)
		{
			new CustomerInfo().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b6)
		{
			new ManagerInfo().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b7)
		{
			new CheckOut().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b8)
		{
			new UpdateCheck().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b9)
		{
			new UpdateRoom().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b10)
		{
			new PickUp().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b11)
		{
			new SearchRoom().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b12)
		{
			setVisible(false);
		}
		
	}
	public static void main(String[] args) {
		new Reception().setVisible(true);
		

	}

	

}
