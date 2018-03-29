<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.javarnd.beans.CustomerDTO"%>

<h3 align="center"><font color="Red">Customer Detials</font> </h3>
<% List<CustomerDTO> data = (ArrayList<CustomerDTO>)request.getAttribute("list");%>
<table border="1">
<tr>
<td>CustomerId</td>
<td>CcustomerName</td>
<td>CustomerContact</td>
<td>CostomerAddress</td>
<td>CustomerStatus</td>
<td>Action</td>
</tr>
<%for(CustomerDTO list:data){%>
<tr>
<td><%= list.getCustomerId()%></td>
<td><%=list.getCustomerName() %></td>
<td><%=list.getCustomerContact()%></td>
<td><%=list.getCustomerAddress()%></td>
<td><%=list.getCustomerStatus()%></td>
<td><a href="deleteCustomerAction?id=<%=list.getCustomerId()%>">delete</a></td>
<td><a href="updateCarDetailsAction?id=<%=list.getCustomerId()%>">update</a></td>
<td><a href="customerStatusChangeAction?id=<%=list.getCustomerId()%>">Block</a></td>
<% }%>
</tr>
</table>
</html>