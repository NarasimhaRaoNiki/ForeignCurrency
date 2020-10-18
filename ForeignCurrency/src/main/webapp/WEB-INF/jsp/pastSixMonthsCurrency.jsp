<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<h2>Historical Exchange Rates For USA UK and HK </h2>

	<div align="left">
		<table border="1" cellpadding="5">
			<caption>
				<h2>Past Six Months</h2>
			</caption>
			<tr>
				<th>CURRENCY</th>
				<th>Month1</th>
				<th>Month2</th>
				<th>Month3</th>
				<th>Month4</th>
				<th>Month5</th>
				<th>Month6</th>
			</tr>
			<c:forEach var="currency" items="${currencyObj}">

				<tr>
					<td><c:out value="HK" /></td>
					<td><c:out value="${currency.getHk()[0]}" /></td>
					<td><c:out value="${currency.getHk()[1]}" /></td>
					<td><c:out value="${currency.getHk()[2]}" /></td>
					<td><c:out value="${currency.getHk()[3]}" /></td>
					<td><c:out value="${currency.getHk()[4]}" /></td>
					<td><c:out value="${currency.getHk()[5]}" /></td>
				</tr>

			</c:forEach>
			<c:forEach var="currency" items="${currencyObj}">

				<tr>
					<td><c:out value="UK" /></td>
					<td><c:out value="${currency.getUk()[0]}" /></td>
					<td><c:out value="${currency.getUk()[1]}" /></td>
					<td><c:out value="${currency.getUk()[2]}" /></td>
					<td><c:out value="${currency.getUk()[3]}" /></td>
					<td><c:out value="${currency.getUk()[4]}" /></td>
					<td><c:out value="${currency.getUk()[5]}" /></td>
				</tr>

			</c:forEach>
			<c:forEach var="currency" items="${currencyObj}">

				<tr>
					<td><c:out value="USA" /></td>
					<td><c:out value="${currency.getUsa()[0]}" /></td>
					<td><c:out value="${currency.getUsa()[1]}" /></td>
					<td><c:out value="${currency.getUsa()[2]}" /></td>
					<td><c:out value="${currency.getUsa()[3]}" /></td>
					<td><c:out value="${currency.getUsa()[4]}" /></td>
					<td><c:out value="${currency.getUsa()[5]}" /></td>
				</tr>

			</c:forEach>
		</table>
	</div>
</body>
</html>