package nouri;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/Allusers")
public class Allusers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Allusers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");		
		PrintWriter out= response.getWriter();
		String cssLocation = request.getContextPath() + "/Mystle.css";
	    String cssTag = "<link rel='stylesheet' type='text/css' href='" + cssLocation + "'>" ;
        out.println("<! DOCTYPTE html> <html><head><title>All users page </title>");
	    out.println(cssTag);
        out.println("<div class='login-pagea'> <div class='forma'>");
       out.println("</head><body>");
        Random number=new Random();
        
		
		if(Users.users.isEmpty()){
			
			out.println("<p> there is No Users in the database Sorry</p>");
		}
		else{
			out.println("<h1> All Users</h1>"); 
			out.print("<p><table><thead>");
		      
			
			
			out.println("<tr><th>Number</th><th>Image</th><th>name</th><th>Email</th><th>  Password</th><th> Moyenne </th><th> supprimer </th></tr></thead> <tbody>");
			for (int i = 0 ; i<Users.users.size(); i++){
				int imgNumbere = number.nextInt(8);
				   if(imgNumbere==0){
					   imgNumbere = number.nextInt(8);
				   }
				String couleur=Users.users.get(i).moy<10?"#FC6944":"#33FF80";
				
					 out.println("<tr bgcolor="+couleur+ ">");
					 out.println("<td>"+i+"</td>");
					 out.println("<td><img src='images/"+imgNumbere+".png' alt='Mountain View' style='width:128px;height:126px;'></td>");
					 out.println("<td>"+Users.users.get(i).username+"</td>");
					 out.println("<td>"+Users.users.get(i).email+"</td>");
					 out.println("<td>"+Users.users.get(i).password+"</td>	");
					 out.println("<td >"+Users.users.get(i).moy+"</td>	"); 
	
					 out.println("<td><a class='deleteuser' href='SuprrimerEtudiant?id="+Users.users.get(i).email  +"'> Suprrimer User </a></td></tr>"); 
					 
			}
			
			 out.println("</tbody></table>");
			 out.println("</div> </div>");	
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
