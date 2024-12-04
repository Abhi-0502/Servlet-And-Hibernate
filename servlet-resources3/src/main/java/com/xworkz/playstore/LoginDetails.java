package com.xworkz.playstore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class LoginDetails extends HttpServlet {


    public LoginDetails(){
        System.out.println("object is created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String value = req.getParameter("userName");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.write("Thank You" + value);

        System.out.println("DoPost method created");
        String firstName = req.getParameter("firstName");

        req.setAttribute("key", firstName);
        req.setAttribute("value","05/07/2024");
        //Servlet chaining
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req, resp);
        System.out.println("dopost method ended");
   }
}
