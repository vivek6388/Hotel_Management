package Management_Class;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
public class SearchRoom extends JFrame implements ActionListener{

		JComboBox c1;JCheckBox c2;JButton b1,b2;
		JTable t1,t2;
	public SearchRoom() {
		
		JLabel l1=new JLabel("Search for Room");
		l1.setFont(new Font(" ",Font.BOLD,40));
		l1.setBounds(220, 20, 350, 40);
		add(l1);
		
		JLabel l2=new JLabel(" Room Bed Type");
		l2.setBounds(30, 70, 150, 40);
		add(l2);
		
		c1=new JComboBox(new String[] {"Single Bed","Double Bed"});
		c1.setBounds(150, 80, 150, 25);
		c1.setBackground(Color.white);
		add(c1);
		
		
		c2=new JCheckBox("Only display Available");
		c2.setBounds(500, 80, 200, 25);
		c2.setBackground(Color.white);
		add(c2);
		
		
		t1=new JTable();
		t1.setBounds(0, 150, 900, 200);
		add(t1);
		
		b1=new JButton("Sumit");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(350, 420, 120, 30);
		b1.addActionListener(this);
		add(b1);
		
		
		b2=new JButton("Back");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(550, 420, 120, 30);
		b2.addActionListener(this);
		add(b2);
		
		JLabel l3=new JLabel(" Room number ");
		l3.setBounds(30, 120, 150, 40);
		add(l3);
		
		JLabel l4=new JLabel("Availablity");
		l4.setBounds(250, 120, 150, 40);
		add(l4);
		
		JLabel l5=new JLabel("Cleaning Status");
		l5.setBounds(450, 120, 150, 40);
		add(l5);
		
		JLabel l6=new JLabel("Price");
		l6.setBounds(650, 120, 150, 40);
		add(l6);
		
		
		JLabel l7=new JLabel("Bed Type ");
		l7.setBounds(750, 120, 150, 40);
		add(l7);
		
		
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setBounds(350,100,900,500);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			try
			{
				String str="select * from room where type='"+c1.getSelectedItem()+"'";
				String str2="select * from room where available = 'Available ' AND type ='"+c1.getSelectedItem()+"'";
				conn c=new conn();
				ResultSet rs=c.s.executeQuery(str);
				//t1.setModel(DbUtils.resultSetToTableModel(rs));
				if(c2.isSelected())
				{
					ResultSet rs2=c.s.executeQuery(str2);
					//t1.setModel(DbUtils.resultsToTableModel(rs2));
				}
			}
			catch(Exception e)
			{
				
			}
		}
		else if(ae.getSource()==b2)
		{
			new Reception().setVisible(true);
			this.setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		new SearchRoom().setVisible(true);

	}
	

}
