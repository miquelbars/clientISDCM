/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdcm.controller;

import com.isdcm.dao.VideoDAO;
import com.isdcm.dto.VideoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ServletListadoVid", urlPatterns = {"/listadoVideos"})
public class ServletListadoVid extends HttpServlet {

    private final VideoDAO videoDAO;

    public ServletListadoVid() {
        this.videoDAO = new VideoDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Entra a doGet de listado videos : ");
        HttpSession session = request.getSession(false);
        if (session == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
        List<VideoDTO> videos = videoDAO.getVideos();
        request.setAttribute("lista", videos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listadoVid.jsp");
        dispatcher.forward(request, response);
    }

}
