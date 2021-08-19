package Management_Class;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//import net.proteanit.sql.DbUtils;   (rs2xmal name ki jar file or DbUtil ko comment se delete karna ok)

	

public class EmployeeInfo extends JFrame implements ActionListener {

		JTable t1;
		JButton b1,b2;
	public EmployeeInfo() {
		
		t1=new JTable();
		t1.setBounds(0, 40, 1000, 500);
		add(t1);
		
		
		JLabel l1=new JLabel("Name");
		l1.setBounds(30, 15, 70, 20);
		add(l1);
		
		JLabel l2=new JLabel("age");
		l2.setBounds(135, 15, 70, 20);
		add(l2);
		
		JLabel l3=new JLabel("Gender");
		l3.setBounds(220, 15, 70, 20);
		add(l3);
		
		JLabel l4=new JLabel("Department");
		l4.setBounds(310, 15, 70, 20);
		add(l4);
		
		JLabel l5=new JLabel("Salary");
		l5.setBounds(450, 15, 70, 20);
		add(l5);
		
		
		JLabel l6=new JLabel("Phone");
		l6.setBounds(507, 15, 70, 20);
		add(l6);
		
		JLabel l7=new JLabel("Aaadhar");
		l7.setBounds(600, 15, 70, 20);
		add(l7);
		
		JLabel l8=new JLabel("Mail");
		l8.setBounds(750, 15, 70, 20);
		add(l8);
		
		b1=new JButton("Load Data");
		b1.setBounds(270, 560, 120, 30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		

		b2=new JButton("Back");
		b2.setBounds(470, 560, 120, 30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		
		add(b2);
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setBounds(300,30,850,640);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try
			{
				conn c=new conn();
				String str="select * from employee";
				java.sql.ResultSet ts=c.s.executeQuery(str);
			//	t1.setModel(DbUtils.resultSetToTableModel(ts));
				
			}
			catch(Exception e1)
			{
				
			}
		}
		else if(e.getSource()==b2)
		{
			new Reception().setVisible(true);
			this.setVisible(false);
		}
		
	}


	public static void main(String[] args) {
		new EmployeeInfo().setVisible(true);

	}


}
