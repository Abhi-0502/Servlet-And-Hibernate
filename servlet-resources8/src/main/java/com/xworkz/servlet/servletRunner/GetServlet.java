package com.xworkz.servlet.servletRunner;

import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.services.UserService;
import com.xworkz.servlet.services.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/getUser")
public class GetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //String id = req.getParameter("id");
        String userName = req.getParameter("userName");
        UserService service = new UserServiceImpl();
      //  UserDto userDto = service.getUserbyId(Integer.parseInt(id));
        UserDto userDto = service.getUserByUserName(userName);

        //added dto object into the request scope
        req.setAttribute("user",userDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
