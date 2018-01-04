<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2017/12/27
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>写入cookie</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String user = URLEncoder.encode(request.getParameter("user"), "utf-8");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String today = sdf.format(date);
        Cookie cookie = new Cookie("mrCookie", user + "#" + today);

        cookie.setMaxAge(60);
        response.addCookie(cookie);
    %>

    <script type="text/javascript">
        window.location.href="index.jsp" //当前页面打开index.jsp页面，localtion.href属性返回当前页面的URL
    </script>
</body>
</html>
