<%@ page import="com.isdev.xiaohua.bean.Book" %>
<%@ page import="java.util.List" %><%--
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
    <jsp:useBean id="batch" class="com.isdev.xiaohua.utils.Batch"></jsp:useBean>
    <jsp:useBean id="findBook" class="com.isdev.xiaohua.utils.FindBook"></jsp:useBean>
    <%
//        int row = batch.saveBatch();
//        out.print("批量插入了【" + row + "】条数据");

        List bookList = findBook.findBook();
        if (bookList!=null && bookList.size()>0) {
            request.setAttribute("booklist", bookList);
            request.getRequestDispatcher("/jdbc/showBook.jsp").forward(request, response);
        } else {
    %>
    没有任何数据
    <%
        }
    %>
</body>
</html>
