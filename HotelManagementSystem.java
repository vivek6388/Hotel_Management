package Management_Class;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener{
	
	HotelManagementSystem()
	{
		setBounds(10,3,1266,565);
		
		
		ImageIcon  i1=new ImageIcon(ClassLoader.getSystemResource("first.jpg"));
		
		JLabel l1=new JLabel(i1);
		l1.setBounds(0, 0, 1366, 565);
		add(l1);
		
		JLabel l2=new JLabel("Hotel Management System");
		l2.setBounds(30,440,1500,100);
		l2.setForeground(Color.white);
		l2.setFont(new Font("serif",Font.BOLD,50));
		l1.add(l2);
		
		JButton b1=new JButton("Next");
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setBounds(1010, 476, 150, 50);
		b1.addActionListener(this);
		l1.add(b1);
		
		setLayout(null);
		setVisible(true);
		
		while(true)
		{
			l2.setVisible(false);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
			l2.setVisible(true);
			try
			{
			Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		new Login().setVisible(true);
		this.setVisible(false);
		
	}


	public static void main(String[] args) {
		new HotelManagementSystem();
	
	}

	
	
}
