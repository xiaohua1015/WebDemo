<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/12
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%--<%@ taglib prefix="xml" uri="http://java.sun.com/jsp/jstl/xml"%>--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>应用&lt;c:out&gt;JSTL标签</title>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8"/>
</head>
<body>
    escape属性为true时：
    <c:out value="水平线标记<br>" escapeXml="true"></c:out>
    <br>
    escape属性为fals时：
    <c:out value="水平线标记<br>" escapeXml="false"></c:out>

    <c:set var="username" value="小华" scope="request"/>
    <c:out value="username的值为：${username}"/>
    <li>设置userinfo的name属性：</li>
    <c:remove var="username"/>
    <jsp:useBean id="userInfo" class="com.isdev.xiaohua.bean.UserInfo"/>
    <c:set value="${username}" target="${userInfo}" property="name"/>
    <c:out value="userInfo的name属性为：${userInfo.name}" default="空"/><br>
    <c:out value="userInfo的name属性为：${username}" default="空"/>
</body>
</html>
