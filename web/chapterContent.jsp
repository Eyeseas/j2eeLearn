<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pphu
  Date: 2018/7/16
  Time: 上午10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
    <style>
        body{
            background: #e9faff;
        }
        .articleBox{
            width: 1280px;
            border:2px solid #88c6e5;
            margin:60px auto;
        }
        .headline{
            height: 100px;
            border-bottom:1px dashed #88c6e5;
        }
        .title{
            text-align: center;
        }
        a{
            text-decoration: none;
            color: #4cb688;
        }

        a:hover{
            text-decoration:underline;
        }

        .prev{
            padding-left: 480px;
        }
        .articleName{
            padding-left: 80px;
        }
        .next{
            padding-left: 80px;
        }
        .articleList{
            padding-left:70px;
        }
        .list .next{
            padding-left:70px;
        }
        .mainbody{
            color:#555555;
            font-family: "微软雅黑";
            font-size: 30px;
            border-bottom: 1px dashed #88c6e5;
        }
        .mainbody p{
            padding-left:90px;
            padding-right:90px ;
            text-indent: 60px;
        }
        .list{
            height:60px;
            line-height: 60px;
        }
        .footer{
            width: 1280px;
            margin:0 auto;
        }
        .footer ul{
            list-style:none;
            text-align:center;
        }
    </style>
</head>
<body>
<div class="articleBox">
    <div class="headline">
        <h1 class="title">${chapterTitle}</h1>
        <a class="prev" href="">上一章</a>
        <a class="articleName" href="">章节目录</a>
        <a class="next" href="">下一章</a>
    </div>
    <div class="mainbody">
        <c:out value="${content}" escapeXml="false"></c:out>
    </div>
    <div class="list">
        <a class="prev" href="">上一章</a>
        <a class="articleList" href="">章节目录</a>
        <a class="next" href="">下一章</a>
    </div>
</div>
<div class="footer">
    <ul>
        <li>免责声明:本站所收录作品，社区话题，书库评论以及本站广告均属个人行为，与本站立场无关</li>
        <li>Copyright@2018 PPhu.com All Rights Reserved.</li>
        <li>站长统计</li>
    </ul>
</div>
</body>
</html>
