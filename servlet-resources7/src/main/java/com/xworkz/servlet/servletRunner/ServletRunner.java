package com.xworkz.servlet.servletRunner;

import com.xworkz.servlet.dao.MeshoDao;
import com.xworkz.servlet.dao.MesshoDaoImpl;
import com.xworkz.servlet.dto.MesshoDto;
import com.xworkz.servlet.services.MesshoService;
import com.xworkz.servlet.services.MesshoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class ServletRunner extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("userName");
        String number = req.getParameter("number");
        String gender= req.getParameter("gender") ;
        String address= req.getParameter("address");
        System.out.println("   validated      "+ userName+"   :"+" " +gender+"      "+number+
                "    "+address+ "     :" );

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank You "+ userName);

        MesshoDto dto = new MesshoDto();
        dto.setUserName(userName);
        dto.setNumber(Integer.parseInt(number));
        dto.setGender(gender);
        dto.setAddress(address);

        MeshoDao meshoDao = new MesshoDaoImpl();
        MesshoService messhoService = new MesshoServiceImpl();
        messhoService.addDetails(dto);
    }
}
