package student;

import java.sql.Connection;

public class userdb {
    String fname;
    String lname;
    String email;
    String password;
    String repassword;
    int subject1,subject2,subject3;
    String image;
    public userdb() {
        super();
    }


    public  userdb(String fname, String lname, String email, String password, String repassword){
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.password=password;
        this.repassword=repassword;

    }
    public userdb(String email,int subject1,int subject2,int subject3){
        this.email=email;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public  userdb(String email,String image){
        this.email=email;
        this.image=image;
    }



    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
