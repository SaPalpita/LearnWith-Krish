package virtusa.assessment.servlet;

import virtusa.assessment.controller.DB;
import virtusa.assessment.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignUp", urlPatterns = "/SignUp")
public class SignUp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String email=request.getParameter("email");
      String password=request.getParameter("password");
      String username=request.getParameter("uname");


     ServletContext servletContext=request.getServletContext();
     if(servletContext.getAttribute("db") !=null){
         DB db= (DB) servletContext.getAttribute("db");

         if(db.already(email)== false){
             Student student=new Student(email,username,password);
             response.getWriter().write(db.add(student));

         }else{
             System.out.println("Already Registered");
         }
     }
    }
}
