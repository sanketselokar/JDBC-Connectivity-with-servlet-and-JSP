<%-- 
    Document   : ListOfStudent
    Created on : May 19, 2017, 5:01:27 PM
    Author     : Sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div id="container">
            <header>
        <div id="head">
            <h1>List of Students</h1>
        </div>
    </header>
            <section>
                <div id="bod">
        <sql:setDataSource
        var="jdbc_connection"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/jdbc_connection"
        user="root" password="root"
    />
        
        <sql:query var="listUsers"   dataSource="${jdbc_connection}">
        SELECT * FROM student_table;
    </sql:query>
        
        
        <table  id="userTable">
            
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Date Of Birth</th>
                
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${user.fname}" /></td>
                    <td><c:out value="${user.lname}" /></td>
                    <td><c:out value="${user.DOB}" /></td>
                    
                </tr>
            </c:forEach>
        </table>
    
                </div>
            </section>
        </div>
    </body>
</html>
