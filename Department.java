package Management_Class;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Department extends JFrame implements ActionListener{

	JButton b1,b2;
	JTable t1,t2;
public Department() {
	
	JLabel l1=new JLabel("Department");
	l1.setFont(new Font(" ",Font.BOLD,30));
	l1.setBounds(150, 10, 350, 40);
	add(l1);
	
	
	
	
	
	
	
	t1=new JTable();
	t1.setBounds(0, 150, 900, 200);
	add(t1);
	
	b1=new JButton("Sumit");
	b1.setBackground(Color.black);
	b1.setForeground(Color.white);
	b1.setBounds(90, 420, 120, 30);
	b1.addActionListener(this);
	add(b1);
	
	
	b2=new JButton("Back");
	b2.setBackground(Color.black);
	b2.setForeground(Color.white);
	b2.setBounds(250, 420, 120, 30);
	b2.addActionListener(this);
	add(b2);
	
	JLabel l3=new JLabel("Department ");
	l3.setBounds(90, 60, 150, 40);
	add(l3);
	
	JLabel l4=new JLabel("Budget");
	l4.setBounds(290, 60, 150, 40);
	add(l4);
	
	
	
	
	getContentPane().setBackground(Color.white);
	
	setLayout(null);
	setBounds(350,100,450,550);
	setVisible(true);
	
}

public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==b1)
	{
		try
		{
			String str="select * from department ";
		
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
	new Department().setVisible(true);

}


}

