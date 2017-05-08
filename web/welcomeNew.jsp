<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Fadi
  Date: 19-Apr-17
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Test JSP</title>
    <link rel="stylesheet" type="text/css" href="table.css">
</head>
<body>

<table>
    <c:forEach items="${countries}" var="country">
        <tr>
            <%--<td><c:out value="${country.abbr}" /></td>--%>
            <td><c:out value="${country.name}" /></td>
        </tr>
    </c:forEach>
</table>
<%--<c:forEach var="messageItem" items="${myWelcomeArray}">--%>
    <%--<c:out value="${messageItem}"></c:out>--%>
<%--</c:forEach>--%>
    <%--<%--%>
    <%--String [] welcomeArray = (String []) request.getAttribute("myWelcomeMessage");--%>
    <%--String finalMessage = "";--%>
    <%--for (String s : welcomeArray)--%>
    <%--{--%>
        <%--finalMessage += s + " ";--%>
    <%--}--%>
    <%--out.print(finalMessage);--%>
    <%--%>--%>
</body>
</html>
