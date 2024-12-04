package com.xworkz.servlet.servletRunner;

import com.xworkz.servlet.dto.MesshoDto;
import com.xworkz.servlet.services.MesshoService;
import com.xworkz.servlet.services.MesshoServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getAllUser")
public class GetAllUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("do Get Started");
        MesshoService messhoService = new MesshoServiceImpl();
        List<MesshoDto> dtos = messhoService.getAllMesshoDetails();

        req.setAttribute("listOfDetails",dtos);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUser.jsp");
        requestDispatcher.forward(req,resp);
        System.out.println("do get ended");
    }
}
