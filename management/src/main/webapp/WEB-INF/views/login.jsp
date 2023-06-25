<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>User Login</title>
</head>
<body>
    <h1>User Login</h1>
    
    <form action="${pageContext.request.contextPath}/users/login" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        
        <label for="role">Role:</label>
        <select id="role" name="role">
            <option value="admin">Admin</option>
            <option value="customer">Customer</option>
        </select>
        <br>
        
        <input type="submit" value="Login">
    </form>
</body>
</html>
