<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2018/1/24
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP中使用JavaBean</title>

    <style type="text/css">
        #clock{
            width: 450px;
            height: 80px;
            background: #E0E0E0;
            font-size: 25px;
            font-weight: bold;
            border: solid 5px orange;
            padding: 20px;
        }

        #week{
            padding-top: 15px;
            color: #0080FF;
        }
    </style>
</head>
<body>

    <form action="generalServlet" method="post">
    <table align="center" width="400" height="200" border="1">
        <tr>
            <td align="center" colspan="2" height="40"><b>添加用户信息</b></td>
        </tr>
        <tr>
            <td align="right">姓名：</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td align="right">年龄：</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td align="right">性别：</td>
            <td><input type="text" name="sex"/></td>
        </tr>
        <tr>
            <td align="right">住址：</td>
            <td><input type="text" name="add"/></td>
        </tr>
        <tr><td align="center" colspan="2"><input type="submit" value="添加"/></td></tr>
    </table>

    <%--<table align="center" width="450" height="250" border="1">
        <tr><td align="center" colspan="2" height="40"><b>新闻发布</b></td></tr>
        <tr>
            <td align="center">标题：</td>
            <td><input type="text" name="title" size="30"></td>
        </tr>
        <tr>
            <td align="center">内容：</td>
            <td><textarea name="content" rows="8" cols="40"></textarea></td>
        </tr>
        <tr><td align="center" colspan="2"><input type="submit" value="发布"/></td></tr>
    </table>--%>
</form>

    <jsp:useBean id="date" class="com.isdev.xiaohua.bean.DataBean"/>

    <div align="center">
        <div id="clock">
            <div id="time">
                <jsp:getProperty name="date" property="dateTime"/>
            </div>

            <div id="week">
                <jsp:getProperty name="date" property="week"/>
            </div>
        </div>
    </div>

    <%--<form action="javaBeanResult.jsp" method="post">
        <div>
            <h1>问卷调查</h1>
            <hr/>
            <ul>
                <li>你经常用那些编程语言开发程序：</li>
                <li>
                    <input type="checkbox" name="languages" value="java">JAVA
                    <input type="checkbox" name="languages" value="php">PHP
                    <input type="checkbox" name="languages" value=".net">.NET
                    <input type="checkbox" name="languages" value="vc++">VC++
                </li>
            </ul>
            <ul>
                <li>你目前掌握的技能：</li>
                <li>
                    <input type="checkbox" name="technics" value="html">HTML
                    <input type="checkbox" name="technics" value="java bean">JAVA BEAN
                    <input type="checkbox" name="technics" value="jsp">JSP
                    <input type="checkbox" name="technics" value="servlet">SERVLET
                </li>
            </ul>
            <ul>
                <li>在学习中那一部分感觉有困难：</li>
                <li>
                    <input type="checkbox" name="parts" value="jsp">JSP
                    <input type="checkbox" name="parts" value="struct">STRUCT
                </li>
            </ul>
            <input type="submit" value="提交">
        </div>
    </form>--%>


</body>
</html>
