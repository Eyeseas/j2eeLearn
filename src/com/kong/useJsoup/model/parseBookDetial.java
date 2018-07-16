package com.kong.useJsoup.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class parseBookDetial {

    private String bookId;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }



//    获取整个页面文档
    public Document getConnect() throws IOException {
        return Jsoup.connect("https://www.biquge5200.cc/"+bookId).get();
    }

//    处理头部简介

    public List parseHead() throws IOException {
        List titlePart = new ArrayList();

        Document doc = getConnect();

        //        小说名称
        Element title1 = doc.getElementById("info");
        Elements bookNameEl = title1.getElementsByTag("h1");
        String bookName = bookNameEl.html();
        titlePart.add(bookName);

        Elements authorTimer = title1.getElementsByTag("p");
        String authorName = authorTimer.get(0).html();
        String updateTime = authorTimer.get(2).html();

        titlePart.add(authorName);
        titlePart.add(updateTime);

        Element title2 = doc.getElementById("intro");
        Elements introduce = title2.getElementsByTag("p");
        String intro = introduce.html();

        titlePart.add(intro);

        return titlePart;


    }


}
