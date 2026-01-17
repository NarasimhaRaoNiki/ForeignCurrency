<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>


    <div align="center">
        <table border="1" cellpadding="5">
            <h2>Present Month Currency Info</h2>
            <tr>
                <th>CURRENCY</th>
                <th>Month1</th>
                
            </tr>
            <c:forEach var="currency" items="${currencyObj}">
            <tr>
                    <td><c:out value="UK"/></td>
                    <td><c:out value="${currency.rates.GBP}" /></td>
            </tr>
                <tr>
                    <td><c:out value="USA" /></td>
                    <td><c:out value="${currency.rates.USD}" /></td>
                </tr>
                 <tr>
                    <td><c:out value="HK" /></td>
                    <td><c:out value="${currency.rates.HKD}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
  
    <div>
    <center>
    
    <form action="last-sixmonths-info" method="get">
    <input type="submit" name="button1" value="Check LastSixMonths Currency Info" />
</form>
    </center>
    </div>
</body>
</html>