package com.xworkz.servlet.servlet;

import com.xworkz.servlet.dao.RegisterDao;
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
import java.util.List;

@WebServlet("/getAllUser")
public class GetAllUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RegisterService service = new RegisterServiceImpl();
        List<RegisterDto> dto = service.getAllUser();

        req.setAttribute("listOfUsers",dto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
