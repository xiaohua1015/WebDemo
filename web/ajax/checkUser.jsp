<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/12
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>checkUser</title>
</head>
<body>
    <%
        String[] userList = {"小华", "小红", "小明", "小雷"};
        String user = request.getParameter("user");
        System.out.println("user = " + user);
        Arrays.sort(userList);
        int result = Arrays.binarySearch(userList, user);
        if (result > -1) {
            out.println("对不起，该用户已经被注册");
        } else {
            out.println("该用户可用");
        }
    %>
</body>
</html>
