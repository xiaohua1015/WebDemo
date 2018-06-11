<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/9
  Time: 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript">
        let httpRequest = false;
        function createHttpRequest() {
            if (window.XMLHttpRequest){
                httpRequest = new XMLHttpRequest();
            } else if (window.ActiveXObject) {
                try {
                    httpRequest = new ActiveXObject("Msxml2.XMLHTTP");
                } catch (e) {
                    try {
                        httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
                    } catch (e) {}
                }
            }

            if (!httpRequest) {
                alert("不能创建httprequest对象实例！！！");
                return false;
            } else {
                // alert("创建成功");
            }
            console.log("1214");
            httpRequest.onreadystatechange = getResult;
            httpRequest.open("GET", "http://localhost:8080/testServlet", true);
            httpRequest.send(null);
        }

        function getResult() {
            console.log("getResult");
            if (httpRequest) {
                console.log("httpRequest");
            }
            if (httpRequest.readyState == 4) {
                console.log("readyState");
                if (httpRequest.status == 200) {
                    console.log(httpRequest.responseText);
                } else {
                    console.log(httpRequestp.statusText);
                }
            } else {
                console.log("readyState = ", httpRequest.readyState);
            }
        }
    </script>
</head>
<body>
    <h1>我的第一个标题</h1>
    <form method="get" onsubmit="createHttpRequest()">
        <input type="submit" name="submit">
    </form>
</body>
</html>
