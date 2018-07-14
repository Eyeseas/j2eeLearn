<%--
  Created by IntelliJ IDEA.
  User: pphu
  Date: 2018/7/14
  Time: 上午9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>搜索结果</title>
    <link rel="stylesheet" href="css/pphu.css">
  </head>
  <body>
    <div class="container">
        <table id="bookList">
            <tbody>
            <c:forEach items="${dddd}" var="book" varStatus="st">
                <c:out value="${book}" escapeXml="false"/>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/common.js"></script>
  </body>
</html>
