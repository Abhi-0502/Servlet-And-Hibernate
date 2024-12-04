package com.xworkz.servlet.Servlet;

import com.xworkz.servlet.dao.UserDao;
import com.xworkz.servlet.dao.UserDaoImpl;
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
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginDetails extends HttpServlet {

    public LoginDetails(){
        System.out.println("object is created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String userName = req.getParameter("userName");
        String email = req.getParameter("email");
        String number = req.getParameter("number");
        String address = req.getParameter("address");
        System.out.println("   validated      " + userName + "   :" + " " + email + "      " + number +
                "    " + address + "     :");

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank You " + userName);

        UserDto dto = new UserDto();
        dto.setUserName(userName);
        dto.setEmail(email);
        dto.setNumber(number);
        dto.setAddress(address);

        UserDao userDao = new UserDaoImpl();
        Userservice userService = new UserServiceImpl();
        userService.addUserDetails(dto);

//        String value = req.getParameter("userName");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.write("Thank You "+ value);
//        System.out.println("Dopost method created");
//        String firstName = req.getParameter("firstName");
//
//        req.setAttribute("key", firstName);
//        req.setAttribute("msg","abhi");
//        //Servlet chaining
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
//        requestDispatcher.forward(req, resp);
//        System.out.println("dopost method ended");

//        SessionFactoryUtill sessionFactoryUtill = new SessionFactoryUtill();
//         SessionFactoryUtill.getEntityManagerFactory();

    }
}
