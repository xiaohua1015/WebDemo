<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2017/12/21
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLDecoder" %>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <title>一个简单的JSP页面——显示系统时间</title>
  </head>
  <body>
  //我擦不能用吗？
  <%
//    Date date = new Date();
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    String today = sdf.format(date);
    int temp =100;
  %>

  <%!
    /**
     * 这个一点不科学
     */
    int tmp = 111;
    int count(){
        return 10;
    }
  %>

  当前时间：<%=temp%>
  tmp：<%=tmp%>
  parma: <%= request.getParameter("arg")%>
  content: <%= request.getAttribute("content")%>
  <%
    Cookie[] cookies = request.getCookies();
    String result ;
    String user = "";
    String date = "";
    if(cookies == null) {
        result = "cookies is null";
    } else {
        for(int i=0; i<cookies.length; i++){
            if(cookies[i].getName().equals("mrCookie")) {
                user = URLDecoder.decode(cookies[i].getValue().split("#")[0]);
                date = cookies[i].getValue().split("#")[1];
            }
        }
    }

    if(user.isEmpty() || date.isEmpty()) {
  %>
    游客你好，欢迎初次光临！
    <form action="deal.jsp" method="post">
      请输入姓名：<input name="user" type="text" value="">
      <input type="submit" value="确定" />
    </form>

    <h2>你是本网站的第【<%= application.getAttribute("count")%>】位访客！</h2>
  <%}else{%>
    欢迎【<b><%= user%></b>】再次光临
    您注册的时间是：<%= date%>
  <%}%>
  </body>
</html>
