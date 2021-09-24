<%-- 
    Document   : ageForm
    Created on : 23-Sep-2021, 12:03:12 PM
    Author     : liamm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AGE Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="POST">
            <label>Enter your age:</label>
            <input type="text" name="age" value="">
            <br>
            <input type="submit" value="Age next birthday">
            <p>${message}</p>
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
