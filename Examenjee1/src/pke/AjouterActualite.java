package pke;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjouterActualite
 */
@WebServlet("/AjouterActualite")
public class AjouterActualite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterActualite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String code = request.getParameter("code");
	String  categorie= request.getParameter("categorie");
	String  titre= request.getParameter("titer");
	String  description= request.getParameter("description");
	
	GestionnaireActualites.ajouterActualite(code, titre, categorie, description);
	request.setAttribute("role", "Admin");
	getServletContext().getRequestDispatcher("/listeActualites.jsp").forward(request,response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
