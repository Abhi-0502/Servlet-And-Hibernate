package com.xworkz.servlet.servletRunner;


import com.xworkz.servlet.dao.UserDao;
import com.xworkz.servlet.dao.UserDaoImpl;
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
import java.io.PrintWriter;

@WebServlet("/login")
public class RegisterDetails extends HttpServlet {

    public RegisterDetails(){
       System.out.println("object is created");
    }


     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         String userName = req.getParameter("userName");
         String email = req.getParameter("email");
         String number= req.getParameter("number") ;
         String address= req.getParameter("address");
         System.out.println("   validated      "+ userName+"   :"+" " +email+"      "+number+
                 "    "+address+ "     :" );

         PrintWriter printWriter = resp.getWriter();
         printWriter.write("Thank You "+ userName);

         UserDto dto = new UserDto();
         dto.setUserName(userName);
         dto.setEmail(email);
         dto.setNumber(Integer.parseInt(number));
         dto.setAddress(address);

         UserDao userDao = new UserDaoImpl();
      UserService userService = new UserServiceImpl();
       userService.addUserDetails(dto);
      //UserDto getUserbyId = userService.getUserbyId(1);

        //  String name = req.getParameter("name");
//        String place = req.getParameter("Place");
//        System.out.println(name +"         "+ place);
//        PrintWriter writer = resp.getWriter();
////        writer.write("Thank you" + name + " For Regestering");
//        writer.print("Thank you" + name + " For Regestering");

//          System.out.println("Dopost method created");
//          String firstName = req.getParameter("firstName");
//
//          req.setAttribute("key", firstName);
//          req.setAttribute("value","05");
//          //Servlet chaining
//          RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
//          requestDispatcher.forward(req, resp);
//          System.out.println("doPost method ended");
     }

}

