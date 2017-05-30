<%-- 
    Document   : Student_Page
    Created on : May 18, 2017, 9:57:14 PM
    Author     : Sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
        <input type="button" value="New Student" name="newStudentButton" onclick="openPage('NewStudent.jsp')">
        <!-- <br> <input type="button" value="Login" name="LoginButton" onclick="openPage('ListOfStudent.jsp')">-->
        <br> <br>  <input type="button" name="newStudentButton" value="List Of all Students" onclick="openPage('ListOfStudent.jsp')">
    </body>
    <script type="text/javascript">
        function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>
</html>