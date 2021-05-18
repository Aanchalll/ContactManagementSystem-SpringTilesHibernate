<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>AS</h1>
<h2>Search Contact Form</h2>
<font color="red" size=4>${NOT_FOUND}</font>
<form:form action="searchContactSubmit.do" commandName="searchContactCommand">
<table>
<tr>
<td>Enter Email Id</td>
</tr>
<tr>
<td><form:input path="email"/></td>
</tr>
<tr>
<td><font color="red" size=4><form:errors path="email"/></font></td>
</tr>
<tr>
<td><input type="submit" value="Search Contact"></td>
</tr>
</table>
</form:form>
</body>
</html>