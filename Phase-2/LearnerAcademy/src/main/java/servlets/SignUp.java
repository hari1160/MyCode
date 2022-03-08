package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import dao.User;

import org.hibernate.Session;

import dao.User;
import util.HibernateX;


public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignUp() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
		out.println("<h4 style='color:red;font-weight:bold'>Try Again!</h4><br/>");
		rd.include(request, response);
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newpass = request.getParameter("newpassword");
    	String repass = request.getParameter("repassword");
    	String username = request.getParameter("username");
    	String firstname = request.getParameter("firstname");
    	String lastname = request.getParameter("lastname");
    	
    	int user_flag = 0;
    	int pass_flag = 0;
    	
    	response.setContentType("text/html");
    	Session session=HibernateX.getsession();
    	List<User> userlist=session.createNativeQuery("Select * from User", User.class).getResultList();
    	//Validate username and password
    	if(!newpass.equals((String)repass))
        {
    		pass_flag++;
            
        }
         else
        {
            
        } 
    	
    	for(User u:userlist) {
	    	if(u.getUsername().equals(username))
		    	{
		    		user_flag++;
		    	}
		    	else {
		    		
		    	}
    	}
    	
    	if(user_flag>0) {	
    		response.setContentType("text/html");
	    	PrintWriter out=response.getWriter();
			RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
			out.println("<h4 style='color:red;font-weight:bold'>Username has been already presented! Choose new username!</h4><br/>");
			rd.include(request, response);
			
    	}
    	else if(pass_flag>0) {
    		response.setContentType("text/html");
    		PrintWriter out=response.getWriter();
    		RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
    		out.println("<h4 style='color:red;font-weight:bold'>Passwords invalid!</h4><br/>");
    		rd.include(request, response);
    	}
    	else {
    	
	    	// To Signup
	    	User newUser=new User(firstname,lastname,username,newpass);
	    	
			session.beginTransaction();
			session.save("User", newUser);
			
			session.getTransaction().commit();
			session.getSessionFactory().close();
			session.close();
			
			PrintWriter out=response.getWriter();
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			out.println("<h4 style='color:green;font-weight:bold'>New User succesfully added into list!</h4><br/>");
			rd.include(request, response);
    	}
    	
	}

}
