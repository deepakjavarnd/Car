<%@page errorPage="error.jsp" import="com.javarnd.beans.GenericCarBookDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center"><font color="Red">Invoice for Booking</font> </h3>
<% GenericCarBookDTO modelData = (GenericCarBookDTO)request.getAttribute("modelData");%>
<table border="1">
<tr>
<td>OrderNo</td>
<td>CarName</td>
<td>Charge</td>
<tr>
<td><%= modelData.getBookId()%></td>
<td><%=modelData.getCarName()%></td>
<td><%=modelData.getCharge()%></td>
</tr>
</table>
</body>
</html>