<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
   <%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

<form action = "getUserName">
Enter Id : <input type = "text" name = "id"> </br>
<br>
Enter UserName : <input type = "text" name = "userName"> </br>
<input type = "SUBMIT" value = "Search"></br>

</form>
<table>
<tr>
<th>Sl.No</th>
<th>User First Name</th>
<th>User Email</th>
<th>User Number</th>
<th>User Address</th>
<tr>
<td>${ dtos.id }</td>
<td>${ dtos.getUserName() }</td>
<td>${ dtos.getEmail() }</td>
<td>${ dtos.getNumber() }</td>
<td>${ dtos.getAddress() }</td>

</tr>
</table>
</body>
</html>