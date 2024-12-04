package com.xworkz.servlet;

import com.xworkz.servlet.dao.UserDao;
import com.xworkz.servlet.dao.UserDaoImpl;
import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.service.UserService;
import com.xworkz.servlet.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Servlet mapping
@WebServlet("/login")
public class UserDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String UserName = req.getParameter("userName");
        String phoneNumber = req.getParameter("phoneNumber");
        String Email = req.getParameter("email");
        String DoB = req.getParameter("dob");
        String password = req.getParameter("password");
        System.out.println(UserName +"   validated      "+ password+"   :"+phoneNumber+"      "+Email+"    "+DoB+"     :" );

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank You "+ UserName+ "for Regestering");


        UserDto userDto = new UserDto();
        userDto.setId(4);
        userDto.setUserName(UserName);
        userDto.setPhoneNumber(Integer.parseInt(phoneNumber));
        userDto.setEmail(Email);
        userDto.setDob(Integer.parseInt(DoB));
        userDto.setPassword(Long.parseLong(password));

        UserDao userDao = new UserDaoImpl();
        UserService userServices = new UserServiceImpl();
       // userServices.validateAndSaveUserLogin(userDto);
        userServices.addUser(userDto);
    }
}
