<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table, td {
  border: 1px solid black;
  border-style=dotted;
  padding: 1px;
}
/* table {
  border-spacing: 1px;
} */
</style>

</head>
<body id="myDIV">
<table width="99%" height="99%" bgcolor="#e6ffff">
<tr height="10%">
<td colspan="2" align="center">
<tiles:insertAttribute name="HEADER"/>
</td>
</tr>
<tr height="100%">
<td width="20%" align="left">
<tiles:insertAttribute name="LMENU"/>
</td>
 <td  width="100%" align="justify">
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