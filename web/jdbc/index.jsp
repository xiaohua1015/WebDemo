<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
    <form action="/addBookServlet" method="post" >
        <table align="center" width="450">
            <tr><td align="center" colspan="2"><h2>加图书信息</h2><hr></td></tr>
            <tr>
                <td>图书名称：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>图书价格：</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>图书数量：</td>
                <td><input type="text" name="bookCount"></td>
            </tr>
            <tr>
                <td>图书作者：</td>
                <td><input type="text" name="author"></td>
            </tr>
            <tr><td align="center" colspan="2"><input type="submit" value="提交"/></td></tr>
        </table>
    </form>
    <center><a href="/findBookServlet">查询所有图书</a></center>
</body>
</html>
