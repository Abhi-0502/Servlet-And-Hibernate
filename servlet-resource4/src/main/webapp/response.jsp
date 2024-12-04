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
            background: linear-gradient(to right, #1e3c72, #2a5298); /* Gradient background */
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
            animation: fadeIn 2s ease-in-out;
        }

        h2 {
            font-size: 2.5rem;
            margin: 0;
            padding: 10px;
            animation: slideIn 1.5s ease-in-out;
        }

        p {
            font-size: 1.2rem;
            margin-top: 10px;
            animation: fadeIn 2.5s ease-in-out;
        }

        /* Keyframes for animations */
        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }

        @keyframes slideIn {
            from {
                transform: translateY(-50px);
                opacity: 0;
            }
            to {
                transform: translateY(0);
                opacity: 1;
            }
        }
    </style>
</head>
<body>
    <div class="message-container">
        <h2>Thank You ${ key } for Registering</h2>
        <h1> LoginDetails added ${ value } </h1>
        <p>My content add will be successfully. Have a great day!</p>
    </div>
</body>
</html>
