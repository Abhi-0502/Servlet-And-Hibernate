
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Play Store Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('playapp.jpeg'); /* Replace with your image file */
            background-size: cover;
            background-position: center;
            margin: 0;
            padding: 0;
            color: #fff;
        }
        .navbar {
            display: flex;
            justify-content: space-around;
            background-color: rgba(0, 0, 0, 0.8);
            padding: 10px 0;
        }
        .navbar a {
            text-decoration: none;
            color: #fff;
            padding: 10px 20px;
            font-size: 16px;
        }
        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }
        .container {
            max-width: 500px;
            margin: 50px auto;
            background: rgba(0, 0, 0, 0.7);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        h2 {
            text-align: center;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], input[type="date"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .playstore-images {
            text-align: center;
            margin-top: 20px;
        }
        .playstore-images img {
            max-width: 100px;
            margin: 10px;
        }
        .next-page {
            text-align: center;
            margin-top: 20px;
        }
        .next-page a {
            text-decoration: none;
            color: #4CAF50;
            font-size: 16px;
        }
    </style>
</head>
<body>

<!-- Navigation Bar -->
<div class="navbar">
    <a href="https://play.google.com/store" target="playapp.jpeg">Play Store Home</a>
    <a href="https://play.google.com/store/apps" target="app-icon-cover.jpg">Apps</a>
    <a href="https://play.google.com/store/movies" target="movies.png">Movies</a>
    <a href="https://play.google.com/store/books" target="books.jpg">Books</a>
</div>

<!-- Login Form -->
<div class="container">
    <h2>Login Details</h2>
    <form action="login" method="get" id="loginForm">
        <label for="userName">Given Name:</label>
        <input type="text" name="userName" required>

        <label for="surName">Surname:</label>
        <input type="text" name="surName">

        <label for="dob">Date of Birth:</label>
        <input type="date" name="dob" required>

        <label for="gender">Gender:</label>
        <select name="gender" required>
            <option value="">Select Gender</option>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select>

        <label for="email">Email:</label>
        <input type="email" name="email" required>

        <label for="number">Phone Number:</label>
        <input type="text" name="number" required>

        <label for="pwd">Password:</label>
        <input type="password" name="pwd" id="password" required>

        <label for="confirmPwd">Confirm Password:</label>
        <input type="password" name="confirmPwd" id="confirmPassword" required>

        <label for="hideAns">Hide Answer:</label>
        <input type="text" name="hideAns">

        <label for="captcha">Captcha:</label>
        <input type="text" name="captcha" required>

        <input type="submit" value="SUBMIT">
    </form>

    <div id="errorMessage" style="color: red; display: none;">Passwords do not match!</div>
</div>

<script>
    // Password and Confirm Password Validation
    document.getElementById('loginForm').addEventListener('submit', function(event) {
        var password = document.getElementById('password').value;
        var confirmPassword = document.getElementById('confirmPassword').value;

        if (password !== confirmPassword) {
            event.preventDefault();  // Prevent form submission
            document.getElementById('errorMessage').style.display = 'block'; // Show error message
        } else {
            document.getElementById('errorMessage').style.display = 'none'; // Hide error message if passwords match
        }
    });
</script>


<!-- Next Page Link -->
<div class="next-page">
    <a href="nextPage.html">Click here to open the next page</a>
</div>


</body>
</html>

