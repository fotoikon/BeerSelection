/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.web;

import com.uthldap.Uthldap;

import com.example.model.*;
import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fotini
 */

@WebServlet(urlPatterns = {"/BeerSelect"})

public class BeerSelect extends HttpServlet {
        
    @Override
    public void doPost( HttpServletRequest request,
                      HttpServletResponse response)
                      throws IOException, ServletException {
     
    SessionListener numSession=new SessionListener();
    response.setContentType("text/html");
        
    String user = request.getParameter("username");
    String pass = request.getParameter("password");
         
    Uthldap auth=new Uthldap(user,pass);
    PrintWriter out=response.getWriter();
         
    //if username and password are correct then print Beer Recommendation
    if(auth.auth()){
        int num = numSession.getAllSession();
        request.setAttribute("all_sessions",num );

        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
    
        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
    //if username and password are wrong
    else {
        out.println("wrong username or password");
    }
}
}