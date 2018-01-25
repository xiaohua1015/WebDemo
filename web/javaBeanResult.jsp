<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2018/1/24
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示个人信息</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");

    %>

    <jsp:useBean id="person" class="com.isdev.xiaohua.bean.Person" scope="page">
        <jsp:setProperty name="person" property="name" param="name"/>
    </jsp:useBean>
    <%--<table align="center" width="400" height="200" border="1">
        <tr>
            <td align="center" colspan="2" height="40"><b>添加用户信息</b></td>
        </tr>
        <tr>
            <td align="right">姓名：</td>
            <td><jsp:getProperty name="person" property="name"/></td>
        </tr>
        <tr>
            <td align="right">年龄：</td>
            <td><jsp:getProperty name="person" property="age"/></td>
        </tr>
        <tr>
            <td align="right">性别：</td>
            <td><jsp:getProperty name="person" property="sex"/></td>
        </tr>
        <tr>
            <td align="right">住址：</td>
            <td><jsp:getProperty name="person" property="add"/></td>
        </tr>
        <tr><td align="center" colspan="2"><input type="submit" value="添加"/></td></tr>
    </table>--%>

    <jsp:useBean id="news" class="com.isdev.xiaohua.bean.News"/>
    <jsp:useBean id="utils" class="com.isdev.xiaohua.bean.Utils"/>
    <jsp:setProperty name="news" property="*"/>

    <%--<div align="center">
        <div id="container">
            <div id="title">
                <%= news.getTitle()%>
            </div>
            <hr>
            <div id="content">
                <%= news.getContent()%>
            </div>
        </div>
    </div>--%>

    <jsp:useBean id="paper" class="com.isdev.xiaohua.bean.Paper"/>
    <jsp:setProperty name="paper" property="*"/>
    <div>
        <h1>调查结果</h1>
        <hr/>
        <ul>
            <li>你经常使用的语言：<%= utils.arr2Str(paper.getLanguages())%></li>
            <li>你目前所掌握的技术：<%= utils.arr2Str(paper.getTechnics())%></li>
            <li>在学习中感觉有困难的地方：<%= utils.arr2Str(paper.getParts())%></li>
        </ul>
    </div>

</body>
</html>
