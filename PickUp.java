package Management_Class;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class PickUp extends JFrame implements ActionListener{

	Choice c1;JButton b1,b2;
	JTable t1,t2;
public PickUp() {
	
	JLabel l1=new JLabel("PickUp Service");
	l1.setFont(new Font(" ",Font.BOLD,40));
	l1.setBounds(220, 10, 350, 40);
	add(l1);
	
	JLabel l2=new JLabel("Type of Car");
	l2.setBounds(30, 70, 100, 40);
	add(l2);
	
	c1=new Choice();
	try
	{
		conn c=new conn();
		ResultSet rs=c.s.executeQuery("select * from driver");
		while(rs.next())
		{
			c1.add(rs.getString("brand"));
		}
	}
	catch(Exception e)
	{
		c1.setBounds(150, 80, 200, 26);
		add(c1);
	}
	
	
	
	
	
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
	
	JLabel l3=new JLabel("Name ");
	l3.setBounds(30, 120, 150, 40);
	add(l3);
	
	JLabel l4=new JLabel("Age");
	l4.setBounds(150, 120, 150, 40);
	add(l4);
	
	JLabel l5=new JLabel("Gender");
	l5.setBounds(250, 120, 150, 40);
	add(l5);
	
	JLabel l6=new JLabel("Company");
	l6.setBounds(400, 120, 150, 40);
	add(l6);
	
	
	JLabel l7=new JLabel("Brand");
	l7.setBounds(570, 120, 150, 40);
	add(l7);
	
	JLabel l8=new JLabel("Availabilty");
	l8.setBounds(670, 120, 150, 40);
	add(l8);
	
	
	JLabel l9=new JLabel("Loaction");
	l9.setBounds(800, 120, 150, 40);
	add(l9);
	
	
	
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
			String str="select * from driver where brand='"+c1.getSelectedItem()+"'";
			String str2="select * from room where available = 'Available ' AND type ='"+c1.getSelectedItem()+"'";
			conn c=new conn();
			ResultSet rs=c.s.executeQuery(str);
			//t1.setModel(DbUtils.resultSetToTableModel(rs));
			
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
	new PickUp().setVisible(true);

}


}

	