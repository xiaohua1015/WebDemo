<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/12
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AJAXDemo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript">
        var httpRequest = null;
        function createHttpRequest() {
            if(window.XMLHttpRequest) {
                httpRequest = new XMLHttpRequest();
            } else if(window.ActiveXObject) {
                try {
                    httpRequest = new ActiveXObject("Msxml2.XMLHTTP");
                } catch (e) {
                    try {
                        httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
                    } catch (e) {}
                }
            }
            if (!httpRequest) {
                alert("不能创建XMLHttpRequest对象实例")
            } else {
                console.log("httRequest创建成功")
                // 此处的getResult 后面没有(),getResult()就成调用函数了
                httpRequest.onreadystatechange = getResult;
                httpRequest.open("GET", "http://127.0.0.1:8080/testServlet", true);
                httpRequest.send(null);
            }
            return httpRequest;
        }

        function getResult() {
            if (httpRequest.readyState == 4) {
                // 这里是status 不是state,切记切记！！！！
                if (httpRequest.status == 200) {
                    alert(httpRequest.responseText);
                } else {
                    console.log("httpRequest.state = ", httpRequest.status);
                }
            } else {
                console.log("readyState = ", httpRequest.readyState);
            }
        }

        function checkHobby(value) {

        }
    </script>
</head>
<body>
    <select name="hobby" onchange="createHttpRequest()" >
        <option name="default">选择爱好</option>
        <option name="baskball">篮球</option>
        <option name="football">足球</option>
        <option name="draw">画画</option>
        <option name="sing">唱歌</option>
        <option name="dance">跳舞</option>
    </select>
</body>
</html>
