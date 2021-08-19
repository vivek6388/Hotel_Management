package Management_Class;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.mysql.jdbc.ResultSet;

public class Room extends JFrame implements ActionListener{

	JTable t1;JButton b1,b2;
		
	public Room() {
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("seventh.jpg"));
		Image i2=i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l11=new JLabel(i3);
		l11.setBounds(520, 40, 500, 400);
		add(l11);
		
		JLabel l1=new JLabel("Room Number");
		l1.setBounds(10, 10, 100, 20);
		add(l1);
		
		JLabel l2=new JLabel("Available");
		l2.setBounds(140, 10, 100, 20);
		add(l2);
		
		
		JLabel l3=new JLabel("Status");
		l3.setBounds(230, 10, 100, 20);
		add(l3);
		
		JLabel l4=new JLabel("Price");
		l4.setBounds(330, 10, 100, 20);
		add(l4);
		
		JLabel l5=new JLabel("type");
		l5.setBounds(450, 10, 100, 20);
		add(l5);
		
		
		t1=new JTable();
		t1.setBounds(0, 40, 500, 400);
		add(t1);
		
		b1=new JButton("Load Data");
		b1.setBounds(100, 460, 120, 30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		

		b2=new JButton("Back");
		b2.setBounds(260, 460, 120, 30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setBounds(220,100,1040,550);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try
			{
				conn c=new conn();
				String str="select * from room";
				
				ResultSet rs=(ResultSet) c.s.executeQuery(str);
			//	t1.setModel(DbUtils.resultSetToTableModel(rs));
			}
			catch(Exception ee)
			{
				
			}
		}
		else if(e.getSource()==b2)
		{
			new Reception().setVisible(true);this.setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		new Room().setVisible(true);
	}

	

}
