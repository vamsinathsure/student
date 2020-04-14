package student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "login")
public class login extends HttpServlet {
    public login(){

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String email=request.getParameter("username");
            String password=request.getParameter("password");
            request.setAttribute("name",email);
            user dao=new user(connection.getconnection());
            userdb user= dao.getuserbyemail(email,password);


          try {
              if (user != null) {
                  response.setHeader("cache-control","no-cache,no-store,must-revalidate");
                  response.setHeader("programa","no-cache");
                  response.setHeader("Expires","0");

                  HttpSession s = request.getSession();
                  s.setAttribute("currentuser", user);
                  response.sendRedirect("/welcome.jsp");

              } else {
                  request.setAttribute("invalid", "*invalid Login Credential's");
                  request.getRequestDispatcher("/login.jsp").forward(request, response);
              }

          }
          catch (Exception e){
              e.printStackTrace();
          }





        }










    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
