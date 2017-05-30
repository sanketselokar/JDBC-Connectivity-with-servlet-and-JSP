<%-- 
    Document   : LoginPage
    Created on : May 18, 2017, 9:18:48 PM
    Author     : Sanket
--%>

<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    
    <body>
        <form method="post" action="LoginPageLogicServlet">  
        
            Username: <input type="text" name="name" required="">
            <br> Password: <input type="password" name="pwd" required="">
           
<!--            Go to JSP page-->
            <!-- <br> <input type="button" value="Login" name="LoginButton" onclick="openPage('ListOfStudent.jsp')">-->
            <br> <input type="submit" value="Login" name="loginButton" onclick="return callservlet();">
            <br> <input type="submit" value="Cancel" name="cancelButton" onclick="return cancelFieldMethod();">
        </form>
        </body>
        
        <script type="text/javascript">
            function callservlet() {

    var servletname=document.getdata.loginButton.value;

//    if(servletname== "")
//        {
//        alert("NO value..");
//        return false;
//        }
//    else
//        {
//        alert("value"+servletname);
        
        document.forms[0].action = "LoginPageLogicServlet";
            document.forms[0].submit();
//        return false;
//        }
}
function cancelFieldMethod()
{
    
    
    document.getElementById("text").value= "";
    document.getElementById("pwd").value= "";
}
            
            
// function openPage(pageURL)
// {
// window.location.href = pageURL;
// }
</script>

</html>

