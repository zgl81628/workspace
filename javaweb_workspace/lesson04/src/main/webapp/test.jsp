<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/13
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <% int a = 10;request.setAttribute("a",a);%>
   <%=a%>
   <h2>${a}</h2>

   <p>${a eq 12}</p>

   <p>${empty b}</p>

   <form action="show.jsp" method="post">
       <input type="text" name="uname"/>
       <button type="submit">保存</button>
   </form>
</body>
</html>
