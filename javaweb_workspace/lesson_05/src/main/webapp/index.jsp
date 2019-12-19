<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="utf-8">
    <title>Title</title>
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/jquery.cookie.js"></script>
    <script type="text/javascript">
          $(function () {
              $("#city").val($.cookie("name"));
          })
    </script>
</head>
<body>
  <h2>显示cookie信息</h2>
  <%
      Cookie[] cookies = request.getCookies();
     // String str = Arrays.asList(cookies).stream().filter(cookie -> cookie.getName().equals("name")).findFirst().get().getValue();

      for (Cookie c: cookies) {
          if(c.getName().equals("name"))
          {
              String str = URLDecoder.decode(c.getValue(),"UTF-8");
              request.setAttribute("code",str);
          }
      }
  %>

  <h2>java显示方式:${code} </h2>
  <h2 id="show_id"> jquery显示方式:</h2>
  <input type="text" id="city">
</body>
</html>