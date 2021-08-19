package Management_Class;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.mysql.jdbc.ResultSet;

public class AddCustomer extends JFrame implements ActionListener{

		JTextField t1,t2,t3,t4,t6,t7,t5; JButton b1,b2;JComboBox c1;
		Choice c2;JRadioButton r1,r2;
	
	
	public AddCustomer() {
		
		JLabel l1=new JLabel("NEW CUSTOMER FORM");
		l1.setBounds(100,20,300,40);
		l1.setForeground(Color.BLUE);
		l1.setFont(new Font(" ",Font.BOLD,20));
		add(l1);
		
		JLabel l2=new JLabel("ID");
		l2.setBounds(35,80,300,40);
		add(l2);
		
		c1=new JComboBox(new String[]{"Passport","Voter-id Card","Driving License","Aadhar Card"});
		c1.setBounds(200, 90, 150, 25);
		add(c1);
		
		JLabel l3=new JLabel("Number");
		l3.setBounds(35,120,300,40);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(200, 130, 150, 25);
		add(t1);
		
		JLabel l4=new JLabel("Name");
		l4.setBounds(35,170,300,40);
		add(l4);
		t2=new JTextField();
		t2.setBounds(200, 170, 150, 25);
		add(t2);
		
		JLabel l5=new JLabel("Gender");
		l5.setBounds(35,220,300,40);
		add(l5);
		
		r1=new JRadioButton("Male");
		r1.setBounds(200, 220, 60, 20);
		r1.setBackground(Color.white);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setBounds(280, 220, 100, 20);
		r2.setBackground(Color.white);
		add(r2);
		
		JLabel l6=new JLabel("Country");
		l6.setBounds(35,260,300,40);
		add(l6);
		
		
		t3=new JTextField();
		t3.setBounds(200, 260, 150, 25);
		add(t3);
		
		
		JLabel l7=new JLabel("Allocated Room Number");
		l7.setBounds(35,300,300,40);
		add(l7);
		
		t4=new JTextField();
		t4.setBounds(200, 300, 150, 25);
		add(t4);
		
		
		c2=new Choice();
		try
		{
			conn c=new conn();
			String str="select * from room";
			ResultSet rs =(ResultSet) c.s.executeQuery(str);
		}
		catch(Exception e)
		{
			
		}
		
		JLabel l8=new JLabel("Checked in");
		l8.setBounds(35,350,300,40);
		add(l8);
		
		t5=new JTextField();
		t5.setBounds(200, 360, 150, 25);
		add(t5);
		
		JLabel l9=new JLabel("Depost");
		l9.setBounds(35,400,300,40);
		add(l9);
		
		t6=new JTextField();
		t6.setBounds(200, 400, 150, 25);
		add(t6);
		
		b1=new JButton("Add Customer");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(45, 450, 120, 30);
		b1.addActionListener(this);
		add(b1);
		
		
		b2=new JButton("Cancel");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(230, 450, 120, 30);
		b2.addActionListener(this);
		add(b2);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fifth.png"));
		Image i2=i1.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l=new JLabel(i3);
		l.setBounds(360, 90, 300, 300);
		add(l);

		getContentPane().setBackground(Color.white);
		
		
		setLayout(null);
		setBounds(200,30,690,540);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		
		String id=(String) c1.getSelectedItem();
		String number=t1.getText();
		String name=t2.getText();
		String gender=null;
		
		if(r1.isSelected()) {
			gender="Male";
		}
		else if(r2.isSelected())
		{
			gender="Female";
		}
		String country=t3.getText();
		String room=c2.getSelectedItem();
		String status=t4.getText();
		String deposit=t5.getText();
		
		
		String str="insert into customer values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+status+"','"+deposit+"')";;
		String str1="update room set available = 'Occupied where room ='"+room+"'";
		try
			{
				conn c= new conn();
				c.s.executeUpdate(str);
				c.s.executeUpdate(str1);
				JOptionPane.showMessageDialog(null, "New Customer Added");
				new Reception().setVisible(true);
				this.setVisible(false);
			}
			catch(Exception se)
			{
				
			}
	
	}else if(e.getSource()==b2)
	{
		new Reception().setVisible(true);
		this.setVisible(false);
	}
	}
	

	public static void main(String[] args) {
		new AddCustomer().setVisible(true);
	}

	

}
