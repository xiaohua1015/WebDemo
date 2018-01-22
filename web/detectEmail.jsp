<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2018/1/22
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>检测email的合法性</title>
</head>
<body>
    <form action="detectEmailResult.jsp" method="post">
        <table align="center" width="300" border="1" height="150">
            <tr>
                <td colspan="2" align="center">
                    <b>邮箱确认系统</b>
                </td>
            </tr>
            <tr>
                <td align="right">邮箱地址：</td>
                <td><input type="text" name="mailAdd"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
