<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table, th, td {
  border: 1px solid black;
  padding: 5px;
}
table {
  border-spacing: 1px;
}
</style>
</head>
<body>
<h2>Your information have been saved successfully!</h2>
<table>
<tr><td>Contact Id</td><td>${CTO.cid}</td></tr>
<tr><td>First Name</td><td>${CTO.fname}</td></tr>
<tr><td>Last Name</td><td>${CTO.lname}</td></tr>
<tr><td>Email Id</td><td>${CTO.email}</td></tr>
<tr><td>Phone</td><td>${CTO.phone}</td></tr>
</table>
</body>
</html>