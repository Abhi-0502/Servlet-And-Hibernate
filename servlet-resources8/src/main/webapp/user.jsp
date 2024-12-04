
<!DOCTYPE html>
<html>
<head>
<style>
    body {
        background-image: url('background.jpg');
        background-size: cover;
        background-repeat: no-repeat;
        background-attachment: fixed;
        font-family: Arial, sans-serif;
    }

    form {
        background: rgba(255, 255, 255, 0.8); /* Adds a semi-transparent white background to the form */
        padding: 20px;
        border-radius: 10px;
        max-width: 400px;
        margin: 50px auto; /* Centers the form */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); /* Adds a shadow effect */
    }

    input[type="text"], input[type="submit"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        cursor: pointer;
        font-weight: bold;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<h2 style="text-align: center; color: black;">PlayStore Login Details</h2>
<form action="login" method="post">
<br>
Name:<input type = "text" name = "userName"></br>
<br>
Email:<input type = "text" name = "email"></br>
<br>
Phone Number:<input type = "text" name = "number"></br>
<br>
Address:<input type = "text" name = "address"></br>
<br>
<input type = "submit" value= "SUBMIT"><br>
</form>
</body>
</html>
