package com.kong.useJsoup.view;

import com.kong.useJsoup.model.search;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

;
import java.io.IOException;
import java.util.List;

public class SearchServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String bookname = request.getParameter("bookname");
        search sr = new search();
        sr.setName(bookname);
        sr.setUrl("https://www.biquge5200.cc/modules/article/search.php?searchkey=");
        List res = sr.getSearch();

        request.setAttribute("searchKeyWord",bookname);
        request.setAttribute("dddd",res);
        request.getRequestDispatcher("searchresult.jsp").forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
