<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h1>User Registration</h1>
    <form action="/users/register" method="post">
        <label>Email:</label>
        <input type="text" name="email" required>
        <br>
        <label>Name:</label>
        <input type="text" name="name" required>
        <br>
        <label>Password:</label>
        <input type="password" name="password" required>
        <br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
