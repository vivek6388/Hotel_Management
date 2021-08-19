package Management_Class;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddRoom extends JFrame implements ActionListener {

	JTextField t1,t2;JComboBox c1,c2,c3;JButton b1,b2;
	public AddRoom() {
		
		JLabel l1=new JLabel("Add Rooms");
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
		l1.setBounds(150, 20, 200, 50);
		add(l1);
		
		JLabel room=new JLabel("Room Number");
		room.setFont(new Font(" ",Font.BOLD,15));
		room.setBounds(60, 80, 120, 50);
		add(room);
		
		t1=new JTextField();
		t1.setBounds(200, 90, 180, 30);
		add(t1);
		
		JLabel availabel=new JLabel("Available");
		availabel.setFont(new Font(" ",Font.BOLD,15));
		availabel.setBounds(60, 140, 120, 50);
		add(availabel);
		
		c1=new JComboBox(new String [] {"Available","Occupied"});
		c1.setBounds(200, 140, 180, 40);
		c1.setBackground(Color.white);
		add(c1);

		JLabel cleaning=new JLabel("Cleaning status");
		cleaning.setFont(new Font(" ",Font.BOLD,15));
		cleaning.setBounds(60, 200, 120, 35);
		add(cleaning);
		
		c2=new JComboBox(new String [] {"Cleaned","Dirty"});
		c2.setBounds(200, 200, 180, 40);
		c2.setBackground(Color.white);
		add(c2);
		
		JLabel price=new JLabel("Price");
		price.setFont(new Font(" ",Font.BOLD,15));
		price.setBounds(60, 230, 120, 50);
		add(price);
		
		t2=new JTextField();
		t2.setBounds(200, 250, 180, 30);
		add(t2);
		
		

		JLabel type=new JLabel("Bed Type");
		type.setFont(new Font(" ",Font.BOLD,15));
		type.setBounds(60, 300, 120, 50);
		add(type);
		
		c3=new JComboBox(new String [] {"Single Bed","Double Bed"});
		c3.setBounds(200, 300, 180, 40);
		c3.setBackground(Color.white);
		add(c3);
		
		b1=new JButton("Add Room");
		b1.setBounds(60, 380, 130, 30);
		b1.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
		
		b2=new JButton("Cancel");
		b2.setBounds(200, 380, 130, 30);
		b2.addActionListener(this);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		add(b2);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("seventh.jpg"));
		JLabel l5=new JLabel(i1);
		l5.setBounds(400, 50, 500, 350);
		add(l5);
		
		
		
		getContentPane().setBackground(Color.white);
		
		setBounds(200,200,940,480);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String room=t1.getText();
			String available=(String)c1.getSelectedItem();
			String status=(String)c1.getSelectedItem();
			String price=t2.getText();
			String type=(String) c3.getSelectedItem();
			
			conn c=new conn();
			try
			{
				String str="insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
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
		new AddRoom().setVisible(true);

	}

	

}
