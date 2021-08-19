package Management_Class;

import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class conn {

	java.sql.Connection c;
	Statement s;
	public conn()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://my","root","root");
			s=c.createStatement();
			System.out.println("jik");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
