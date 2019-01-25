package nouri;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuprrimerEtudiant
 */
@WebServlet("/SuprrimerEtudiant")
public class SuprrimerEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuprrimerEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");		
		String Email = request.getParameter("id");
		PrintWriter out= response.getWriter();

		
		
	    if (!(Email==null || Email.isEmpty())) { 
	    	if (Users.deleteUser(Email)){
	    		   out.print("<h1> User deleted from our database</h1>");
	    		   }
	    	else{ 
	 		   out.print(" <h1> something went wrong</h1>");
	 		   out.print("<p>invalid user name </p>");
	    	
	    	
	    	
	 }  
		  
	   
		
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
