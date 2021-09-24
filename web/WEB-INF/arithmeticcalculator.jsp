<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2021, 2:06:55 PM
    Author     : liamm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
        <label>First</label>
        <input type="text" name="first" value="${fn}"><br>
        <label>Second</label>
        <input type="text" name="second" value="${sn}"><br>
        <input type="submit" name="type" value="+">
        <input type="submit" name="type" value="-">
        <input type="submit" name="type" value="*">
        <input type="submit" name="type" value="%">
        </form>
        <p>Result: ${awnser}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
