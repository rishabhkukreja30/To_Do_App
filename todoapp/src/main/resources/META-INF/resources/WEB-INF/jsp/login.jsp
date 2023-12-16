<html>
<head>
<title>
Login Page
</title>
</head>
<body>
<h3>
Welcome to Login Page
</h3>
<pre>${errorMessage}</pre>
<form method="post">
    <label for="name"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="name" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <button type="submit">Login</button>
</form>
</body>
</html>