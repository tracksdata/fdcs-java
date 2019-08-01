<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">List of Products</h1>

	<hr />
	<jsp:include page="menu.jsp" />
	<hr />
	<table align="center" border=1 cellpadding="5" cellspaciong="5">

		<tr bgcolor="skyblue">
			<th>Product Id</th>
			<th>Product name</th>
			<th>Price</th>
			<th>Option1</th>
			<th>Option2</th>
		</tr>


		<c:forEach var="prod" items="${products}">

			<tr bgcolor="silver">
				<td><a href="getProduct?prodId=${prod.prodId}&option=find">${prod.prodId}</a> </td>
				<td>${prod.prodName}</td>
				<td>${prod.price}</td>
				<td><a href="getProduct?prodId=${prod.prodId}&option=update">Edit</a></td>
				<td><a href="removeProduct?prodId=${prod.prodId}">Remove</a> </td>
				
			</tr>

		</c:forEach>


	</table>





</body>
</html>