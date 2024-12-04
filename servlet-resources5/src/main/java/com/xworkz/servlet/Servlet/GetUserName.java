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

@WebServlet("/getUserName")
public class GetUserName extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("userName");
        Userservice service = new UserServiceImpl();
        UserDto dto = service.getUserName(userName);

        //added dto object into the request scope
        req.setAttribute("dtos",userName);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUserName.jsp");
        requestDispatcher.forward(req,resp);
    }
}
