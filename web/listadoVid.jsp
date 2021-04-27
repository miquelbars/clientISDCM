<%@page import="java.util.ArrayList"%>
<%@page import="com.isdcm.dto.VideoDTO"%>
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
        <h1>Lista de Videos!</h1>
        <table border="1">
            <tr>
                <th> Seleccionar </th>
                <th> Titulo </th>
                <th> Autor </th>
                <th> Fecha de Creación </th>
                <th> Duración </th>
                <th> Reproducciones </th>
                <th> Descripción </th>
                <th> Formato </th>
                <th> URL </th>
                <th></th>
            </tr>
            <%
                ArrayList<VideoDTO> list = (ArrayList<VideoDTO>) request.getAttribute("lista");
                for(int i = 0; i < list.size(); i++){
            %>
            <tr>
                <td> <input TYPE="radio" name="id" value=<%= list.get(i).getId() %>/> </td>
                <td> <%= list.get(i).getTitulo() %> </td>
                <td> <%= list.get(i).getAutor() %> </td>
                <td> <%= list.get(i).getFechaCreacion() %> </td>
                <td> <%= list.get(i).getDuracion() %> </td>
                <td> <%= list.get(i).getReproducciones() %> </td>
                <td> <%= list.get(i).getDescripcion() %> </td>
                <td> <%= list.get(i).getFormato() %> </td>
                <td> <%= list.get(i).getUrl() %> </td>
                <td> <a href="<%= request.getContextPath() %>/reproducir?id=<%= list.get(i).getId() %>&url=<%= list.get(i).getUrl() %>">Visualizar video</a> </td>
            </tr>    
            <%
                }
            %>
        </table>
    </body>
</html>
