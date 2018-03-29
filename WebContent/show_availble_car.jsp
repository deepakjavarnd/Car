<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.javarnd.beans.CarDTO"%>

<h3 align="center"><font color="Red">Availbel Cars</font> </h3>
<% List<CarDTO> data = (ArrayList<CarDTO>)request.getAttribute("list");%>
<table border="1">
<tr>
<td>CarId</td>
<td>CarName</td>
<td>CarType</td>
<td>CarColor</td>
<td>CarStatus</td>
<td>Action</td>
</tr>
<%for(CarDTO list:data){%>
<tr>
<td><%= list.getCarId()%></td>
<td><%=list.getCarName() %></td>
<td><%=list.getCarType()%></td>
<td><%=list.getCarColor()%></td>
<td><%=list.getStatus()%></td>
<td><a href="deleteCarAction?id=<%=list.getCarId()%>">delete</a></td>
<td><a href="updateCarDetailsAction?id=<%=list.getCarId()%>">update</a></td>
<td><a href="carStatusChangeAction?id=<%=list.getCarId()%>">Block</a></td>
<% }%>
</tr>
</table>
</html>