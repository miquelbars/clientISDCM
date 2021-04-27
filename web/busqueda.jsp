<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(session.getAttribute("user")==null) //check for existing session
{
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Busca tu video!</h1>
        <form action="busqueda" method="post">  
            <input type="radio" name="radio_search" value="radio_author" checked>
            Autor:<input type="text" name="author"/><br/><br/>
            
            <input type="radio" name="radio_search" value="radio_title">
            Titulo:<input type="text" name="title"/><br/><br/> 
            
            <input type="radio" name="radio_search" value="radio_creation_date">
            Fecha de creación (completo):<input type="date" name="creation_date"/><br/><br/>
            
            <input type="radio" name="radio_search" value="radio_creation_date_month">
            Fecha de creación (mes y año):<input type="month" name="creation_date_month"/><br/><br/>
            
            <input type="radio" name="radio_search" value="radio_creation_date_year">
            Fecha de creación (solo año):<input type="number" maxlength="4" placeholder="YYYY" min="1900" max="2100" name="creation_date_year"><br/><br/>

            <br/><br/>  
            <input type="submit" value="Buscar Video"/>
        </form>
        <br><br>
        <a href="<%= request.getContextPath() %>/listadoVideos">Ver videos</a>
        <br><br>
        <a href="<%= request.getContextPath() %>/video.jsp">Insertar video</a>
        <br/><br/>
        <a href="<%= request.getContextPath() %>/logout.jsp">Logout</a>
        
    </body>
</html>
