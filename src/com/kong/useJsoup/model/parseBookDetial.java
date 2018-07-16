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


//    小说名称
    public String getBookName() throws IOException {
        Document doc = getConnect();

        Element title1 = doc.getElementById("info");
        Elements bookNameEl = title1.getElementsByTag("h1");
        String bookName = bookNameEl.html();
        return bookName;
    }
//    作者名称
    public String getAuthorName() throws IOException {
        Document doc = getConnect();

        Element title1 = doc.getElementById("info");
        Elements authorTimer = title1.getElementsByTag("p");
        String authorName = authorTimer.get(0).html();

        return authorName;
    }
//    更新时间
    public String getUpdateTime() throws IOException {

        Document doc = getConnect();

        Element title1 = doc.getElementById("info");
        Elements authorTimer = title1.getElementsByTag("p");
        String updateTime = authorTimer.get(2).html();

        return updateTime;
    }
//    书籍简介
    public String bookIntro() throws IOException {
        Document doc = getConnect();

        Element title2 = doc.getElementById("intro");
        Elements introduce = title2.getElementsByTag("p");
        String intro = introduce.html();

        return intro;
    }

    public String bookImg() throws IOException {
        Document doc = getConnect();

        Element img = doc.getElementById("fmimg").getElementsByTag("img").get(0);
        String imgUrl = img.attr("src");

        return imgUrl;

    }


    //处理小说章节

    public List parseChapter() throws IOException{
        List chapterPart = new ArrayList();
        Document doc = getConnect();

        List chapters = doc.getElementsByTag("dd");
        for (int i=0;i<9;i++){
            chapters.remove(0);
        }

        return chapters;

    }


}
