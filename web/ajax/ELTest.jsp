<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/12
  Time: 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<body>
    <%--<%
        String[] books = {"Java Web开发", "JavaScript开发", "JSP开发"};
        request.setAttribute("books", books);
        String[] bookList = (String[]) request.getAttribute("books");
        for (int i=0; i<bookList.length; i++) {
            request.setAttribute("index", i);
    %>
        ${index}: ${books[index]}<br/>
    <%
        }
    %>--%>

    <%
        List list = new ArrayList<String>();
        list.add("苹果");
        list.add("香蕉");
        list.add("水蜜桃");
        list.add("凤梨");
        session.setAttribute("fruitList", list);
        List fruitList = (List) session.getAttribute("fruitList");
        for(int i=0; i<fruitList.size(); i++) {
            request.setAttribute("index", i);
    %>
        ${index} : ${fruitList[index]}<br/>
    <%
        }
    %>
    <%
        request.setAttribute("userName", "xiaohua");
        request.setAttribute("password", "root");
    %>
    \${userName !="" and (userName == "明日")}<br>
    ${userName !="" and (userName == "明日")}<br>

    ${pageContext.request.serverPort}<br>
    ${pageContext.response.contentType}<br>
    ${pageContext.out.bufferSize}<br>
    ${pageContext.session.maxInactiveInterval}<br>
    ${pageContext.exception.message}<br>
    ${pageContext.page}<br>
    ${pageContext.servletContext.contextPath}<br>


    <jsp:useBean id="user" class="com.isdev.xiaohua.bean.UserInfo" scope="page">
        <jsp:setProperty name="user" property="name" value="小华"/>
    </jsp:useBean>

    ${pageScope.user.name}
</body>
</html>
