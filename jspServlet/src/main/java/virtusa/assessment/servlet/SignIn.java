package virtusa.assessment.servlet;

import virtusa.assessment.controller.DB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignIn", value = "/SignIn")
public class SignIn extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String email=request.getParameter("email");
     String password=request.getParameter("password");

     ServletContext servletContext=request.getServletContext();
     if(servletContext.getAttribute("db")!=null){
         DB db= (DB) servletContext.getAttribute("db");
         boolean already= db.already(email);
         if(already==true){
             response.getWriter().write("Login Successfully..");
         }
         else{
             response.getWriter().write("Invalid User..");
         }

     }
    }
}
