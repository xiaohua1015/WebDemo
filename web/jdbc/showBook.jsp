<%@ page import="com.isdev.xiaohua.bean.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/30
  Time: 1:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示查询结果</title>
</head>
<body>
    <table align="center" width="450" border="1">
        <tr><td colspan="6" align="center"><h2>所有图书信息</h2></td></tr>
        <tr align="center">
            <td>ID</td>
            <td>书名</td>
            <td>价格</td>
            <td>数量</td>
            <td>作者</td>
            <td>修改数量</td>
        </tr>
        <%
            List<Book> list = (List<Book>) request.getAttribute("booklist");
            if (list == null || list.size()<=0) {
                out.println("没有图书数据");
            } else {
                for (Book book:list) {
        %>

        <%--这是一段神奇的代码 --%>
        <tr align="center">
            <td><%=book.getId() %></td>
            <td><%=book.getName() %></td>
            <td><%=book.getPrice() %></td>
            <td><%=book.getBookCount() %></td>
            <td><%=book.getAuthor() %></td>
            <td>
                <form action="/updateBookServlet" method="post" onsubmit="return check(this)">
                    <input type="hidden" name="id" value="<%=book.getId()%>">
                    <input type="text" name="bookCount" size="3">
                    <input type="submit" value="修改">
                </form>
            </td>
        </tr>
        <%
                }
            }
        %>
    </table>
    <center><a href="/jdbc/index.jsp">返回</a> </center>
</body>
</html>
