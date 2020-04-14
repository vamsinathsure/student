package student;
import java.sql.*;
import java.util.*;
import java.io.*;

import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "./updateUser")
public class updateUser extends HttpServlet {
    private static final long serialVersionUId=1L;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession s=request.getSession();
        userdb u=(userdb)s.getAttribute("currentuser");
        String email=u.getEmail();
        byte img[]=null;
        ServletOutputStream so=null;
        String que="select img from student_images where email=?";
        try {
            Connection con=connection.getconnection();
            PreparedStatement pti=con.prepareStatement(que);
            pti.setString(1,email);
            ResultSet rt=pti.executeQuery();
            if(rt.next()){
                img=rt.getBytes(1);
            }
            so= response.getOutputStream();
            so.write(img);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
