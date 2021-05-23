<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search Results</h2>
<c:if test="${EDIT eq 'FALSE'}">
<table>
<tr><td>Contact Id</td><td>${CTO.cid}</td></tr>
<tr><td>First Name</td><td>${CTO.fname}</td></tr>
<tr><td>Last Name</td><td>${CTO.lname}</td></tr>
<tr><td>Email Id</td><td>${CTO.email}</td></tr>
<tr><td>Phone</td><td>${CTO.phone}</td></tr>
</table>
<br/>
<a href="editContactSubmit.do">Edit Contact</a><br/>
</c:if>
<c:if test="${EDIT eq 'TRUE'}">
<form:form action="updateContactSubmit.do" commandName="contactCommand">
<table>
<tr>
<td>ContactID</td>
<td>${CTO.cid}<form:hidden path="cid" value="${CTO.cid}"/></td>
</tr>
<tr>
<td>First Name</td>
<td><form:input path="fname" value="${CTO.fname}"/></td>
<td><font color="red" size=4><form:errors path="fname"/></font></td>
</tr>
<tr>
<td>Last Name</td>
<td><form:input path="lname" value="${CTO.lname}"/></td>
<td><font color="red" size=4><form:errors path="lname"/></font></td>
</tr>
<tr>
<td>Email Id</td>
<td><form:input path="email" value="${CTO.email}"/></td>
<td><font color="red" size=4><form:errors path="email"/></font></td>
</tr>
<tr>
<td>Phone</td>
<td><form:input path="phone" value="${CTO.phone}"/></td>
<td><font color="red" size=4><form:errors path="phone"/></font></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Update Contact"/>
</td>
</tr>
</table>
</form:form>
</c:if>
</body>
</html>