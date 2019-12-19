<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/16
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="utf-8">
    <title>test</title>
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/jquery.cookie.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#c1").val($.cookie("today"));
            $("#c2").val($.cookie("count"));
        })
    </script>
</head>
<body>

  <h2>显示访问时间</h2>
  <input type="text" id="c1"/>
  <h2>显示访问次数</h2>
  <input type="text" id="c2"/>
</body>
</html>
