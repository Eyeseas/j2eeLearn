<%--
  Created by IntelliJ IDEA.
  User: pphu
  Date: 2018/7/14
  Time: 下午3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SearchBook</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css" />
</head>
<body>
<div id="page">

    <form id="searchForm" method="get" action="SearchServlet">
        <fieldset>
            <input id="s" type="text" name="bookname"/>
            <input type="submit" value="Submit" id="submitButton" />

        </fieldset>
    </form>
    <div id="resultsDiv"></div>
</div>
<script src="js/jquery.min.js"></script>

</body>
</html>
