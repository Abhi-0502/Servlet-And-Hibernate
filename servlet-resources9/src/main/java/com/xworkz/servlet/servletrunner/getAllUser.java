package com.xworkz.servlet.servletrunner;

import com.xworkz.servlet.dto.PlayStoreDto;
import com.xworkz.servlet.service.PlayStoreService;
import com.xworkz.servlet.service.PlayStoreServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getAllUser")
public class getAllUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PlayStoreService service = new PlayStoreServiceImpl();
        List<PlayStoreDto> dto = service.getAllUser();

        req.setAttribute("listOfUsers",dto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUser.jsp");
        requestDispatcher.forward(req,resp);

    }
}
