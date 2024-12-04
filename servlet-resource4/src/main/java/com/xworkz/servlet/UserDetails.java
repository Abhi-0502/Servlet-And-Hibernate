package com.xworkz.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserDetails extends HttpServlet {

    public UserDetails(){
        System.out.println("object is created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//    String name = req.getParameter("name");
//        String place = req.getParameter("Place");
//        System.out.println(name +"         "+ place);
//        PrintWriter writer = resp.getWriter();
////        writer.write("Thank you" + name + " For Regestering");
//        writer.print("Thank you" + name + " For Regestering");

        System.out.println("Dopost method created");
        String firstName = req.getParameter("firstName");

        req.setAttribute("key", firstName);
        req.setAttribute("value","name");
        //Servlet chaining
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req, resp);
        System.out.println("dopost method ended");


    }
}
