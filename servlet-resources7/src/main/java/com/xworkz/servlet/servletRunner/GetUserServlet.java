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

@WebServlet(urlPatterns = "/getUser")
public class GetUserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // String id = req.getParameter("id");
        String userName = req.getParameter("userName");
        MesshoService service = new MesshoServiceImpl();
        //MesshoDto messhoDto = service.getUserById(Integer.parseInt(id));
        MesshoDto messhoDto = service.getUserByUserName(userName);

        //added dto object into the request scope
        req.setAttribute("user",messhoDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUser.jsp");
        requestDispatcher.forward(req,resp);

//        String value=req.getParameter("userName");
//      PrintWriter printWriter = resp.getWriter();
//     printWriter.write("Thank You "+ value);
//
//        System.out.println("DoPost method created");
//        String firstName = req.getParameter("firstName");
//
//        req.setAttribute("key", firstName);
//        //Servlet chaining
//        RequestDispatcher requestDispatcher1= req.getRequestDispatcher("response.jsp");
//        requestDispatcher1.forward(req, resp);
//        System.out.println("doPost method ended");
    }
}
