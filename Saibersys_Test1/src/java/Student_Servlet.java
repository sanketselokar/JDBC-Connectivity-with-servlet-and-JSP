
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanket
 */
@WebServlet(urlPatterns = {"/Student_Servlet"})
public class Student_Servlet 
{
    String fname;
    String lname;
    String dob;
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
         fname = (req.getParameter("fname"));
        lname = (req.getParameter("lname"));
         dob = (req.getParameter("dob"));
        
        
        
       
        
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws  Exception 
    { 
        String url="jdbc:mysql://localhost:3306/jdbc_connection";
        String uname ="root";
        String pass ="root";
        
        
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url,uname,pass);
        
        Statement st = con.createStatement();
        String sql = "Insert into student_table(fname, lname, dob) values(?,?,?) "; 
        java.sql.PreparedStatement pst =con.prepareStatement(sql); 
        pst.setString(1, fname); 
        pst.setString(2, lname); 
        pst.setString(3, dob); 
        pst.executeUpdate(); 
        System.out.println("Values are saved");
        pst.close(); 
    }
    
}
