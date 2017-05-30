/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sanket
 */
@WebServlet(urlPatterns = {"/LoginPageLogicServlet"})
public class LoginPageLogicServlet extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, Exception {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LoginPageLogicServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginPageLogicServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
        
        ///////////////////////
        String userid=request.getParameter("name"); 
String pwd=request.getParameter("pwd"); 

String url="jdbc:mysql://localhost:3306/jdbc_connection";
        String uname ="root";
        String pass ="root";
        String query = "Select * from account";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url,uname,pass);
        
        Statement st = con.createStatement();
        
        st.executeQuery(query);
        ResultSet rs = st.getResultSet();
        while(rs.next())
        {
            String userName = rs.getString("username");
            String userPassword = rs.getNString("password");
        
            if(userid.equals(userName)&& pwd.equals(userPassword))
            {
                ServletContext sc = this.getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/Student_Page.jsp");
        rd.include(request, response);
            }
//            else
//            {
//                ServletContext sc = this.getServletContext();
//        RequestDispatcher rd = sc.getRequestDispatcher("/LoginPage.jsp");
//        rd.include(request, response);
//            }
        }
        
        
         /*ResultSet rs = st.executeQuery(query);
        
        
        
       rs.next();
        
         String userName = rs.getString("username");
        String userPassword = rs.getNString("password");
        
        
        if(pwd.equals(userPassword))
        {
            ServletContext sc = this.getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/Student_Page.jsp");
        rd.include(request, response);
        }
        */
        
        st.close();
        con.close();
        
        //////////////////
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(LoginPageLogicServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(LoginPageLogicServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
