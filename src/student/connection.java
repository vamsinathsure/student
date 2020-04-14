package student;
import java.sql.*;

public class connection {
    private static  Connection con;
    public static Connection getconnection(){
        try{

            if(con == null){
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","vamsi4134");

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;

    }






}
