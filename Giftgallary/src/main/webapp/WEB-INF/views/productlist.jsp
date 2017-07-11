<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
</head>
<body>
</br>
</br>
<h4>The List of Products</h4>
<div class="container">
<table class="table table-striped">
<thead>
<tr><th>ID</th><th>Name</th><th>Description</th><th>Quantity</th><th>Price</th></tr>
</thead>
<tbody>
<c:forEach items="${products}" var="p">
<tr><td>${p.id}</td><td>${p.productName}</td><td>${p.description}</td><td>${p.quantity}</td><td>${p.price}</td></tr>
</c:forEach>
</tbody>
</table>

</div>
</body>
</html>

</br>
<%@ include file="footer.jsp" %>