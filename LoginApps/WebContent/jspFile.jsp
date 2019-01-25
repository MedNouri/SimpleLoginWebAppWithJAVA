<%@page import="nouri.Person"%>
<%@page import="nouri.Users"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users </title>
<link rel="stylesheet" type="text/css" href="Mystle.css">
</head>
<body>
<div class='login-pagea'> <div class='forma'>
<%

 pageContext.setAttribute("users", Users.getUsers());
%>
<table><thead>
<tr>
<th>Number</th>
<th>name</th>
<th>Password</th>
<th>Email</th>
<th>Moyenne</th>
<th>Image</th>

</tr>
</thead>
<tbody>
<c:forEach begin="1" var="name" items="${users}" step="1">

<c:out value="$name.username"></c:out>

</c:forEach>
 
      <c:forEach var="name"  items="${users}"  begin="0" step="1" >
       <tr>
           <td>        </td>
          <td> ${name.username}  </td>
          <td> ${name.password}  </td>
          <td> ${name.email}  </td>
          <td> ${name.moy}  </td>
          <td> <img src="images/1.png"/>  </td>
       </tr>
    </c:forEach>

</tbody>
</table>
     </div>
  </div>
  </body>
</html>
  
 