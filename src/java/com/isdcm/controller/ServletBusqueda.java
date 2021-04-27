package com.isdcm.controller;

import com.isdcm.dao.VideoDAO;
import com.isdcm.dto.VideoDTO;
import com.isdcm.soap.services.SearchVideoWS_Service;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author fiblabs
 */

@WebServlet(urlPatterns = {"/busqueda"})
public class ServletBusqueda extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/isdcm-soap/SearchVideoWS.wsdl")
    private SearchVideoWS_Service service;
    private final VideoDAO videoDAO;

    public ServletBusqueda() {
        this.videoDAO = new VideoDAO();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletRegistroVid</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletRegistroVid at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private void response(HttpServletResponse resp, String msg)throws IOException {
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<t1>" + msg + "</t1>");
	out.println("</body>");
        out.println("</html>");
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        System.out.println("Entra a doPost con action: "+action);
        try {
            switch (action) {
            case "/busqueda":
                    busqueda(request, response);
                    break;
            }
        }
        catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    
    private void busqueda(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException, ServletException {
        
        List<com.isdcm.soap.services.VideoDTO> ListV = new ArrayList<>();
        switch (request.getParameter("radio_search")) {
            case "radio_author":
                ListV = searchByAuthor(request.getParameter("author"));
                break;
            case "radio_title":
                ListV = searchByTitle(request.getParameter("title"));
                break;
            case "radio_creation_date":
                com.isdcm.soap.services.SearchByCreationDateRequest date = new com.isdcm.soap.services.SearchByCreationDateRequest();
                date.setDay(LocalDate.parse(request.getParameter("creation_date")).getDayOfMonth());
                date.setMonth(LocalDate.parse(request.getParameter("creation_date")).getMonthValue());
                date.setYear(LocalDate.parse(request.getParameter("creation_date")).getYear());
                ListV = searchByCreationDate(date);
                break;
            case "radio_creation_date_month":
                com.isdcm.soap.services.SearchByCreationDateRequest date1 = new com.isdcm.soap.services.SearchByCreationDateRequest();
                date1.setMonth(LocalDate.parse(request.getParameter("creation_date")).getMonthValue());
                date1.setYear(LocalDate.parse(request.getParameter("creation_date")).getYear());
                ListV = searchByCreationDate(date1);
                break;
            case "radio_creation_date_year":
                com.isdcm.soap.services.SearchByCreationDateRequest date2 = new com.isdcm.soap.services.SearchByCreationDateRequest();
                date2.setYear(parseInt(request.getParameter("creation_date_year")));
                ListV = searchByCreationDate(date2);
                break;
            default:
                redirectToLogin(request, response);
                break;
        }
        
        List<VideoDTO> L = new ArrayList<>();
        for (int i = 0; i < ListV.size(); ++i){
            VideoDTO video = new VideoDTO(0, ListV.get(i).getTitulo(), ListV.get(i).getAutor(), LocalDate.parse(ListV.get(i).getFechaCreacion()), LocalTime.parse(ListV.get(i).getDuracion()), ListV.get(i).getReproducciones(), ListV.get(i).getDescripcion(), ListV.get(i).getFormato(), ListV.get(i).getUrl());
            L.add(video);
        }
        
        request.setAttribute("lista", L);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listadoVid.jsp");
        dispatcher.forward(request, response);
    }
    
    private void redirectToLogin(HttpServletRequest request, HttpServletResponse response)
                    throws SQLException, IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    private java.util.List<com.isdcm.soap.services.VideoDTO> searchByAuthor(java.lang.String author) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.isdcm.soap.services.SearchVideoWS port = service.getSearchVideoWSPort();
        return port.searchByAuthor(author);
    }

    private java.util.List<com.isdcm.soap.services.VideoDTO> searchByCreationDate(com.isdcm.soap.services.SearchByCreationDateRequest searchByCreationDateRequest) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.isdcm.soap.services.SearchVideoWS port = service.getSearchVideoWSPort();
        return port.searchByCreationDate(searchByCreationDateRequest);
    }

    private java.util.List<com.isdcm.soap.services.VideoDTO> searchByTitle(java.lang.String title) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.isdcm.soap.services.SearchVideoWS port = service.getSearchVideoWSPort();
        return port.searchByTitle(title);
    }

}