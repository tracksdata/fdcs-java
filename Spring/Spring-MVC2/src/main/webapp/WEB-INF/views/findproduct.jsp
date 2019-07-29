<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Product Find Page</h1>
	<jsp:include page="menu.jsp" />
	<hr />

	<form:form action="loadProduct" method="post" modelAttribute="prod">


		<table align="center">
			<tr>
				<td>Product Id</td>
				<td><form:select path="prodId">
						<form:options items="${prod.ids}" />

					</form:select></td>
			</tr>

			<tr>
				<th colspan="2"><input type="submit" value="Find"></th>
			</tr>

		</table>
	</form:form>

	<hr />

	<c:if test="${product ne null}">

		<table align="center" cellpadding="5" cellspacing="5">
			<tr bgcolor="skyblue">
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Price</th>
			</tr>

			<tr bgcolor="orange">
				<td>${product.prodId}</td>
				<td>${product.prodName}</td>
				<td>${product.price}</td>
			</tr>
		</table>


	</c:if>





</body>
</html>