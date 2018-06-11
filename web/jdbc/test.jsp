<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/11
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="batch" class="com.isdev.xiaohua.test.Batch"></jsp:useBean>
    <%
        int row = batch.saveBatch();
        out.print("批量插入了【" + row + "】条数据");
    %>
</body>
</html>
