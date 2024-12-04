package com.xworkz.servlet.servlet;

import com.xworkz.servlet.dao.RegisterDao;
import com.xworkz.servlet.dao.RegisterDaoImpl;
import com.xworkz.servlet.dto.RegisterDto;
import com.xworkz.servlet.service.RegisterService;
import com.xworkz.servlet.service.RegisterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class Register extends HttpServlet {

    public Register(){
        System.out.println("object is created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("userName");
        String email = req.getParameter("email");
        String place = req.getParameter("place");
     //   System.out.println(name +"         "+ place);
        PrintWriter writer = resp.getWriter();
       writer.write("Thank you" + name + " For Regestering");


        RegisterDto registerDto = new RegisterDto();
        registerDto.setUserName(name);
        registerDto.setEmail(email);
        registerDto.setPlace(place);

        RegisterDao registerDao = new RegisterDaoImpl();
     RegisterService registerService = new RegisterServiceImpl();
        registerService.validateAndSaveRegister(registerDto);

//        System.out.println("Dopost method created");
//        String firstName = req.getParameter("firstName");
//
//        req.setAttribute("key", firstName);
//        req.setAttribute("value","05");
//        //Servlet chaining
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
//        requestDispatcher.forward(req, resp);
//        System.out.println("doPost method ended");
    }
}
