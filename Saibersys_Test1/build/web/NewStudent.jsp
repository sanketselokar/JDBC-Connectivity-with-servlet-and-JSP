<%-- 
    Document   : NewStudent
    Created on : May 18, 2017, 9:56:29 PM
    Author     : Sanket
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
        
        <form method="post" action="NewStudentServlet">       
        
            First Name: <input type="text" name="fname">
            
            <br> Last Name: <input type="text" name="lname">
           <br> DOB: <input type="date" name="dob" id="dob"> 
            <br> <input type="submit" value="Save" name="saveButton" onclick="return callservlet();" >
        <br> <input type="submit" value="Cancel">
        </form>
        
        
         </body>
         <script type="text/javascript">
            function callservlet() 
            {
                var x = document.getElementById('dob').value;
                document.getElementById("dob").value = x;
                //document.forms.submit();
                //document.form1.hiddenValue.value = x; 
                
                //<input type="submit" value="Save" name="saveButton" onclick="return callservlet();" >
                
              //  document.forms[0].action = "NewStudentServlet";
            document.forms[0].submit();
            }
</html>


