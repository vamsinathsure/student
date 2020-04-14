package student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/home")
public class welcome extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        HttpSession s=request.getSession();
        s.getAttribute("currentuser");
        out.println("user");








    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {







    }
}
