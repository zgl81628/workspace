<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/16
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <c:if test="${empty sessionScope.uname}">
       <jsp:forward page="login.jsp"></jsp:forward>
   </c:if>

  <h2>项目收益</h2>
</body>
</html>
