<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp" />
<hr/>

<form action="processProduct?menu=save" method="post">

<table align="center">

<tr>
	<td>Product Id</td>
	<td><input type="text" name="prodId">
</tr>

<tr>
	<td>Product Name</td>
	<td><input type="text" name="prodName">
</tr>

<tr>
	<td>Price</td>
	<td><input type="text" name="price">
</tr>

<tr>
	<th colspan="2">
		<input type="submit" value="Save">
	</th>
</tr>

</table>

</form>

</body>
</html>