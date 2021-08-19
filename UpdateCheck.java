package Management_Class;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
public class UpdateCheck extends JFrame implements ActionListener{

			JButton b1,b2,b3;Choice c1;JTextField t1,t2,t3,t4,t5;
	public UpdateCheck() {
		
		JLabel l1=new JLabel("Check in Details");
		l1.setFont(new Font(" ",Font.PLAIN,20));
		l1.setForeground(Color.BLUE);
		l1.setBounds(100,30,200,30);
		add(l1);
		
		JLabel l2=new JLabel("Customer Id");
		l2.setBounds(20,100,100,30);
		add(l2);
		
		
		
		c1=new Choice();
		try
		{
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("select * from customer");
			while(rs.next())
			{
				c1.add(rs.getString("number"));
			}
		}
		catch(Exception e)
		{
			c1.setBounds(200, 100, 280, 30);
			add(c1);
		}
		
		JLabel l3=new JLabel("Room Number");
		
		l3.setBounds(20,140,200,30);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(200, 140, 180, 25);
		add(t1);
		
		JLabel l4=new JLabel("Name");
		l4.setBounds(20,180,180,30);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(200, 180, 180, 25);
		add(t2);
		
		
		JLabel l5=new JLabel("Check In");
		
		l5.setBounds(20,220,180,30);
		add(l5);
		
		t3=new JTextField();
		t3.setBounds(200, 220, 180, 25);
		add(t3);
		
		JLabel l6=new JLabel("Amount Paid");
		l6.setBounds(20,260,180,30);
		add(l6);
		
		t4=new JTextField();
		t4.setBounds(200, 260, 180, 25);
		add(t4);
		
		JLabel l7=new JLabel("Pending Amount");
		
		l7.setBounds(20,300,180,30);
		add(l7);
		t5=new JTextField();
		t5.setBounds(200, 300, 180, 25);
		add(t5);
		
		
		b1=new JButton("Check");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(150, 350, 120, 30);
		b1.addActionListener(this);
		add(b1);
		
		
		b2=new JButton("Update");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(20, 400, 110, 30);
		b2.addActionListener(this);
		add(b2);
		
		
		
		b3=new JButton("Back");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
	
		b3.setBounds(290, 400, 110, 30);
		b3.addActionListener(this);
		add(b3);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("nine.jpg"));
		JLabel l9=new JLabel(i1);
		l9.setBounds(380, 60, 500, 330);
		add(l9);
	
		getContentPane().setBackground(Color.white);
		
		
		setLayout(null);
		setBounds(100,70,900,500);
		setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			try
			{
				String room=null;
				String deposit=null;
				int amountPaid;
				String price=null;
				conn c=new conn();
				String id=c1.getSelectedItem();
				String str="select * from customer where number = '"+id+"'";
				ResultSet rs=c.s.executeQuery(str);
				while(rs.next())
				{
				t1.setText(rs.getString("room"));
				t2.setText(rs.getString("name"));
				t3.setText(rs.getString("status"));
				t4.setText(rs.getString("deposit"));
				room=rs.getString("room");
				deposit=rs.getString("deposit");
				
				}
				ResultSet rs2=c.s.executeQuery("select * from where room='"+room+"'");
				while(rs2.next())
				{
					price=rs2.getString("price");
					amountPaid=Integer.parseInt(price) -Integer.parseInt(deposit);
					t5.setText(Integer.toString(amountPaid));
				}
			}
			catch(Exception e)
			{
				
			}
			
		}
		else if(ae.getSource()==b2)
		{
			
		}
		else if(ae.getSource()==b3)
		{
			new Reception().setVisible(true);
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new UpdateCheck().setVisible(true);
	}

	
	

}
