package firstApplet;
import java.sql.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class jdbcexample {
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	
	
	public jdbcexample() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","HR","1234567890");
			System.out.println("Connection successful");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	void insert(String UserName,int passwd) throws SQLException {
		ps=con.prepareStatement("insert into Persons(PersonId,LastName,FirstName,Address,City) values (?,?,?,?,?)");
		
		ps.setInt(1, passwd);
		
		ps.setString(2,"Kumar");

		ps.setString(3,UserName);
		
		ps.setString(4,"Bihar");
		ps.setString(5,"Panipat");
		int count=ps.executeUpdate();
		System.out.println("Row Affected "+count);
	}
	
	void Select() {
		
	}
	

	public static void main(String[] args) {
		
		
	}
	
}
