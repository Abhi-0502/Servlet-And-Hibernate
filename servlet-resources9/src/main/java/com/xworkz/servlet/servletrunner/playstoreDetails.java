package com.xworkz.servlet.servletrunner;

import com.xworkz.servlet.dao.PlayStoreDao;
import com.xworkz.servlet.dao.PlayStoreDaoImpl;
import com.xworkz.servlet.dto.PlayStoreDto;
import com.xworkz.servlet.service.PlayStoreService;
import com.xworkz.servlet.service.PlayStoreServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")

public class playstoreDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String userName = req.getParameter("userName");
        String surname= req.getParameter("surName");
        String gender = req.getParameter("gender");
        String dob =req.getParameter( "dob");
        String email= req.getParameter("email") ;
        String number = req.getParameter("number");
        String pwd= req.getParameter("pwd");
        String conpwd= req.getParameter("confirmPwd");
        String ans =req.getParameter("hideAns");
        String captcha= req.getParameter( "captcha");
        System.out.println("   validated      "+ userName+"   :"+surname+"      "+gender+"  "+dob+"    "+email+"      "+number+
             "    "+pwd+ "  "+ ans+"   "+conpwd+"  "+captcha+"     :" );

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank You "+ userName);

        PlayStoreDto dto = new PlayStoreDto();
        dto.setUserName(userName);
        dto.setNumber(Integer.parseInt(number));
        dto.setGender(gender);
        dto.setPwd(pwd);
        dto.setHideAns(ans);
        dto.setConfirmPwd(conpwd);
        dto.setCaptcha(captcha);

        PlayStoreDao playStoreDao = new PlayStoreDaoImpl();
        PlayStoreService playStoreService = new PlayStoreServiceImpl();
        playStoreService.validateAndSavePassport(dto);

    }
}
