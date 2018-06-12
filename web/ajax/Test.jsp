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
    <style type="text/css">
        #toolTip{
            position:absolute;;
            left: 331px;
            top: 39px;
            width: 98px;
            height: 48px;
            padding-top: 45px;
            padding-left: 25px;
            padding-right: 25px;
            z-index: 1;
            display: none;
            color: red;
        }
    </style>

    <script type="text/javascript">
        var httpRequest = null;
        function createHttpRequest(url){
            if(window.XMLHttpRequest) {
                httpRequest = new XMLHttpRequest();
            } else {
                try{
                    httpRequest = new ActiveXObject("Msxml2.XMLHTTP");
                } catch (e) {
                    try {
                        httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
                    } catch (e) {}
                }
            }
            if (!httpRequest) {
                alert("XMLHTttpRequest创建失败");
            } else {
                httpRequest.onreadystatechange = getResult;
                httpRequest.open("GET", url, true);
                httpRequest.send(null);
            }
        }

        function getResult() {
            if (httpRequest.readyState == 4) {
                if (httpRequest.status == 200) {
                    document.getElementById("toolTip").innerHTML=httpRequest.responseText;
                    document.getElementById("toolTip").style.display = "block";
                } else {
                    console.log("httpRequest.statusText = ", httpRequest.statusText);
                }
            } else {
                console.log("httpRequest.readyState = ", httpRequest.readyState);
            }
        }

        function checkUser(userName) {
            if (userName && userName.value) {
                createHttpRequest("/ajax/checkUser.jsp?user="+userName.value);
            } else {
                alert("请输入用户名");
            }
        }
    </script>
</head>
<body>
    <form method="post" action="" name = "form">
        用户名：<input name="username" type="text" id="username" size="32" onblur="checkUser(form.username)"> <div id="toolTip"></div><br>
        密码：<input name="password" type="password" id="password" size="35">
    </form>
</body>
</html>
