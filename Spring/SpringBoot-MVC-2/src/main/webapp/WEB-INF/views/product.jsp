

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Product Info</h1>

	<hr />
	<jsp:include page="menu.jsp" />
	<hr />
	<table align="center" border=1 cellpadding="5" cellspaciong="5">

		<tr bgcolor="skyblue">
			<th>Product Id</th>
			<th>Product name</th>
			<th>Price</th>
		</tr>



		<tr bgcolor="silver">
			<td>${prod.prodId}</td>
			<td>${prod.prodName}</td>
			<td>${prod.price}</td>
		</tr>




	</table>





</body>
</html>