package org.dxc.employee.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private  static Connection con;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded sucsessfully");
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String mySqlUrl="jdbc:mysql://localhost:3306/employeedb";
		String userName="root";
		String password="root";
		try {
			con=DriverManager.getConnection(mySqlUrl,userName,password);
			System.out.println("connection  is established sucsessfully");
			
		}
		catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		
		return con;
	}
	

}
