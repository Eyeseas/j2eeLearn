package com.kong.useJsoup.view;

import com.kong.useJsoup.model.bookContent;
import org.jsoup.nodes.Document;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ChapterContentServlet")
public class ChapterContentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String chapterId = request.getParameter("chapter");
        bookContent bk = new bookContent();
        bk.setChapterId(chapterId);

//        接收来自NextPrevServlet传的值
        String prevchapter = (String)this.getServletContext().getAttribute("prev");
        String nextchapter = (String)this.getServletContext().getAttribute("next");

        request.setAttribute("title",bk.getTitle());
        request.setAttribute("chapterTitle",bk.getChapterTitle());
        request.setAttribute("content", bk.getContent());
        request.setAttribute("prev",prevchapter);
        request.setAttribute("next",nextchapter);
        request.getRequestDispatcher("chapterContent.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
