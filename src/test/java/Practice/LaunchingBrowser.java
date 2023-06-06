package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.checkerframework.checker.signature.qual.CanonicalNameAndBinaryName;

import com.mysql.jdbc.Driver;

public class LaunchingBrowser {

	public static void main(String[] args) throws Throwable { 
		//TO FETCH DATA FROM DATABASE
		
		//Step-1:Register driver
		
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//Step-2:Give the connectionj to the Data Base
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/weekendbatch ","root","root");
	    
		//Step-3:Create Sql Statement
		Statement stat = conn.createStatement();
		String query="select * from student";
		
		//Step-4:Execute Query
		ResultSet result = stat.executeQuery(query);
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
		}
		
		//Step-5:Close the Connection
		conn.close();
		
		
		
	}

}
