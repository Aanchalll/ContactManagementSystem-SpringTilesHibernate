<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>  
<body>
<form:form action="addContactSubmit.do" commandName="contactCommand">
<table>
<tr>
<td>First Name</td>
<td><form:input path="fname"/></td>
<td><font color="red" size=4><form:errors path="fname"/></font></td>
</tr>
<tr>
<td>Last Name</td>
<td><form:input path="lname"/></td>
<td><font color="red" size=4><form:errors path="lname"/></font></td>
</tr>
<tr>
<td>EmailId</td>
<td><form:input path="email"/></td>
<td><font color="red" size=4><form:errors path="email"/></font></td>
</tr>
<tr>
<td>Phone</td>
<td><form:input path="phone"/></td>
<td><font color="red" size=4><form:errors path="phone"/></font></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="ADD Contact"/></td>
</tr>
</table>
</form:form>
</body>
</html>