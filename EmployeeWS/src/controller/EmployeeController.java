package controller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Endpoint;

import org.json.simple.JSONObject;

import com.employee.ws.Employee;
import com.google.gson.Gson;

import service.EmployeeImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebService(endpointInterface = "service.EmployeeImpl")
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		java.lang.String name = request.getParameter("name"); 
		if (name != null)
		{
			Employee emp = new Employee();		
			name = request.getParameter("name");    			//Getting name from jsp page
			emp.setName(name);
			java.lang.String designation = request.getParameter("designation"); //Getting designation from jsp page
			emp.setDesignation(designation);
			java.lang.String age = request.getParameter("age");					//Getting age from jsp page
			emp.setAge(age);
			request.setAttribute("name", null);
			
			// Object / Input Parameters     Insert     List Records 
			// Display All List of Records 
			//Web Service input Parameters  Return All file Data  Display All 
			try
			{
				EmployeeImpl MyEmployee = new EmployeeImpl();
		//		Endpoint.publish("http://localhost:9901/Employee", MyEmployee);
		
				MyEmployee.setEmployee(emp);
				ArrayList<Employee> employees = MyEmployee.getEmployee();
				request.setAttribute("employee", employees);  //Setting the List to jsp page
				
				request.getRequestDispatcher("display.jsp").forward(request, response);
				
			}catch(IllegalArgumentException ex)
			{
				ex.printStackTrace();
			}			
		}
		String act = request.getParameter("Delete1");
		if (act != null)
		{
		System.out.println("Hello bhaiiiiiiiiiiiiiii");
		System.out.println(act);
		EmployeeImpl emp = new EmployeeImpl();
		emp.deleteRecord(act);
		RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/EmployeeWS/WebContent/display.jsp");
		RequetsDispatcherObj.forward(request, response);
		//request.getRequestDispatcher("display.jsp").forward(request, response);
		}
	}
	@WebMethod
	public void deleteRecord()
	{
		
		System.out.println("In Delete .................");
		/*JSONObject data = new Gson().fromJson(request.getReader(), JSONObject.class);
		if(data.get("foo").toString().equals(null))
		{
			//String foo = request.getParameter("foo").toString();
			//String bar = request.getParameter("bar").toString();
			//String baz = request.getParameter("baz").toString();
			System.out.println("Received in post **********");
		}*/
	//	System.out.println("Received at controller " + str);
		//EmployeeImpl emp = new EmployeeImpl();
		//emp.deleteRecord(str);
	}

}
