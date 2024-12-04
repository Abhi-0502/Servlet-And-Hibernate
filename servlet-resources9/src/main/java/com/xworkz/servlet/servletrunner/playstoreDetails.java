package com.xworkz.servlet.servletrunner;

import com.xworkz.servlet.dao.PlayStoreDao;
import com.xworkz.servlet.dao.PlayStoreDaoImpl;
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
import java.io.PrintWriter;

@WebServlet("/login")

public class playstoreDetails extends HttpServlet {

    public playstoreDetails(){
        System.out.println("Object is created");
    }

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
        dto.setSurName(surname);
        dto.setDob(dob);
        dto.setGender(gender);
        dto.setNumber(Integer.parseInt(number));
        dto.setEmail(email);
        dto.setPwd(pwd);
        dto.setHideAns(ans);
        dto.setConfirmPwd(conpwd);
        dto.setCaptcha(captcha);

        System.out.println("DoPost method created");
        String value = req.getParameter("firstName");
        //request scope
        req.setAttribute("key", value);
        req.setAttribute("msg","abhi");
        //Servlet chaining
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req, resp);
        System.out.println("doPost method ended");

//        PlayStoreDao playStoreDao = new PlayStoreDaoImpl();
//        PlayStoreService playStoreService = new PlayStoreServiceImpl();
//        playStoreService.validateAndSavePassport(dto);
//        PlayStoreDto getProductById = playStoreService.getProductById(56);
//





    }
}
