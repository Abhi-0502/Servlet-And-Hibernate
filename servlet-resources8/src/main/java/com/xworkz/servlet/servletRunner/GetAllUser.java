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
import java.util.List;

@WebServlet("/getAllUser")
public class GetAllUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserService service = new UserServiceImpl();
        List<UserDto> dto = service.getAllUser();

        req.setAttribute("listOfDetails",dto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
