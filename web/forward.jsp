<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2017/12/25
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>跳转</title>
</head>
<body>
    <%
        request.setAttribute("content", "很抱歉，页面内容为空！");
    %>

    //请求转发
    <%--<jsp:forward page="index.jsp">--%>
        <%--<jsp:param name="arg" value="xiaohua"/>--%>
    <%--</jsp:forward>--%>

    //重定向
    <%--<%--%>
        <%--response.sendRedirect("http://www.baidu.com");--%>
    <%--%>--%>
</body>
</html>
