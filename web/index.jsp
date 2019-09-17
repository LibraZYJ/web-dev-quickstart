<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/9/17
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  首页

  <h3>欢迎您：${pageContext.request.getAttribute("username")}</h3>
  <h3>您的密码：${pageContext.request.getAttribute("password")}</h3>
  <h3>这里是response跳转用户名:<%=session.getAttribute("username")%>

    <a href="login.html">点击返回登陆</a></h3>
<%--    <a href="login.html" target="_blank">返回登陆界面</a>--%>
  </body>
</html>
