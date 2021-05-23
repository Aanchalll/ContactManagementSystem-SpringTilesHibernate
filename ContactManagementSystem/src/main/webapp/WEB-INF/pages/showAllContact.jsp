<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<h1>All Contacts : </h1>
<table style="width:100%">
             <thead>
					<tr>
						<th>Client ID</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Phone Number</th>
					</tr>
			</thead>
			
   <tbody>
    <c:forEach var="user" items="${AllCONTACTS}">
      <tr>
	        <td><c:out value="${user.cid}" /></td>
    		<td><c:out value="${user.fname}" /></td>
    		<td><c:out value="${user.lname}" /></td>
			<td><c:out value="${user.email}" /></td>
			<td><c:out value="${user.phone}" /></td>
      </tr>
    </c:forEach>
   </tbody>

</table>

</body>
</html>