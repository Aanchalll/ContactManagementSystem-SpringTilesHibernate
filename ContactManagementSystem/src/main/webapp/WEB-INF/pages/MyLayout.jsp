<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="99%" height="99%" bgcolor="#c3d599">
<tr height="10%">
<td colspan="2" align="center">
<tiles:insertAttribute name="HEADER"/>
</td>
</tr>
<tr height="85%">
<td width="20%" valign="top">
<tiles:insertAttribute name="LMENU"/>
</td>
<td width="80%" valign="top">
<tiles:insertAttribute name="BODY"/>
</td>
</tr>
<tr height="5%">
<td colspan="2" align="center">
<tiles:insertAttribute name="FOOTER"/>
</td>
</tr>
</table>
</body>
</html>