
<!DOCTYPE html>
<html>
<head>

    <style>
        body {
            background-image: url('playstore.jpg'); /* Replace 'background.jpg' with the path to your image */
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            font-family: Arial, sans-serif;
            color: white;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        h2 {
            margin-top: 50px;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            font-size: 18px;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        a:hover {
            background-color: #0056b3;
        }

        nav a {
          margin-right: 20px; /* Adds spacing between links */
        }

        form input {
          padding: 5px;
          margin-left: 20px; /* Adds space between the last link and the search bar */
        }

        form button {
          padding: 5px 10px;
        }
nav a {
  margin-right: 20px; /* Adds spacing between the links */
  text-decoration: none; /* Removes underline from links */
  color: black; /* Changes link color */
}

form input {
  padding: 5px;
  margin-left: 20px; /* Adds space between the last link and the search bar */
}

form button {
  padding: 5px 10px;
  background-color: #4CAF50; /* Adds background color to the button */
  color: white; /* Button text color */
  border: none;
}

form {
  display: inline; /* Keeps the form inline with the navigation links */
}

    </style>
</head>
<header>
  <h2>User App</h2>
      <input type="text" placeholder="Search..." name="search">
      <button type="submit">Search</button>
    </form>
  </nav>
</header>


<body>

    <a href="form.jsp" target="_blank">Open Register</a>
     <a href="nextpage.html">Click to open the next page</a>
    <br>

    <a href = "getUser.jsp">Get User Info</a>
    <a href = "getUserName.jsp">GetUserName</a>
    <a href = "getAllUser">GetAllUser</a>
</body>
</html>



