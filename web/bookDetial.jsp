<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pphu
  Date: 2018/7/15
  Time: 上午9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍详情</title>
    <style>
        /* 清除浏览器自带的边距 */
        body{
            background: #e9fbff;
            padding:0;
            margin:0;
            font-family: "宋体";
        }
        /* 清除一些块级标签自带的内外边距 */
        h1,h2,h3,h4,h5,h6,p,ul,ol,dl,dt,dd,li,form{
            padding:0;
            margin:0;
        }
        /* h标签不加粗 */

        /* 清除ul前的小黑点，ol前面的序号 */
        ul,ol{
            list-style: none;
        }
        /* 清除a标签自带的下划线 */
        a{
            text-decoration:none;
            cursor:pointer;
        }
        img{
            display: block;
        }

        #name{
            width: 976px;
            height: 248px;
            margin:auto;
            margin-top:50px;
            border: 2px solid #89c7e5;
            position:relative;

        }

        #title{
            width: 976px;
            height: 40px;
            border-bottom:1px solid #89c7e5;
        }

        #title p{
            line-height:40px;
            font-size:12px;
            margin-left:5px;
        }

        #title a{
            color:#6e78a7;
            margin:0 5px;
        }

        #introduction{
            margin: 0;
            width: 976px;
            height: 207px;
            position:absolute;
        }

        #picture{
            width: 150px;
            height: 183px;
            background: #e1eded;
            position:absolute;
            top: 12px;
            left: 12px;
            background-position:center center;
            background-repeat:no-repeat;
            background-image: url("${img}");

        }

        #information{
            width: 788px;
            height: 104px;
            position: absolute;
            left: 190px;
            top: 20px;
            color: #545454;
        }

        #information h1{
            font-weight: bolder;
            font-size: 26px;
            color:#545454;
            line-height: 35px;
        }

        #txt p{
            margin-top: 5px;
            font-size: 14px;
            line-height: 25px;
        }

        #txt #p1{
            border-bottom:1px dashed #89c7e5;
        }

        #txt #p2{
            padding:10px 30px;
            font-size: 12px;
        }


        #txt span{
            display: inline-block;
            width: 350px;
        }

        #txt b{
            font-weight: normal;
            color: #333;
        }

        #txt p a{
            color: #6e78a7;
        }


        #chapter{
            margin: 10px auto;
            width: 966px;
            padding: 0 5px;
            border: 2px solid #89c7e5;
        }

        #chapter dt{
            text-align: center;
            font-size: 14px;
            color:#444444;
            line-height: 28px;
            background: #c3dfea;
            padding: 5px 10px;
        }

        #chapter dd{
            display: inline-block;
            width: 315px;
            height: 30px;
            border-bottom: 1px dashed #cdcdcd;
        }

        #chapter dd a{
            color:#444444;
            font-size: 12px;
        }

    </style>
</head>
<body>
<div id="name">
    <div id="introduction">
        <!-- 书籍封面 -->
        <div id="picture"></div>
        <!-- 书籍简介 -->
        <div id="information">
            <h1>${bookname}</h1>
            <div id="txt">
                <p>
                    <span>${author}</span>

                </p>
                <p id="p1">
                    <span>${updatetime}</span>

                </p>
                <p id="p2">
                    ${intro}
                </p>
            </div></div>
    </div>
</div>

<!-- 章节名称 -->
<div id="chapter">
    <dl>
        <dt>全部章节</dt>
        <c:forEach items="${allChapter}" var="chap" varStatus="st">
            <c:out value="${chap}" escapeXml="false"></c:out>
        </c:forEach>
    </dl>
</div>

    <%--<c:forEach items="${allDet}" var="lis" varStatus="st">--%>
        <%--<c:out value="${lis}" escapeXml="false" ></c:out>--%>
    <%--</c:forEach>--%>




    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
        // 处理每一个章节的a标签
        $("#chapter dd a").each(function () {
            this.href = "ChapterContentServlet?chapter="+this.pathname.substring(1,this.pathname.length-5);
        })
    </script>
</body>
</html>
