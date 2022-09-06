<%--
  Created by IntelliJ IDEA.
  User: ASHENI
  Date: 9/6/2022
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/SignIn" method="POST">
    <table>
        <tr>
            <td>Email</td>
            <td>:</td>
            <td> <input type="text" name="email" placeholder="Enter Email"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td>:</td>
            <td> <input type="password" name="password" placeholder="Enter Password"/></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td> <input type="submit" value="Sign In"/></td>
        </tr>
    </table>

</form>
</body>
</html>
