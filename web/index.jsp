<%--
  Created by IntelliJ IDEA.
  User: Fadi
  Date: 19-Apr-17
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home page</title>
  </head>
  <body>
  <h1>Hello</h1>
  <form action="${pageContext.request.contextPath}/controller" method="post">
      <%--<select name="item">--%>
          <%--<option value="1">One</option>--%>
          <%--<option value="2">Two</option>--%>
          <%--<option value="3">Three</option>--%>
      <%--</select>--%>
          <input type="text" name="item">
      <button type="submit" name="button" value="submit">Submit</button>
  </form>
  </body>
</html>
