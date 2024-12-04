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

@WebServlet(urlPatterns = "/getUser")
public class GetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // String id = req.getParameter("id");
        String userName = req.getParameter("userName");
        PlayStoreService service = new PlayStoreServiceImpl();
       // PlayStoreDto playStoreDto = service.getProductById(Integer.parseInt(id));
        PlayStoreDto playStoreDto = service.getUserByUserName(userName);

        //added dto object into the request scope
        req.setAttribute("user",playStoreDto);

        RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("getUser.jsp");
        requestDispatcher1.forward(req,resp);

    }
}
