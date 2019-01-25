package nouri;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Adduser
 */
@WebServlet("/Adduser")
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adduser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		PrintWriter out= response.getWriter();
		out.println("<!DOCTYPE HTML > <html> <head>");
		String cssLocation = request.getContextPath() + "/Mystle.css";
	    String cssTag = "<link rel='stylesheet' type='text/css' href='" + cssLocation + "'>" ;
		
	 

   out.println(cssTag);
   out.println("<title>ADD A NEW USER </title> </HEAD><body>");
   out.println("<div class='login-page'> <div class='form'> <form class='login-form'>");
		 
		String name= request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		double moyenne= Double.parseDouble( request.getParameter("moyenne"));
	 
		 Person p1= new Person("Nouri","123654","mohamednori.isa",14);
		 Class<?> o = p1.getClass() ;
		 System.out.println(o.getClass());
		 System.out.println(o.getName());
		 System.out.println(o.getFields());
	 
		if((name == null)||(password==null)){
		    	out.println("<p><b> there is an empty value please check your values </b></p>");
		    	out.println("<a href='login.html'> <input type='submit' value='Go bAck'></a>");
		    }
		 else {
		 Users.addUser(name, password,email,moyenne );
		 String newuser= Users.findUsername(name,password);
		
		 
		if (newuser=="This user already exists in our database."){
			 out.println("<p>User added successfully </p>");
			 out.println("<a href='../WebContent/Menu.html'> <input type='submit' value='Go back' ></a>");
			
		      }   else{  out.println("<p>Error !!!!</P> "); }
			
		      
		  }
	
		out.println("</form></div> </div>");
	     out.println("</body></html>");
	        
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
