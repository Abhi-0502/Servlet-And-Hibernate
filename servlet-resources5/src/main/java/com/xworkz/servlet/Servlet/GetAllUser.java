package com.xworkz.servlet.Servlet;

import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.service.UserServiceImpl;
import com.xworkz.servlet.service.Userservice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( "/getAllUser")
public class GetAllUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("DoGet Started");
        Userservice userservice = new UserServiceImpl();
        List<UserDto> dtos = userservice.getAllUser();

        req.setAttribute("listOfDetails",dtos);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUser.jsp");
        requestDispatcher.forward(req,resp);

    }
}
