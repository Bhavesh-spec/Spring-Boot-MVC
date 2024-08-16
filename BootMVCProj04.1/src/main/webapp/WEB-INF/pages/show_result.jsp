<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/show.css">
</head>
<body>
    <div class="container">
        <h1>Employee Details</h1>
        <div class="employee-details">
            <p><strong>Employee Details:</strong></p>
            <pre>${emp}</pre>
        </div>
        <a class="home-link" href="./">Home</a>
    </div>
</body>
</html>
