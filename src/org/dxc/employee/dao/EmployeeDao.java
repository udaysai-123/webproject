package org.dxc.employee.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.dxc.employee.model.Employee;
import org.dxc.employee.utility.DBConnection;



public class EmployeeDao {
	private Connection con;
	private Statement statement;
	

	public EmployeeDao() {
		con=DBConnection.getConnection();
		try {
		statement=con.createStatement();
		}
		catch (SQLException e) {
			e.printStackTrace();
			
		}
	}


	public boolean Validatelogin(Employee employee) {
	boolean result=false;
	String sqlQuery="select*from employee where username="+employee.getUserName()+"andpassword="+employee.getPassword()+"";
	try {
		ResultSet rs=statement.executeQuery(sqlQuery);
		while(rs.next()) {
			result=true;
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return result;	
	}
    public boolean registerEmployeeDetails(Employee employee) {
	 return false;
	 
 }
}
