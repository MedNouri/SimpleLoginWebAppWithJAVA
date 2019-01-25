<%@page import="pke.Actualite"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="pke.GestionnaireActualites"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste Actualites</title>
</head>
<body>

<% 
String Role= (String)request.getAttribute("role");
if ( Role != null && Role.equalsIgnoreCase("admin")){%>
		<h4><a href="AjouterActualite.html">Ajouter un Articel</a></h4>
<% } %>



<h1>Liste Actualites </h1>
<h3> il ya <%=
GestionnaireActualites.getListeActualites().size()
 %> Actualites  </h3><br/>
 <!-- importaion de la lise -->
 <% ArrayList<Actualite> Actualitelist =GestionnaireActualites.getListeActualites() ; %>
 <% for(int i=0 ; i<Actualitelist.size(); i++ ){%>
	  <h3>Catégorie  : <%= Actualitelist.get(i).getCategorie() %> </h3>
	 
	 <h3>Titre    : <%= Actualitelist.get(i).getTitre()%>
          <% if ( Role != null && Role.equalsIgnoreCase("admin") ){%>
		<h4><a href="SupprimerActualite?code=<%= Actualitelist.get(i).getCode()%>">Suprimer  Articel</a></h4>
             <% } %>

	 </h3>
	  
	    <%= Actualitelist.get(i).getDescription() %>
	 <hr>
	 
 <% }%>




</body>
</html>