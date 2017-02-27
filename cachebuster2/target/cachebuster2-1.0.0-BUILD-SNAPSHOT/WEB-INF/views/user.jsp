<%--
  Created by IntelliJ IDEA.
  User: wxl19
  Date: 2017/2/24
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>user form</title>
</head>
<body>
<s:form commandName="user" action="/valid2/signup" method="post">
<s:errors path="*"/><br>
    用户名:<s:input path="name"></s:input><s:errors path="name"></s:errors>
    <button type="submit">验证</button>
</s:form>
</body>
</html>
