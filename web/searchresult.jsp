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

      <link rel="stylesheet" href="css/pphuResult.css">
  </head>
  <body>
    <div class="top">
      <div class="headline">
          <p class="line">PPhu</p>
      </div>

    </div>
    <div class="container">
        <div class="searchName">
            <p>搜索"<c:out value="${searchKeyWord}"></c:out>"结果</p>
        </div>
        <table id="bookList">
            <tbody>
            <c:forEach items="${dddd}" var="book" varStatus="st">
                <c:out value="${book}" escapeXml="false"/>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="footer">
        <ul class="container">
            <li>免责声明:本站所收录作品，社区话题，书库评论以及本站广告均属个人行为，与本站立场无关</li>
            <li>Copyright@2018 PPhu.com All Rights Reserved.</li>
            <li>站长统计</li>
        </ul>
    </div>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/common.js"></script>

  </body>
</html>
