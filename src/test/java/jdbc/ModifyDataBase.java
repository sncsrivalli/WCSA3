package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ModifyDataBase {

	public static void main(String[] args) throws SQLException {
		
		//Step 1: Create an instance for JDBC driver
		Driver dbDriver = new Driver();
		
		//Step 2: Register driver
		DriverManager.registerDriver(dbDriver);
		
		//Step 3: Establish Connection
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcsa3", "root", "root");
		
		//Step 4: Create Statement
		Statement state = connect.createStatement();
		
		//Step 5: Execute Query
		int result = state.executeUpdate("insert into students(id,name,phone) values(104,'Def',987654258);");
		System.out.println(result);
		
		//Step 6: Close database connection
		connect.close();
	}

}
