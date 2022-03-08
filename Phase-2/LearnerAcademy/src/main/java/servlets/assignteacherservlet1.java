package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class assignteacherservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public assignteacherservlet1() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/HTML");
		if(request.getSession(false).getAttribute("username")==null)
		{
			response.sendRedirect("login.jsp");
		}
		else {
			
			System.out.println("Working");
			System.out.println("Selected Class-Standard "+request.getParameter("selectedclassforteachers"));
			System.out.println("Selected Class-section "+request.getParameter("selectedsectionforteachers"));
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
