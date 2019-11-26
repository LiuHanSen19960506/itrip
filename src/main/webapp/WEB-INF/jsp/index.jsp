<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <base href="<%=basePath%>">
</head>
<body>
<h2>用户信息如下</h2>
<ul>
    <c:forEach items="${users}" var="u">
        <li>${u.id}</li>
        <li>${u.userCode}</li>
        <li>${u.userName}</li>
    </c:forEach>
</ul>
</body>
</html>
