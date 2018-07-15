package com.kong.useJsoup.view;

import com.kong.useJsoup.model.parseBookDetial;
import org.jsoup.nodes.Document;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ParseBookServlet")
public class ParseBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookid");
        System.out.println(bookId);
        parseBookDetial pbd = new parseBookDetial();
        pbd.setBookId(bookId);

        Document document = pbd.bookTitle();
        request.setAttribute("allDet",document);
        request.getRequestDispatcher("bookDetial.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
