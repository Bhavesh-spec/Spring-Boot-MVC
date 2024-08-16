<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/styles.css">
</head>
<body>
    <div class="container">
        <h1>Registration Page</h1>
        <form action="register" method="post">
            <div class="form-group">
                <label for="userName">User Name</label>
                <input type="text" id="userName" name="userName" required>
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>

            <div class="form-group">
                <label for="email">E-Mail</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="birthday">Birthday</label>
                <input type="date" id="birthday" name="birthday">
            </div>

            <div class="form-group">
                <label for="profession">Profession</label>
                <select id="profession" name="profession">
                    <option value="IT Manager">IT Manager</option>
                    <option value="SDE">SDE</option>
                    <option value="CTO">CTO</option>
                </select>
            </div>

            <div class="form-group">
                <input type="submit" value="Register">
            </div>
        </form>
    </div>
</body>
</html>
