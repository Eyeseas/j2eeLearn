package com.kong.useJsoup.view;

import com.kong.useJsoup.model.bookContent;
import org.jsoup.nodes.Document;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ChapterContentServlet")
public class ChapterContentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String chapterId = request.getParameter("chapter");
        //System.out.print(chapterId);
        bookContent bk = new bookContent();
        bk.setChapterId(chapterId);


        request.setAttribute("title",bk.getTitle());
        request.setAttribute("chapterTitle",bk.getChapterTitle());
        request.setAttribute("content", bk.getContent());
        request.getRequestDispatcher("chapterContent.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
