<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
   <%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Play Store Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #1e3c72, #2a5298); /* Add a gradient background */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            padding: 0;
            color: #fff;

        }

        .message-container {
            text-align: center;
        }

        h2 {
            font-size: 2.5rem;
            margin: 0;
            padding: 10px;
            animation:rotate 5sc;
        }

        p {
            font-size: 1.2rem;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="message-container">
       <h2>Thank You ${ key } for Registering</h2>
          <h2>details of login ${ value } for Registering</h2>

        <p>my content add will be successfully. Have a great day!</p>
    </div>
</body>
</html>
