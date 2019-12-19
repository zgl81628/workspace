<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/13
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%! public int sum(int a, int b)
   {
       return a+b;
   }

   List<String> list = new ArrayList<String>();
   %>

   <h2><%=sum(2,3)%></h2>

   <h2><%=2+3%></h2>
<h2>啥地方规划</h2>
<%--<%@ include file="index.jsp"%>--%>

<jsp:include page="index.jsp"></jsp:include>
</body>
</html>
