<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(session.getAttribute("user")== null) //check for existing session
{
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Video Page</title>
    </head>
    <body>
        <h1>Inserta tu video!</h1>
        <form action="register" method="post">  
  
            Título:<input type="text" name="title" required/><br/><br/>  
            Autor:<input type="text" name="author" required/><br/><br/>  
            Fecha de creación:<input type="date" name="creation_date" required/><br/><br/>
            Duración:<input type="time" name="duration" required/><br/><br/>
            Descripción:<input type="text" name="desciption" required/><br/><br/> 
            Formato:<input type="text" name="format" maxlength="5" required/><br/><br/>
            URL:<input type="text" name="url" required/><br/><br/>

            <br/><br/>  
            <input type="submit" value="Subir video"/>
        </form>
        <br><br>
        <a href="<%= request.getContextPath() %>/logout.jsp">Logout</a>
    </body>
</html>
