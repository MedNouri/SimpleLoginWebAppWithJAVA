package nouri;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login1")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");		
		PrintWriter out= response.getWriter();
		String cssLocation = request.getContextPath() + "/Mystle.css";
	    String cssTag = "<link rel='stylesheet' type='text/css' href='" + cssLocation + "'>" ;
	    Random number=new Random();
	    int imgNumbere = number.nextInt(8);
      out.println(cssTag);
   out.println("<div class='login-page'> <div class='form'> <form class='login-form'>");
	    String name= request.getParameter("username");
		String password=request.getParameter("password");
		
	    if((name =="")||(password=="")){
	    	out.println("<p><b> there is an empty value please check your values </b></p>");
	    	 out.println("<a href='login.html'> <input type='submit' value='Go bAck  ' ></a>");
	    }else{
		
	
		if(Users.findUsername(name,password) == "This user already exists in our database." ){
			
			  
		    out.println("<p><img src='images/"+imgNumbere+".png' alt='Mountain View' style='width:128px;height:126px;'><p>");
			out.println("<p>Hello How are you <b> Mr "+name+"</b></p>");
			out.println("<p>your password is :<b>"+password +"</b></p>");
			 out.println("<a href='../../WebContent/Menu.html'> <input type='submit' value='view my profile ' ></a>");
			
			out.print("<br />");
			out.println(" <a href='login.html'> <button type='submit' </boutton>Log out</a>");
		}else{
			
			out.println("<p>the password or identity for the following user account could not be validated</P>");
			 out.println("<a href='../../WebContent/Menu.html'> <input type='submit' value='Go bAck  ' ></a>");
		}  
	    }
		out.println("</form></div> </div>");
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
