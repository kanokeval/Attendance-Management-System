package atteandance.management;
import java.sql.*;

public class ConnectionProject 
{
 	Connection con;
	Statement stmt;
 
        public ConnectionProject()
	{
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendance","root","keval");
                stmt=con.createStatement();	
            }
            catch(Exception e)  
            {                                                                                                               
		e.printStackTrace();  //Any Error Show Display.                                                                                                                                                                                                       
            }
        }
}
