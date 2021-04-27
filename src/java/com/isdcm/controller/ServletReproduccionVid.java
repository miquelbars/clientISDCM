/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdcm.controller;

import com.isdcm.dao.UsuarioDAO;
import com.isdcm.dto.UsuarioDTO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fiblabs
 */
@WebServlet(urlPatterns = "/reproducir")
public class ServletReproduccionVid extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
        System.out.println("Entra a doGet de reproduccion : ");
        String id = request.getParameter("id");
        String url = request.getParameter("url");
        request.setAttribute("url", url);
        request.setAttribute("id", id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("reproduccion.jsp");
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

}
