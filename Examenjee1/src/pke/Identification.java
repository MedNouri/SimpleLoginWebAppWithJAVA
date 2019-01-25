package pke;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Identification
 */
@WebServlet("/Identification")
public class Identification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Identification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login= request.getParameter("login");
		String pass = request.getParameter("pass");
		 
		
		if (login != null && pass != null){
			
			
		
		// login == password == Admininistrateur
		if ((login.equalsIgnoreCase("admin") )&&( pass.equalsIgnoreCase("admin"))){
			
			request.setAttribute("role", "Admin");
			getServletContext().getRequestDispatcher("/listeActualites.jsp").forward(request,response);
			
			
		}
		// login == password
		else if(login.equalsIgnoreCase(pass)){
			
			request.setAttribute("role", "Visteur");
			getServletContext().getRequestDispatcher("/listeActualites.jsp").forward(request,response);
			
			
			
		}
		// si non 
		else{
			getServletContext().getRequestDispatcher("/identification.html").forward(request,response);
			
		}
		}else{
			
			PrintWriter out = response.getWriter();
			out.println("Verfier Votre Login Ou Mots de pass");
			
		}
		
		
		
		
	
	}


}