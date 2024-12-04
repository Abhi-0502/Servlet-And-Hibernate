<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
   <%@page isELIgnored = "false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="con" %>
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

<form action = "getAllUser">
Enter Id : <input type = "text" name = "id"> </br>
<br>
Enter UserName:<input type = "text" name = "userName"></br>
<br>
<input type = "SUBMIT" value = "Search"></br>

</form>
<table>
<tr>
<th>Sl.No</th>
<th>User First Name</th>
<th>Email</th>
<th>Number</th>
<th>Address</th>
</tr>
<con:forEach var = "dto" items="${ listOfDetails }">
<tr>
<td>${ dto.getId() }</td>
<td>${ dto.getUserName() }</td>
<td>${ dto.getEmail() }</td>
<td>${ dto.getNumber() }</td>
<td>${ dto.getAddress() }</td>
</tr>
</con:forEach>
</table>
</body>
</html>