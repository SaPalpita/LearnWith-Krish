<%@ page import="virtusa.assessment.controller.DB" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    if(application.getAttribute("db")==null) {
        DB db = new DB();
        application.setAttribute("db", db);
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/SignUp" method="POST">
    <table>
        <tr>
            <td>Email</td>
            <td>:</td>
            <td> <input type="text" name="email" placeholder="Enter Email"/></td>
        </tr>
        <tr>
            <td>User Name</td>
            <td>:</td>
            <td> <input type="text" name="uname" placeholder="Enter User Name"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td>:</td>
            <td> <input type="password" name="password" placeholder="Enter Password"/></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td> <input type="submit" value="Sign Up"/></td>
        </tr>
    </table>

</form>
</body>
</html>