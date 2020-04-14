package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class user {
    private Connection con;
    public user(Connection con){
        this.con=con;
    }


    public static int signupuser(userdb user)throws ClassNotFoundException{

        int res=0;
        String query="INSERT INTO student_management.signup(fname,lname,email,password,repassword) VALUES(?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","vamsi4134");
            PreparedStatement pt=con.prepareStatement(query);
            pt.setString(1,user.getFname());
            pt.setString(2,user.getLname());
            pt.setString(3, user.getEmail());
            pt.setString(4,user.getPassword());
            pt.setString(5,user.getRepassword());
            System.out.println(pt);
            res=pt.executeUpdate();

        }
        catch (Exception e){
            e.printStackTrace();
        }


        return res;

    }

    //user identification by email

    public userdb getuserbyemail(String email,String password){
        userdb client=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String statement="select * from signup where email=? and password=?";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","vamsi4134");

            PreparedStatement pts=con.prepareStatement(statement);
            pts.setString(1,email);
            pts.setString(2,password);
            ResultSet rt=pts.executeQuery();
            if(rt.next()){
                client=new userdb();
                String fname=rt.getString("fname");
                client.setFname(fname);
                client.setLname(rt.getString("lname"));
                client.setEmail(rt.getString("email"));
                client.setPassword(rt.getString("password"));
                String markst="select * from marks where email=?";
                PreparedStatement mt=con.prepareStatement(markst);
                mt.setString(1,email);
                ResultSet rtofm=mt.executeQuery();
                if(rtofm.next()){
                    client.setSubject1(Integer.parseInt(rtofm.getString("subject1")));
                    client.setSubject2(Integer.parseInt(rtofm.getString("subject2")));
                    client.setSubject3(Integer.parseInt(rtofm.getString("subject3")));
                }
                String img="select img from student_images where email=?";
                PreparedStatement pimg=con.prepareStatement(img);
                pimg.setString(1,email);
                ResultSet rtimg=pimg.executeQuery();
                if(rtimg.next()){
                    client.setImage(rtimg.getString("img"));
                }


            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
        return client;
    }

    public boolean updateuser( userdb user){
        boolean f=false;
        try{
            String qu="update student_images set email=?,img=?";
            PreparedStatement pt=con.prepareStatement(qu);
            pt.setString(1,user.getEmail());
            pt.setString(2,user.getImage());
            pt.executeUpdate();
            f=true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        return f;
    }








}
