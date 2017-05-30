/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sanket
 */
@WebServlet(urlPatterns = {"/SaveDataServlet"})
public class SaveDataServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException, ParseException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SaveDataServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet SaveDataServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
        
        String firstName=request.getParameter("fname");
        String lastName=request.getParameter("lname");
        
        SimpleDateFormat in = new SimpleDateFormat("dd-MM-yyyy");
        String parameter = request.getParameter("dob");
        Date date = (Date) in.parse(parameter);
//String toolvalue=request.getParameter("tvalue");   DOB
//Date date = new Date(request.getParameter("dob"));
        //java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse("10-10-2010");
        //System.out.println("First Name: " + firstName);
        //PrintWriter out = response.getWriter();
        //out.println(firstName);
        
        //===========================
        
        String url="jdbc:mysql://localhost:3306/jdbc_connection";
        String uname ="root";
        String pass ="root";
        
        
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url,uname,pass);
        
        Statement st = con.createStatement();
        //String sql = "Insert into student_table(fname, lname, dob) values(?,?,?) "; 
        String sql = "Insert into student_table_servlet(fname, lname) values(?,?) "; 
        java.sql.PreparedStatement pst =con.prepareStatement(sql); 
        pst.setString(1, firstName); 
        pst.setString(2, lastName); 
        //pst.setDate(3, (Date) date);
         pst.executeUpdate(); 
        System.out.println("Values are saved");
        pst.close(); 
        
        
        //====================================
        
        
        
    }

    
    

}
