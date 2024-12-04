package com.xworkz.servlet.servlet;

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

@WebServlet("/getUser")
public class GetUserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // String id = req.getParameter("id");
        //processing logic
        String userName = req.getParameter("userName");
        RegisterService service = new RegisterServiceImpl();
       // RegisterDto registerDto = service.getUserById(Integer.parseInt(id));
        //validation and busines logic
         RegisterDto registerDto = service.getRegisterUserName(userName);
        //added dto object into the request scope
        req.setAttribute("user",registerDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUser.jsp");
        requestDispatcher.forward(req,resp);

    }
}
