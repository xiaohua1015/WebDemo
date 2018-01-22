<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2018/1/22
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.isdev.xiaohua.bean.Email" %>
<html>
<head>
    <title>邮箱验证结果</title>
</head>
<body>
    <%
        String mailAdd = request.getParameter("mailAdd");
        Email email = new Email(mailAdd);
        if(email.isEmail()){
            out.print(mailAdd + "是一个标准的邮箱地址！");
        } else {
            out.print(mailAdd + "不是一个标准的邮箱地址！");
        }
    %>

    <form action="GeneralServlet" method="post">
        <button type="submit">返回首页</button>
    </form>
</body>
</html>
