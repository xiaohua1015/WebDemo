<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2017/12/27
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Locale" %>
<html>
<head>
    <title>show</title>
</head>
<body>

    <%--//都说把ISO-8859-1转成UTF-8或乱码，奇怪我的就没有.....
    name参数的值为：<%= request.getParameter("name")%>
    sex参数值：<%= request.getParameter("sex")%>--%>

    <%
        Locale locale = request.getLocale();
        String hello = "";
        if(locale.equals(Locale.US)){
            hello = "hello, welcome to access ou company's web!";
        } else if(locale.equals(Locale.CHINA)){
            hello = "你好， 欢迎访问我们公司的网站";
        } else {
            hello = "请问：你是谁，你从哪里来，你要到哪里去";
        }

        String name = (String) session.getAttribute("name");
        request.setCharacterEncoding("UTF-8");
        String address = request.getParameter("address");
    %>

    <%= hello%>
    你的名字：<%= name%>
    你最喜欢去的地方：<%= address%>
    <%
        //response.setHeader("refresh", "5; URL=http://www.baidu.com");
    %>
</body>
</html>
