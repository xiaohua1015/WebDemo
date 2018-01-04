<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2017/12/28
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        session.setAttribute("name", name);
    %>

    <form id="form" name="form" method="post" action="show.jsp">
        <div align="center">
            你的名字：<%= name%>
            你想去的地方：<input type="text" name="address"/><input type="submit" name="submit" value="提交">
        </div>
    </form>
</body>
</html>
