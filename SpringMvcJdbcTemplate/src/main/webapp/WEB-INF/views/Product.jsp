<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Details Home</title>
    </head>
    <body>
    	<div align="center">
	        <h1>Products List</h1>
	        <h3><a href="newContact">New Product Add</a></h3>
	        <table border="1">
	        	<th>Product Id</th>
	        	<th>Product Title</th>
	        	<th>Product Prise</th>
	        	<th>Product Quantity</th>
	        	<th>Product Descrition</th>
				<c:forEach var="Product" items="${productlist}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${Product.productId}</td>
					<td>${Product.productTitle}</td>
					<td>${Product.productPrice}</td>
					<td>${Product.productQuantity}</td>
					<td>${Product.productDesripton}</td>
					<td>
						<a href="editContact?id=${Product.productId}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteContact?id=${Product.productId}">Delete</a>
					</td>
							
	        	</tr>
				</c:forEach>	        	
			</table>
    	</div>
    </body>
</html>
