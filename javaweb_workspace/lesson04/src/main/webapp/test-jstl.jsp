<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/13
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,6);
       request.setAttribute("list",list);
       request.setAttribute("str2","a|b|c|d|e");
    %>
    <c:set var="str" value="hello jstl!!!"></c:set>
    <c:set var="sc" value="80"></c:set>
    <%--<c:set var="arr" value="[1,2,3,4,5,7]"></c:set>--%>

   <c:if test="${!empty str}">
       <h2> <c:out value="${str}"></c:out></h2>
   </c:if>
   <c:choose>
       <c:when test="${sc>=90}">
           <h2>你很优秀</h2>
       </c:when>
       <c:when test="${sc>=80}">
           <h2>你很良好</h2>
       </c:when>
       <c:when test="${sc>=70}">
           <h2>你很一般</h2>
       </c:when>
       <c:when test="${sc>=60}">
           <h2>你及格</h2>
       </c:when>
       <c:otherwise>
           <h2>你挂了不及格!!!!</h2>
       </c:otherwise>
   </c:choose>
    <c:forEach begin="1" end="10" step="1">
        <h2>hello</h2>
    </c:forEach>

   <c:forEach var="elm" items="${list}" varStatus="status">
       <c:out value="${elm}"/>---- <c:out value="${status.index}"/>
   </c:forEach>
    <br/>
   <c:forTokens var="s" items="${str2}" delims="|">
       <c:out value="${s}"/>
   </c:forTokens>

    <%--<c:url value="show.jsp?uname=neuedu&status=1" var="queryURL"/>--%>
    <%--<a href="${queryURL}">查询</a>--%>
    <%--<c:redirect url="${queryURL}"/>--%>


    <fmt:setLocale value="zh_CN" /><br/>
    <fmt:formatDate value="<%=new Date()%>"/><br/>
    <fmt:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd HH:mm:ss" /><br/>
    <fmt:formatDate value="<%=new Date()%>" type="both" dateStyle="full"/><br/>
    <fmt:formatDate value="<%=new Date()%>" type="both" timeStyle="medium"/><br/>

</body>
</html>
