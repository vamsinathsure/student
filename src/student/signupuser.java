package student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "signupuser")
public class signupuser extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
            if (password.equals(repassword)) {
                userdb newuser = new userdb();
                newuser.setFname(fname);
                newuser.setLname(lname);
                newuser.setEmail(email);
                newuser.setPassword(password);
                newuser.setRepassword(repassword);
                try {
                    user.signupuser(newuser);
                    request.setAttribute("success", "Successfully registerd");
                    request.getRequestDispatcher("login.jsp").forward(request, response);

                }
                catch (Exception e) {
                    e.printStackTrace();
                }


            }
            else {
                request.setAttribute("pass", "Passwords didn't match");
                request.getRequestDispatcher("signup.jsp").forward(request, response);

            }



    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
