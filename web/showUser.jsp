<%@ page import="com.isdev.xiaohua.bean.UserInfoList" %>
<%@ page import="com.isdev.xiaohua.listener.UserInfoTrace" %>
<%@ page import="java.util.Vector" %>
<%@ page import="java.util.Objects" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2018/1/26
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示用户在线信息</title>
</head>
<body>
    <%
        UserInfoList userInfoList = UserInfoList.getInstance();
        UserInfoTrace userInfoTrace = new UserInfoTrace();

        String user = request.getParameter("user");

        userInfoTrace.setUser(user);

        session.setAttribute("list", userInfoTrace);
//        userInfoList.addUserInfo(user);
        session.setMaxInactiveInterval(10);

        Vector vector = userInfoList.getList();
        if(vector != null && vector.size()>0){
            for (int i=0; i<vector.size(); i++) {
                out.println(vector.get(i));
            }
        }
    %>
</body>
</html>
