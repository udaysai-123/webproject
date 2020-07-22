package org.dxc.employee.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dxc.employee.model.Employee;
import org.dxc.employee.service.EmployeeService;
 
/**
 * Servlet implementation class CustomController
 */
@WebServlet(description = "employee project", urlPatterns = { "/CustomControllerpath" })
public class CustomController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String user=request.getParameter("userName");
		String pass=request.getParameter("password");
		//create an object 
		Employee employee=new Employee();
		employee.setUserName(user);
		employee.setPassword(pass);
		//create a login logic
		EmployeeService employeeservice=new EmployeeService();
		boolean result =employeeservice.login(employee);
		
		if(result) {
			RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
			rd.forward(request,response);
		}
		else {
			response.sendRedirect("login.jsp");
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
